🚀 API Gateway Simulation System – Spring Boot

The **API Gateway Simulation System** is a Spring Boot application that simulates the behavior of an API Gateway.

It receives HTTP requests, validates them using a custom API key header, routes them to simulated internal services (User, Order, Product), and logs all requests into a database.

This project follows a clean **layered architecture** and demonstrates enterprise-level backend structure.

---

🎯 Objective

- Accept incoming HTTP requests
- Route requests based on URL path
- Simulate:
  - User Service (`/api/users`)
  - Order Service (`/api/orders`)
  - Product Service (`/api/products`)
- Validate custom header `X-API-KEY`
- Log request details into database
- Provide endpoint to view logs

---

## 🏗 Architecture

The project follows **Layered Architecture**:
Additional layers:
- Filter Layer (API Key Validation)
- Exception Handling Layer
- DTO Layer
- Config Layer

---

## 📁 Project Structure

com.gateway
│
├── controller
├── service
├── service.impl
├── repository
├── entity
├── dto
├── filter
├── exception
├── config
└── ApiGatewaySimulationApplication.java


---

 🛠 Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (or MySQL)
- Maven
- Jakarta Persistence (JPA)

---

 🔐 Security Feature

The application uses a **custom API Key Filter**.

 Required Header: X-API-KEY: 123456

 
If the header is:
- Missing → Returns `401 Unauthorized`
- Invalid → Returns `401 Unauthorized`

---

## 🗄 Database

- In-memory database
- Console available at:

http://localhost:8080/

### Request Logs Table

Stores:
- id
- requestPath
- method
- timestamp
- status

---

## 📌 API Endpoints
User Service
GET /api/users - Get all users
GET /api/users/{id} - Get user by ID
Order Service
GET /api/orders - Get all orders
GET /api/orders/{id} - Get order by ID

Product Service
GET /api/products - Get all products
GET /api/products/{id} - Get product by ID

Log Management (CRUD Operations)
GET /api/logs - Get all logs
GET /api/logs/path?path=/api/users - Filter logs by path
GET /api/logs/method?method=GET - Filter logs by HTTP method
GET /api/logs/status?status=200 - Filter logs by status code
GET /api/logs/statistics - Get log statistics
DELETE /api/logs - Delete all logs
