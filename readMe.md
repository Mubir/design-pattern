1. CREATIONAL Patterns

## Common Patterns

| **Pattern**        | **Purpose**                          | **Spring Boot Example**                                          |
|---------------------|--------------------------------------|-------------------------------------------------------------------|
| **Singleton**       | One instance per context            | `@Bean`, `@Component` (default scope is singleton)               |
| **Factory Method**  | Subclass decides which class to instantiate | Custom `ServiceFactory` that returns different `PaymentService`  |
| **Abstract Factory**| Create families of related objects   | Return groups of beans depending on profile/environment          |
| **Builder**         | Step-by-step object construction    | `UriComponentsBuilder`, `ResponseEntityBuilder`                  |
| **Prototype**       | New instance every time             | Spring's `@Scope("prototype")`                                   |

2. STRUCTURAL Patterns

🔹 What they solve: Object composition—how objects fit together to form larger structures.
🔹 Goal: Help classes work together while keeping them flexible and decoupled.
## Common Patterns

| **Pattern**        | **Purpose**                                      | **Spring Boot Example**                                          |
|---------------------|-------------------------------------------------|-------------------------------------------------------------------|
| **Adapter**         | Makes incompatible interfaces work together      | `JdbcTemplate` as an adapter over JDBC; Spring Security’s `UserDetailsAdapter` |
| **Facade**          | Simplifies complex APIs                         | `RestTemplate`, `WebClient`, or service layer wrapping complex logic |
| **Proxy**           | Adds behavior without changing original object  | Spring AOP Proxies (logging, security)                           |
| **Decorator**       | Adds behavior dynamically                       | `HandlerInterceptor`, `Filter`, Spring Web Decorators            |
| **Bridge**          | Decouples abstraction from implementation       | Spring Data JPA (`CrudRepository`) bridges to underlying DB logic |

3. BEHAVIORAL Patterns

🔹 What they solve: Object communication and responsibility sharing
🔹 Goal: Define how objects interact and pass responsibilities between them.
## 🔧 Common Patterns

| **Pattern**             | **Purpose**                                 | **Spring Boot Example**                                          |
|--------------------------|---------------------------------------------|-------------------------------------------------------------------|
| **Strategy**             | Select algorithm at runtime                | `AuthenticationProvider`, conditional `@Bean` injection          |
| **Observer**             | Notify objects when state changes          | `@EventListener`, `ApplicationEventPublisher`                    |
| **Template Method**      | Define algorithm structure, let subclasses customize | Spring’s `JdbcTemplate`, `RestTemplate`, `AbstractController`  |
| **Command**              | Encapsulate a request as an object         | Spring Batch Jobs, Runnable commands                             |
| **Chain of Responsibility** | Pass requests along a chain of handlers | Spring Security Filter Chain, Servlet Filter Chain               |
