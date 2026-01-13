Respected Sir,

I have implemented the Spring Boot application according to the requirements provided. The application provides a REST API that returns a sequence of numbers between a specified start and end, replacing numbers divisible by 3, 5, or both with "foo", "bar", or "foobar" respectively.

Implementation Details

1. The application uses @RestController to return responses in JSON format.

2. It uses @RequestMapping with the base path /api.

3. The @GetMapping annotation is used to obtain the start and end values, with the endpoint /process.

4. Input validation is performed using try/catch blocks to check if the parameters are numeric.

5. If both parameters are numbers, they are parsed into integers.

6. A step variable is used to determine whether the range is increasing or decreasing.

7. The divisibility logic is implemented as follows:

    (i). Divisible by both 3 and 5 → "foobar"

    (ii). Divisible by 3 only → "foo"

    (iii). Divisible by 5 only → "bar"

8. Otherwise → the number itself as a string

The result is a list of all values from start to end, with numbers modified according to the rules above.

API Details

Base path: /api

Endpoint: /process

Query parameters:

start → starting value

end → ending value

Example API Requests
http://localhost:8080/api/process?start=1&end=1
http://localhost:8080/api/process?start=3&end=3
http://localhost:8080/api/process?start=5&end=5
http://localhost:8080/api/process?start=15&end=15
http://localhost:8080/api/process?start=1&end=15
http://localhost:8080/api/process?start=15&end=-15
http://localhost:8080/api/process?start=a%20&end=b
http://localhost:8080/api/process?start=1&end=b
http://localhost:8080/api/process?start=a%20&end=1


Valid numeric input returns a list of numbers with "foo", "bar", or "foobar" replacements.

Invalid input returns a JSON array of error messages indicating which parameters are not valid integers.

<img width="1875" height="717" alt="image" src="https://github.com/user-attachments/assets/952d2222-d064-4437-9bb0-28f8c5370da8" />

<img width="1364" height="613" alt="image" src="https://github.com/user-attachments/assets/685d26ff-2177-465e-af15-1cb663dd541b" />

<img width="1005" height="477" alt="image" src="https://github.com/user-attachments/assets/ffb235ad-2eef-4c7d-ab66-970662b80ce7" />

<img width="927" height="579" alt="image" src="https://github.com/user-attachments/assets/9410338f-7c16-4f28-a314-a2a0b213c90e" />

<img width="1093" height="446" alt="image" src="https://github.com/user-attachments/assets/109d1e0d-bffd-42ce-b463-6d92ab25e154" />

<img width="1965" height="404" alt="image" src="https://github.com/user-attachments/assets/eaffc5f0-1769-4fb0-bc0e-35ec8ae95376" />

<img width="946" height="500" alt="image" src="https://github.com/user-attachments/assets/0ea81fb6-9f3c-40bf-a4e7-f118a372acbd" />

<img width="771" height="426" alt="image" src="https://github.com/user-attachments/assets/11d51387-cab9-40d3-9cc4-d0ec65157810" />

<img width="919" height="414" alt="image" src="https://github.com/user-attachments/assets/4e0c9f79-d736-4b58-b733-21ab2fc61fbe" />
