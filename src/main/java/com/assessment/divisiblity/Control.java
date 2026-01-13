package com.assessment.divisiblity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Control 
{
    @GetMapping("/process")
    public ResponseEntity<List<String>> parsing
    (
        @RequestParam String start,
        @RequestParam String end
    )
    {
    List<String> err=new ArrayList<>();
    Integer first=null;
    Integer last=null;
    try
    {
        first=Integer.parseInt(start);
    }
    catch(NumberFormatException excep)
    {
        err.add(start + " is not a valid input. Start is expecting an integer value.");
    }
    try 
    {
       last=Integer.parseInt(end); 
    } 
    catch(NumberFormatException excep)
    {
        err.add(end + " is not a valid input. End is expecting an integer value.");
    }
    if (!err.isEmpty())
    {
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    List<String> res = new ArrayList<>();
    int step;
    if (first<=last)
    {
        step=1;
    }
    else
    {
        step=-1;
    }
    for(int i=first; ;i=i+step)
    {
        if(i%3==0 && i%5==0)
        {
            res.add("foobar");
        }
        else if(i%3==0)
        {
            res.add("foo");
        }
        else if(i%5==0)
        {
            res.add("bar");
        }
        else
        {
            res.add(String.valueOf(i));
        }
        if (i==last)
        {
            break;
        }
    }
    return ResponseEntity.ok(res);
 }
}
