# 🌱 What is a Bean in Spring?

In the **Spring Framework**, a **Bean** is simply an object that is managed by the **Spring Container**.

---

## 🤔 What Does a Spring Bean Do?

Think of a Spring Bean like a special Java object that Spring:

- ✅ **Creates**  
- ✅ **Initializes**  
- ✅ **Injects with dependencies**  
- ✅ **Manages its entire lifecycle** (e.g., creation, destruction)

---

## 💡 Imagine This

You write the following code:

```java
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    // Business logic and methods here
}
```

Behind the scenes, Spring is doing something like:

```java
OrderService orderService = new OrderService(); // Spring-created object
```

Instead of you manually calling `new OrderService()`, **Spring automatically** does that for you and keeps a reference in its internal **ApplicationContext**, which is like a registry of all beans.

---

## 🧠 TL;DR — In Simple Words

**Bean = Any object that is created, configured, and managed by the Spring container.**

It helps you avoid manual instantiation and wiring of dependencies, which makes your code cleaner, more modular, and easier to test.

---

## 📌 Key Annotations Related to Beans

Here are some annotations used to declare beans:

| Annotation         | Description                                      |
|--------------------|--------------------------------------------------|
| `@Component`       | Generic stereotype for any Spring-managed bean   |
| `@Service`         | Marks a service class (typically business logic) |
| `@Repository`      | Marks a DAO class (data access layer)            |
| `@Controller`      | Marks a web controller in Spring MVC             |
| `@Configuration`   | Marks a class as a source of bean definitions    |
| `@Bean`            | Used in `@Configuration` classes to declare beans manually |

---

## ✅ Example with `@Configuration` and `@Bean`

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }
}
```

In this example, `OrderService` is a **Spring Bean**, but instead of using `@Component`, we’re declaring it manually using `@Bean`.

---

## 📚 Summary

- **Spring Bean** = Managed object in the Spring container
- Automatically instantiated and injected
- Makes development easier and decouples components
- Declared using annotations like `@Component` or via `@Bean` in config classes

---

🛠️ **By using beans, you let Spring handle the wiring so you can focus on building your application logic.**