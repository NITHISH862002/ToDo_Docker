# Todo Application
The Todo Application is a simple web application built on Spring Boot and HTML. It allows users to manage their tasks by creating, editing and deleting them.

## Requirements
* Java 17
* Gradle 8 or higher
* Docker 20.10 or higher
* Docker Compose 1.28 or higher
## Getting Started
### Building the Application
To build the application, run the following command:

 ```
  mvn clean package 
 
 ```
This will generate a JAR file in the target directory.

### Running the Application
To run the application locally, run the following command:

java -jar target/todo-0.0.1.jar
You can access the application at http://localhost:8080.

### Running the Application with Docker
To run the application with Docker, run the following command:
```
docker-compose -f Docker-Compose.yaml up
```
This will build and start the Docker containers for the application and a PostgreSQL database.

You can access the application at http://localhost:8080.

### Stopping the Application
To stop the application, press Ctrl + C in the terminal.

If you ran the application with Docker, run the following command to stop and remove the containers:
```
docker-compose down
```
Application Features
Creating a Task
To create a new task, click on the "Add Task" button on the homepage. Enter the task name and description and click "Save" to create the task.


Deleting a Task
To delete a task, click on the "Delete" button next to the task on the homepage. The task will be deleted permanently.
