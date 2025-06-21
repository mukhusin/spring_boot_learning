# Student Management System

A web-based student management system built with Jakarta EE and Spring Framework that allows managing schools, students,
and their profiles.

## Technologies Used

- Jakarta EE
- Spring MVC
- Spring Data JPA
- Java 17
- Maven

## API Endpoints

### Schools

- `POST /schools` - Create a new school
- `GET /schools` - Get list of all schools

### Students

- Create and manage student records with profile information
- Each student is associated with a school
- Students have properties like first name, last name, email, and age

## Project Structure

The project follows a standard Spring MVC architecture:

- `SchoolController` - REST endpoints for school management
- `StudentMapper/SchoolMapper` - DTO conversion utilities
- `Student/School` - JPA entities with relationships
- Data Transfer Objects (DTOs) for request/response handling

## Setup and Installation

1. Ensure you have Java 17 and Maven installed
2. Clone the repository
3. Run `mvn clean install`
4. Start the application using `mvn spring-boot:run`
5. Access the API endpoints through `http://localhost:8080`

## Database Schema

The system uses JPA entities with the following relationships:

- One-to-Many between School and Students
- One-to-One between Student and StudentProfile
