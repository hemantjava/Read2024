## SOLID Principles

In software engineering, SOLID is an acronym representing five principles that help developers design maintainable, 
flexible, and scalable object-oriented systems. 
These principles were introduced by Robert C. Martin, also known as Uncle Bob.
### 1. Single Responsibility Principle (SRP)
   Definition: A class should have only one reason to change, meaning it should only have one job or responsibility.
```java
// Without SRP
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        // Code to save user to the database
    }

    public void sendEmail() {
        // Code to send an email
    }
}

```
### 2. Open/Closed Principle (OCP)
Definition: Software entities (classes, modules, functions, etc.) 
should be open for extension but closed for modification.  
```java
// Without OCP
public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}
```
### 3. Liskov Substitution Principle (LSP)
Definition: Objects of a superclass should be replaceable with objects of a subclass without affecting the existing behaviours of the program.
```java
// Without LSP
public class Bike {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
```
### 4. Interface Segregation Principle (ISP)
Definition: Clients should not be forced to implement methods of interfaces they do not use/need.
```java
// Without ISP
public interface Worker {
    void work();
    void eat();
}

public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer working");
    }

    @Override
    public void eat() {
        System.out.println("Developer eating");
    }
}

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        // Not applicable to Robot, but must implement
    }
}
```
### 5. Dependency Inversion Principle (DIP)
Definition: High-level modules should not depend on low-level modules directly. Both should depend on abstractions (e.g., interfaces).
-> Class should depend on interfaces rather than concrete class.
```java
public class MackBook{
    private final WiredKeyBoard keyBoard;
    private final WiredMouse mouse;
            
    public MackBook(){
        keyBoard = new WiredKeyBoard(); //concrete  classes
        mouse = new WiredMouse();
    }        
}
```