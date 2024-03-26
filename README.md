Tech Stack: The project is developed using Java with Spring Boot framework, specifically Spring MVC architecture, for building RESTful APIs. Spring Boot provides rapid development capabilities and simplifies configuration.
Database: MySQL is chosen as the database management system for its reliability, performance, and ease of integration with Spring Boot applications.
Design Decisions and Challenges:

Layered Architecture: The project follows a layered architecture with separate layers for entities, repositories, services, controllers, and DTOs. This promotes modularity, separation of concerns, and maintainability.
Dependency Injection: Spring's dependency injection mechanism is utilized to wire up components, making the codebase more modular and easier to test.
External API Integration: The project integrates with external APIs for weather data retrieval and distance calculation. This adds complexity to the system but enhances functionality by providing real-time weather information and accurate distance calculations.
Error Handling: Robust error handling mechanisms are implemented to gracefully handle exceptions, especially during interactions with external APIs and database operations.
Setting Up and Running the Project:

The project can be set up by cloning the repository from GitHub and importing it into an IDE such as IntelliJ IDEA.
Ensure that MySQL database is installed and configured with appropriate credentials.
Update the application.properties file with database connection details.
Run the project as a Spring Boot application.
API Endpoints:

/events: POST endpoint to add events into the system.
/events/find: GET endpoint to list events based on user's geographical location and specified date.
Request/Response Formats:

Request format for adding events: JSON format containing event details.
Response format for listing events: JSON format containing event details including event name, city, date, weather, and distance from user's location.
Error Codes:

HTTP status codes are used to indicate the success or failure of API requests.
Additional error codes and error messages are provided in case of exceptions or validation failures.
Execution of Test Case:

A screen recording or screenshots demonstrating the execution of the provided test case through the API will be included in the project documentation. This ensures that the system functions as expected and meets the requirements specified in the assignment instructions.
Overall, the Event Management System is designed to efficiently manage and query event data, providing users with relevant information based on their geographical location and specified date. The use of Spring Boot framework and MySQL database ensures scalability, reliability, and ease of development and deployment.
