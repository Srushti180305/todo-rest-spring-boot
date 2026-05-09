# TodoFlow - REST API

A full stack Todo application built with Spring Boot and MySQL.

## Tech Stack
- Java 17
- Spring Boot 3.4.4
- MySQL
- HTML, CSS, JavaScript

## Features
- User Registration & Login
- Session based Authentication
- Create, Read, Update, Delete Tasks
- Task status tracking (PENDING / COMPLETED)

## How to Run
1. Make sure MySQL is running on port 3306
2. Run `mvnw.cmd spring-boot:run`
3. API runs on `http://localhost:8055`

## API Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| POST | /api/auth/register | Register user |
| POST | /api/auth/login | Login |
| POST | /api/auth/logout | Logout |
| GET | /api/tasks | Get all tasks |
| POST | /api/tasks | Create task |
| PUT | /api/tasks | Update task |
| DELETE | /api/tasks/{id} | Delete task |