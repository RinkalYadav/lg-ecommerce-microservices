# LG E-Commerce Microservices

LG E-Commerce is a backend microservices project built using Java and Spring Boot.

The project demonstrates a production-style e-commerce backend using independent microservices, service discovery, centralized configuration, API Gateway, security, messaging, caching, testing, containerization, CI/CD and cloud deployment.

## Technology Stack

### Backend
- Java 17
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Hibernate
- Spring Security
- REST APIs

### Database
- MySQL

### Microservices Infrastructure
- Eureka Server
- Spring Cloud Config
- Spring Cloud Gateway

### Messaging
- Apache Kafka

### Caching
- Redis

### Testing
- JUnit
- Mockito
- Spring Boot Test

### Code Quality
- SonarQube

### DevOps
- Docker
- GitHub Actions
- AWS

### Build Tool
- Maven

### Version Control
- Git
- GitHub

## Planned Microservices

| Service | Responsibility |
|---|---|
| API Gateway | Entry point for client requests |
| Config Server | Centralized configuration |
| Eureka Server | Service discovery |
| User Service | User management |
| Product Service | Product management |
| Inventory Service | Inventory management |
| Cart Service | Shopping cart management |
| Order Service | Order management |
| Payment Service | Payment processing |

## Project Structure

```text
lg-ecommerce-microservices/
│
├── api-gateway/
├── config-server/
├── eureka-server/
├── user-service/
├── product-service/
├── inventory-service/
├── cart-service/
├── order-service/
├── payment-service/
│
├── .gitignore
├── README.md
└── pom.xml


## LG-101 Completion

LG-101 establishes the initial repository structure, Maven configuration,
Java 17 configuration, Git workflow and project documentation.