#  My First Spring Boot Application

Welcome to my Spring Boot learning journey! This project is my first steps into the world of enterprise Java development. From "Hello World" to handling dynamic web requests, and i have just built something awesome!


## What I Have Built

A simple REST API using Spring Boot that demonstrates:
- Basic web controllers
- URL routing and mapping
- Dynamic path variables
- Clean project structure following Spring Boot conventions

This is a foundation for building enterprise-grade applications!

##  Prerequisites

Before you start, make sure you have:
- ☑️ Java 8 or higher (we recommend Java 17)
- ☑️ IntelliJ IDEA (Community or Ultimate)
- ☑️ Maven (included with IntelliJ)
- ☑️ A curious mind and willingness to learn!

##  Getting Started

### 1. Clone or Download
If you're sharing this project, extract it to your desired location.

### 2. Open in IntelliJ
```bash
# Navigate to your project directory
cd my-first-springboot
   
   or
# Open IntelliJ and select "Open" -> Choose this folder
```

### 3. Let Maven Do Its Magic
IntelliJ will automatically:
- Download dependencies
- Index your project
- Set up the build configuration

Wait for the indexing to complete (progress bar at bottom of IDE).

##  Project Structure

```
my-first-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/myfirstspringboot/
│   │   │   ├── MyFirstSpringbootApplication.java    #  Main application
│   │   │   ├── HelloController.java                 #  Basic web controller
│   │   │   └── StudentController.java               #  Student management API
│   │   └── resources/
│   │       └── application.properties               # ⚙ App configuration
│   └── test/
├── pom.xml                                          #  Maven dependencies
└── README.md                                        #  You are here!
```

##  API Endpoints

### HelloController Endpoints
| Method | Endpoint        | Description           | 
|--------|-----------------|-----------------------|
| GET | `/`             | Welcome message       |
| GET | `/bye`          | bye msg endpoint      | 
| GET | `/greet/{name}` | Personalized greeting |

### StudentController Endpoints
| Method | Endpoint | Description        |
|--------|----|--------------------|
| GET | `/student` | System info        | 
| GET | `/student/count` | Total students     |
| GET | `/student/{id}` | Find student by ID |
| GET | `/student/{name}/{course}` | Student Courses    | 

##  Key Concepts Learned

### Spring Boot Annotations
- `@SpringBootApplication` - The main place that starts everything it bootstraps the whole app.
- `@RestController` - Makes your class handle web requests
- `@GetMapping` - Maps HTTP GET requests to methods
- `@PathVariable` - Captures dynamic parts of URLs

### Core Principles
- **Convention over Configuration** - Spring Boot sets up sensible defaults
- **Component Scanning** - Spring automatically finds your controllers
- **Dependency Injection** - Spring manages your application components
- **Embedded Server** - No need for external Tomcat/Jetty setup

##  Running the Application

### Method 1: IntelliJ (Recommended)
1. Open `MyFirstSpringbootApplication.java`
2. Right-click → Run 'MyFirstSpringbootApplication'
3. Watch the console for startup messages

### Method 2: Maven Command Line
```bash
./mvnw spring-boot:run
```

### Method 3: Java JAR (After building)
```bash
./mvnw clean package
java -jar target/my-first-springboot-0.0.1-SNAPSHOT.jar
```

** Success Indicators:**
- Spring Boot banner appears in console
- "Started MyFirstSpringbootApplication in X seconds"
- Application running on port 8081

##  Testing Your Endpoints

### Using Your Browser
Visit these URLs:
```
http://localhost:8081/
http://localhost:8081/bye
http://localhost:8081/greet/YourName
http://localhost:8081/student
http://localhost:8081/student/count
http://localhost:8081/student/PutAnyNumberAsId
http://localhost:8081/student/YourName/Course
```

##  Configuration

### Port Configuration
Change server port in `application.properties`: You can just put what you like, for me I changed from default to 8081
```properties
server.port=8081

# Other useful configurations
spring.application.name=my-first-springboot
```

##  Common Issues & Solutions

### "Whitelabel Error Page"
**Problem:** Missing `@RestController` annotation  
**Solution:** Ensure all controller classes have `@RestController`

### "404 Not Found"
**Problem:** Controller not in same package as main application  
**Solution:** Keep controllers in `com.example.myfirstspringboot` package

### "Port Already in Use"
**Problem:** Another application using port 8081  
**Solution:** Change port in `application.properties` or stop other apps


##  Contributing

Since this is a learning project! Feel free to:
- Add new endpoints
- Experiment with different response types
- Try new Spring Boot features
- Break things and fix them, add comments we are learning as a team 

##  Resources

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Boot Guides](https://spring.io/guides)
- [Baeldung Spring Boot Tutorials](https://www.baeldung.com/spring-boot)

##  Congratulations!
Well if you have stayed and do all the above then it is time for your flowers Congrats. 

You've successfully created your first Spring Boot application! From understanding annotations to building RESTful endpoints, you've started well your Spring Boot journey.

Remember: Every expert was once a beginner. Keep coding, keep learning, and don't be afraid to experiment!

---

**Yay, Happy Coding!** 

