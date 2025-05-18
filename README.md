# Spring Drools Demo

This is a demo project that integrates [Drools](https://www.drools.org/), a powerful Business Rule Management System (BRMS), with a Spring Boot application. It serves as a starting point for developers who want to explore how to define and apply business rules in a Java application using the Drools rule engine.

## 📌 Features

- ✅ Integration of Drools with Spring Boot  
- 📄 Sample business rules written in DRL (Drools Rule Language)  
- 🔄 Automatic rule evaluation based on domain objects  
- 📦 Clean and modular project structure  
- 🧪 Unit tests to demonstrate rule evaluation  

## 🚀 Getting Started

### Prerequisites

- Java 11
- Gradle 6+
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Clone the Repository

```bash
git clone https://github.com/amine-hamzi/spring-drools-demo.git
cd spring-drools-demo

```
### Run the Application
You can run the application using Gradle:

```bash
  ./gradlew bootRun
```
Or run the main class directly from your IDE:

com.aminehamzi.droolsdemo.DroolsDemoApplication


## 🧠 How It Works
Drools uses DRL (Drools Rule Language) files to define business rules, which are loaded and executed by the Drools engine at runtime.

This demo includes:

A sample rule file located in src/main/resources/rules/discount.drl

A domain model (Product) with fields used in rule evaluation

A service that applies the rules to given objects

Example: A rule that applies a discount to a product if its type is "GOLD" and price is above a certain threshold.

## 🧪 Testing
You can run tests using:

```bash

./gradlew test
```
The tests demonstrate how rules are triggered and applied correctly to business objects.


## 📁 Project Structure
```bash

spring-drools-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/aminehamzi/droolsdemo/
│   │   ├── resources/
│   │   │   └── rules/
│   │   │       └── discount.drl
│   └── test/
├── pom.xml

````

## 🛠️ Technologies Used

- Java 11
- Spring Boot 2.x
- Drools Rule Engine
- Gradle

## 🤝 Contributing
Contributions are welcome! If you find bugs or want to suggest improvements, feel free to open an issue or submit a pull request.

## 📬 Contact
aminehamzi85@gmail.com
