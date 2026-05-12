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

JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (empty)
---

# Swagger-UI URL

Open: http://localhost:8088/swagger-ui/index.html#/

---

# Next Steps

Planned features:

* PostgreSQL integration
* Angular frontend
* Validation
* DTOs
* Spring Security + JWT
