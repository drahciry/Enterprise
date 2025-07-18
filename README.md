# Java OOP Concepts: Employee Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)

## 🚀 About The Project

This project is a simple command-line employee management application built in Java. Its primary purpose is to serve as a practical demonstration of core Object-Oriented Programming (OOP) principles. The system can register different types of employees (Managers and Programmers), calculate their annual bonuses based on specific rules, and handle a simple authentication flow for managers.

---

## ✨ OOP Concepts Demonstrated

This project was developed to apply and showcase a solid understanding of Java's fundamental OOP pillars.

### 1. Abstraction
Abstraction is used to hide complex implementation details and show only the essential features of the object.

- **Abstract Class:** The `Employee` class is `abstract`. It defines the common template for any employee, with shared attributes (`name`, `salary`) and behaviors (`receiveIncrease`), but delegates the specific implementation of bonus calculation to its subclasses through the `abstract` method `calculateAnnualBonuses()`.
- **Interface:** The `Authenticable` interface defines a contract for any class that needs to have authentication capabilities. It declares *what* an authenticable object must do (`authenticate(String password)`), but not *how* it should do it.

### 2. Inheritance
Inheritance allows a class to inherit fields and methods from another class, promoting code reuse.

- The `Manager` and `Programmer` classes `extend` the `Employee` class. They inherit its state and common methods, while also providing their own specialized implementations for the abstract methods and adding new functionalities (like the `Manager` implementing the `Authenticable` interface).

### 3. Encapsulation
Encapsulation is the practice of bundling the data (attributes) and methods that operate on the data into a single unit (a class) and restricting access to some of the object's components.

- All class attributes (e.g., `name`, `salary`, `password`) are declared as `private`, preventing direct external access.
- Data can only be accessed and modified through public methods (`getters` or specific business methods like `receiveIncrease`), ensuring the object's internal state remains consistent and protected. Public setters that would allow unrestricted modification have been intentionally omitted.

### 4. Polymorphism
Polymorphism ("many forms") allows objects of different classes to be treated as objects of a common superclass.

- In `Main.java`, a `List<Employee>` is used to hold both `Manager` and `Programmer` objects.
- When iterating through the list, the same method call, `employee.calculateAnnualBonuses()`, results in different behavior depending on the actual type of the object (`Manager` or `Programmer`). This is runtime polymorphism in action.
- The `instanceof` operator is also used to check the specific type of an object at runtime to perform type-specific actions, such as initiating the authentication flow only for `Manager` objects.

---

## 🔧 Additional Features

- **Custom Exceptions:** The project includes a custom unchecked exception, `InvalidValuePercentageException`, to handle specific business rule violations, demonstrating robust error handling.
- **Static Nested Classes:** The `Main` class uses `static nested classes` (`DisplayTeam`, `Authenticate`) to organize and group related functionalities, improving code readability and cohesion within the application's entry point.

---

## 📁 Project Structure

```
.
└── src
    └── br
        └── com
            └── enterprise
                ├── app
                │   └── Main.java
                ├── exceptions
                │   └── InvalidValuePercentageException.java
                └── model
                    ├── Authenticable.java
                    ├── Employee.java
                    ├── Manager.java
                    └── Programmer.java
```

---

## ⚡ How To Run

1.  Clone the repository or download the source code.
2.  Open your terminal and navigate to the project's root directory.
3.  Create a directory for the compiled files:
    ```bash
    mkdir bin
    ```
4.  Compile all the Java source files from the `src` directory into the `bin` directory:
    ```bash
    javac -d bin src/br/com/enterprise/model/*.java src/br/com/enterprise/exceptions/*.java src/br/com/enterprise/app/*.java
    ```
5.  Run the application:
    ```bash
    java -cp bin br.com.enterprise.app.Main
    ```
6.  Follow the on-screen prompts to see the employee data and test the manager authentication.

---

## 👨‍💻 Author

**Richard Gonçalves** (Feel free to add your GitHub profile link here!)