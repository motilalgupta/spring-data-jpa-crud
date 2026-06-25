# 🎓 Student Management REST API

A Spring Boot REST API that performs CRUD (Create, Read, Update, Delete) operations on Student records using Spring Data JPA and MySQL.

## 🚀 Features

* Create Student
* Get All Students
* Get Student By ID
* Update Student Details
* Update Student Name (PATCH)
* Delete Student
* MySQL Database Integration
* Spring Data JPA Repository

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Postman

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── StudentController
│
├── entity
│   └── Student
│
├── repository
│   └── StudentRepository
│
└── JpaApplication
```

## 📌 Student Entity

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
```

## 📡 API Endpoints

### Create Student

```http
POST /students
```

Request Body

```json
{
  "name": "Motilal Gupta",
  "email": "motilal@gmail.com"
}
```

### Get All Students

```http
GET /students
```

### Get Student By ID

```http
GET /students/{id}
```

### Update Student

```http
PUT /students/{id}
```

Request Body

```json
{
  "name": "Updated Name",
  "email": "updated@gmail.com"
}
```

### Update Student Name

```http
PATCH /students/{id}/name?name=Rahul
```

### Delete Student

```http
DELETE /students/{id}
```

## ⚙️ Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cfs
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Run Locally

Clone the repository:

```bash
git clone https://github.com/your-username/springboot-jpa-student-api.git
```

Move into project directory:

```bash
cd springboot-jpa-student-api
```

Run the application:

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

## 🎯 Learning Outcomes

* Spring Boot Fundamentals
* REST API Development
* Spring Data JPA
* MySQL Integration
* CRUD Operations
* Request Mapping Annotations
* Entity and Repository Pattern

## 👨‍💻 Author

Motilal Gupta
