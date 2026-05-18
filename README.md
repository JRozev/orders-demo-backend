# Orders Demo Backend

Spring Boot demo backend project with:

* Spring Boot 3
* REST API
* H2 Database
* Spring Data JPA
* Maven

---

# Requirements

Installed on Linux:

* Java 17+
* Maven
* IntelliJ IDEA
---

# Running the Project

## Option 1 — IntelliJ IDEA

Open the project in IntelliJ.

Run:

```text
DemoApplication.java
```

using the green Run button.

---

## Option 2 — Terminal

Open terminal in the project root:

```bash
cd ~/IdeaProjects/demo
```

Run:

```bash
./mvnw spring-boot:run
```

or:

```bash
mvn spring-boot:run
```

---

# Application Port

The application currently runs on: http://localhost:8088


Configured in: src/main/resources/application.properties

properties server.port=8088
---

# H2 Database Console

Open: http://localhost:8088/h2-console

Connection settings:

JDBC URL: jdbc:h2:file:./data/testdb
User Name: sa
Password: (empty)
---

# Swagger-UI URL

Open: http://localhost:8088/swagger-ui/index.html#/

---

# Database Type

The project currently uses persistent H2 file database storage.

Configured in:

```properties
spring.datasource.url=jdbc:h2:file:./data/testdb
```

# Features

Current implemented features:

- CRUD operations for Orders
- Validation with @Valid and @NotBlank
- Custom validation error handling with @ControllerAdvice
- DTO support (OrderRequest / OrderResponse)
- Swagger/OpenAPI integration
- H2 file database persistence
- Bulk order insert endpoint
- Service → Repository architecture
- Global exception handling
- File-based H2 database with persistent demo Order records

---

# Next Steps

Planned features:

* PostgreSQL integration
* Angular frontend
* Pagination
* Filtering / Search endpoints
* Enum for Order Status
* Spring Security + JWT