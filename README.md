# Spring Boot MySQL and Redis Example

This is a simple Spring Boot application that demonstrates how to integrate MySQL for persistent storage and Redis for caching.

## Requirements

- Java 17
- MySQL
- Redis

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your_username/your_project.git
    ```

2. **MySQL Setup:**

    - Install MySQL and create a database.
    - Update `src/main/resources/application.properties` with your MySQL database configuration.

3. **Redis Setup:**

    - Install Redis.
    - Update `src/main/resources/application.properties` with your Redis configuration.

4. **Run the Application:**

    ```bash
    ./gradlew bootRun
    ```

5. **Access the API:**

   You can now access the API at [http://localhost:8080/products](http://localhost:8080/products). Use the `query` parameter to search for products by name, e.g., [http://localhost:8080/products?query=laptop](http://localhost:8080/products?query=laptop).

## Project Structure

- `src/main/java/com/example/demo`: Java source files.
    - `controller`: REST controller classes.
    - `model`: Entity classes.
    - `repository`: Spring Data JPA repositories.
    - `service`: Service classes.
- `src/main/resources`: Application properties and other resources.
- `build.gradle`: Gradle build configuration.

## Contributing

Contributions are welcome! Please feel free to submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
