1. CREATIONAL Patterns

## Common Patterns

| **Pattern**        | **Purpose**                          | **Spring Boot Example**                                          |
|---------------------|--------------------------------------|-------------------------------------------------------------------|
| **Singleton**       | One instance per context            | `@Bean`, `@Component` (default scope is singleton)               |
| **Factory Method**  | Subclass decides which class to instantiate | Custom `ServiceFactory` that returns different `PaymentService`  |
| **Abstract Factory**| Create families of related objects   | Return groups of beans depending on profile/environment          |
| **Builder**         | Step-by-step object construction    | `UriComponentsBuilder`, `ResponseEntityBuilder`                  |
| **Prototype**       | New instance every time             | Spring's `@Scope("prototype")`                                   |
