# Spring Boot JWT Authentication Example

This repository provides a complete JWT Authentication example using Spring Boot and Spring Security.
It is useful for beginners learning JWT, stateless authentication, and REST API security.

##  Features

- User authentication using **JWT (JSON Web Token)**
- Stateless session management
- Login API to generate JWT token
- Secured REST APIs using Spring Security
- Password encryption using **BCrypt**
- In-memory user authentication (can be extended to DB)
- Custom JWT filter and authentication entry point

---

##  Tech Stack

- Java 21  
- Spring Boot 4  
- Spring Security  
- JJWT (io.jsonwebtoken)  
- Maven  

---

##  Default Users (In-Memory)

| Username | Password | Role  |
|--------|----------|-------|
| raiyan | raiyan   | ADMIN |
| shifa  | shifa    | ADMIN |

---

##  API Endpoints

###  Login (Generate Token)
**POST** `/auth/login`

```json
{
  "username": "raiyan",
  "password": "raiyan"
}

Authorization: Bearer <JWT_TOKEN>

⚙️ How to Run

Clone the repository

git clone https://github.com/raiyan-nodoliya/jwt-authentication-spring-boot.git


Go to project directory

cd jwt-authentication-spring-boot


Build and run

mvn clean install
mvn spring-boot:run


App will start at:

http://localhost:8080


