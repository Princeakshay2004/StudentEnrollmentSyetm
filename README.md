# Student Enrollment System

This is a basic Spring Boot project that includes MVC, Security, and Spring Data support. It manages Students and Subjects with REST API endpoints and implements JWT-based security with two roles: student and admin. An in-memory H2 database is used for data persistence.

## Features

- **Entities:**
  - `Student` (name, address)
  - `Subject` (name)
  - A student can enroll in multiple subjects
  - Entity relationship between `Student` and `Subject`

- **REST API:**
  - Create a Student
  - Get list of all Students
  - Get list of all Subjects

- **Security:**
  - Two roles: student and admin
  - JWT-based login for both roles

- **Database:**
  - Relational DB with JPA
  - In-memory H2 database

## Prerequisites

- Java Development Kit (JDK) 19+
- Maven 3.6+

## Project Setup

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/Princeakshay2004/StudentEnrollmentSyetm.git
    cd StudentEnrollmentSyetm
    ```

2. **Build the Project:**
    ```bash
    mvn clean install
    ```

3. **Run the Application:**
    ```bash
    mvn spring-boot:run
    ```

## Usage

### Accessing the Application

- The application runs on `http://localhost:8080`.

### Endpoints

- **Student Endpoints:**
  - `POST /students`: Create a new student
  - `GET /students`: Get list of all students

- **Subject Endpoints:**
  - `GET /subjects`: Get list of all subjects

### Security

- **JWT Authentication:**
  - Use `/auth/login` to obtain a JWT token for authentication.
  - Include the token in the `Authorization` header for accessing secured endpoints.


