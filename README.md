# RestFul Web Service

Hewlett Packard Enterprise Software Engineering Job Simulation on Forage - August 2024
- Wrote a proposal for a RESTful web service to manage a list of employees.
- Built a web server application in Java Spring Boot that can accept and respond to HTTP requests as well as support uploading JSON data.
- Developed and ran a set of unit tests to assess my Java Spring Boot application’s performance.

### Tech Stack:
- Java
- Java SpringBoot
- Gradle

### Want to try out?
1. To run the application, in the root directory run the gradle command
```
$ gradlew bootrun
```

2. To add employess, craft the curl cmd as follows
```
curl -X POST http://localhost:8080/employees -H "Content-Type: application/json"
-d "{ "employee_id": "YourId", "first_name": "YourFirstName", "last_name": "YourLastName", "email":"YourEmail","title": "YourTitle" }"
```

3. Want the run the unit test?
```
Go to src/test/java/com/example/RestServiceApplication directory and run 
$ gradlew test
```

  
