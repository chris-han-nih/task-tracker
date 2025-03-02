# Task Tracker
Task Tracker is a Spring Boot application designed to manage to-do lists through a simple API. It leverages Kotlin, and utilizes Kotest and MockK for testing. This project aims to provide a robust backend for tracking tasks efficiently.

## Requirements
- JVM 21
- Spring Boot v3.2.4
- Kotlin
- Kotest 5.8
- MockK 1.12

## Getting Started
To get started with the Task Tracker, clone this repository and ensure you have the appropriate JVM installed on your system.
```shell
git clone https://your-repository-url.com/task-tracker.git
cd task-tracker
```

## Build
Build the project using Gradle:
```shell
./gradlew build
```

## Running the Application
Start the server with the following command:
```shell
./gradlew bootRun
```

## API Usage
Once the server is running, you can interact with the API. Detailed API documentation will be provided separately. For now, here is a brief overview of the available endpoints:

- **GET /tasks**: Fetches a list of all tasks.
- **POST /tasks**: Creates a new task.
- **GET /tasks/{id}**: Retrieves a task based on its ID.
- **PUT /tasks/{id}**: Updates an existing task.
- **DELETE /tasks/{id}**: Deletes a task.

## TaskTrackerController
The `TaskTrackerController` class is responsible for handling incoming HTTP requests related to tasks. It provides endpoints for creating tasks and retrieving task information. The controller is located in `src/main/kotlin/chris/tasktracker/task/adapter/in/controller/TaskTrackerController.kt`.

## TaskCreateRequest
The `TaskCreateRequest` class represents the request payload for creating a new task. It includes fields such as title, memo, start date, due date, and status. The class is located in `src/main/kotlin/chris/tasktracker/task/adapter/in/model/TaskCreateRequest.kt`.

## TaskService
The `TaskService` class is responsible for the business logic related to tasks. It provides methods for creating, retrieving, updating, and deleting tasks. The service is located in `src/main/kotlin/chris/tasktracker/task/application/service/TaskService.kt`.

## Task
The `Task` class represents the domain model for a task. It includes fields such as id, title, memo, status, start date, and due date. The class is located in `src/main/kotlin/chris/tasktracker/task/domain/Task.kt`.

## TaskRepository
The `TaskRepository` interface provides methods for interacting with the database to perform CRUD operations on tasks. The interface is located in `src/main/kotlin/chris/tasktracker/task/framework/repository/TaskRepository.kt`.

## Contributing
Contributions are welcome! Please feel free to fork the repository, make changes, and submit pull requests.

## References
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Kotlin](https://kotlinlang.org/)
- [Kotest](https://kotest.io/)
- [MockK](https://mockk.io/)
