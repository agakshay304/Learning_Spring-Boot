```markdown
# Inventory API with Spring Boot

This project is a beginner-friendly RESTful API built with Java and Spring Boot, designed to manage a simple inventory system. It showcases fundamental concepts like creating REST endpoints, handling in-memory data with an `ArrayList`, and implementing a layered architecture using controllers and services. Perfect for those new to Spring Boot who want to learn microservices through a practical example.

## Features
- **REST Endpoints**:
  - `GET /inventory`: Retrieve all inventory items.
  - `GET /inventory/{id}`: Fetch a specific item by ID.
  - `POST /inventory`: Add a new item to the inventory.
  - `PUT /inventory/{id}/stock`: Update the stock quantity of an item.
- **In-Memory Storage**: Uses an `ArrayList` to manage inventory data.
- **Layered Design**: Separates logic into a controller (`HelloController`) and service (`InventoryService`) with dependency injection via `@Autowired`.

## Tech Stack
- **Java**: Core programming language with object-oriented principles.
- **Spring Boot**: Framework for rapid API development.
- **Maven**: Dependency management and build tool.

## How to Run
```
1. **Clone the Repository**:  
   ```bash
   git clone <your-repo-url>
   ```
2. **Navigate to the Project**:  
   ```bash
   cd inventory-api-spring-boot
   ```
3. **Run with Maven**:  
   ```bash
   mvn spring-boot:run
   ```
4. **Test Endpoints**: Use Postman or a browser at `http://localhost:8080/inventory`.

### Example API Calls
- **GET all items**:  
  URL: `http://localhost:8080/inventory`  
  Response:  
  ```json
  [
      {"id": 1, "name": "Book", "price": 10.99, "stock": 50},
      {"id": 2, "name": "Laptop", "price": 999.99, "stock": 10}
  ]
  ```
- **POST new item**:  
  URL: `http://localhost:8080/inventory`  
  Body:  
  ```json
  {"id": 3, "name": "Headphones", "price": 49.99, "stock": 20}
  ```
  Response: `"Added: Headphones"`

## Learning Outcomes
- Setting up a Spring Boot project from scratch.
- Building and testing REST APIs with GET, POST, and PUT methods.
- Understanding dependency injection and service layers in Spring.
- Creating a simple inventory management system.

## Project Structure
```
src/
├── main/
│   ├── java/com/example/hellospring/
│   │   ├── HelloController.java    # REST API endpoints
│   │   ├── InventoryService.java   # Business logic
│   │   ├── Item.java              # Data model
│   │   └── HelloSpringApplication.java # Main application
│   └── resources/
│       └── application.properties  # Configuration
pom.xml                             # Maven dependencies
```

## Future Enhancements
- Integrate a persistent database (e.g., H2 with JPA or a NoSQL option).
- Add input validation and error handling.
- Deploy to a cloud platform.

## Target Audience
Beginners in Java and Spring Boot, or anyone interested in learning RESTful API development with a hands-on project.
