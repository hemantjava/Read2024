**The SOLID principles**

are five design principles in object-oriented programming that promote maintainable, scalable,
and robust software design. Each principle focuses on a specific aspect of object-oriented design and can be applied
individually or in combination

**1. Single Responsibility Principle (SRP)**

A class should have only one reason to change. In other words, a class should do one thing and do it well.

- Example: Violating SRP

```java
class UserService {
    public void createUser(String username) {
// Business logic to create user
        System.out.println("User created: " + username);
    }

    public void sendEmail(String email) {
// Logic to send email
        System.out.println("Email sent to: " + email);
    }
}
```

Here, UserService handles both user creation and email sending, violating SRP.

Refactored Example: Applying SRP

```java
class UserService {
    public void createUser(String username) {
        System.out.println("User created: " + username);
    }
}

class EmailService {
    public void sendEmail(String email) {
        System.out.println("Email sent to: " + email);
    }
}
```

Now, UserService is responsible for user-related logic, and EmailService is responsible for email-related logic.

**2. Open/Closed Principle (OCP)**

A class should be open for extension but closed for modification.

Example: Violating OCP

```java
class DiscountService {
    public double applyDiscount(String userType, double price) {
        if (userType.equals("premium")) {
            return price * 0.8; // 20% discount
        } else if (userType.equals("standard")) {
            return price * 0.9; // 10% discount
        }
        return price;
    }
}
```

Adding a new user type requires modifying the applyDiscount method.

Refactored Example: Applying OCP

```java
import org.dsa.design.patterns.creational.builder.Student;

interface Discount {
    double apply(double price);
}

class PremiumDiscount implements Discount {
    @Override
    public double apply(double price) {
        return price * 0.8; // 20% discount
    }
}

class StandardDiscount implements Discount {
    @Override
    public double apply(double price) {
        return price * 0.9; // 10% discount
    }
}

class StudentDiscount implements Discount {
    @Override
    public double apply(double price) {
        return price * 0.7; // 30% discount
    }
}

class DiscountService {
    public double applyDiscount(Discount discount, double price) {
        return discount.apply(price);
    }

    public static void main(String[] args) {
        Discount discount = new StudentDiscount();
        DiscountService service = new DiscountService();
        System.out.println(service.applyDiscount(discount, 120D));
    }
}
```

Adding a new discount type (e.g., StudentDiscount) requires only creating a new class, leaving existing code untouched.

**3. Liskov Substitution Principle (LSP)**

Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the
program.

Example: Violating LSP

```java
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
```

A Penguin violates LSP because it can’t behave as a general Bird.

Refactored Example: Applying LSP
```java
interface Bird {
void eat();
}

interface FlyingBird extends Bird {
void fly();
}

class Sparrow implements FlyingBird {
@Override
public void eat() {
System.out.println("Sparrow eats");
}

@Override
public void fly() {
System.out.println("Sparrow flies");
}

}

class Penguin implements Bird {
@Override
public void eat() {
System.out.println("Penguin eats");
}
}
```
Now, Penguin is not forced to implement the fly behavior, adhering to LSP.

**4. Interface Segregation Principle (ISP)**

A class should not be forced to implement interfaces it does not use.

Example: Violating ISP
```java
interface Worker {
void work();
void attendMeeting();
}

class Developer implements Worker {
@Override
public void work() {
System.out.println("Coding");
}

    @Override
    public void attendMeeting() {
        System.out.println("Attending meeting");
    }

}

class Janitor implements Worker {
@Override
public void work() {
System.out.println("Cleaning");
}

    @Override
    public void attendMeeting() {
        // Not applicable for Janitor
        throw new UnsupportedOperationException("Janitor doesn't attend meetings");
    }

}
```
Refactored Example: Applying ISP
```java
interface Workable {
void work();
}

interface MeetingAttendee {
void attendMeeting();
}

class Developer implements Workable, MeetingAttendee {
@Override
public void work() {
System.out.println("Coding");
}

    @Override
    public void attendMeeting() {
        System.out.println("Attending meeting");
    }

}

class Janitor implements Workable {
@Override
public void work() {
System.out.println("Cleaning");
}
}
```
Now, Janitor is not forced to implement irrelevant methods.

**5. Dependency Inversion Principle (DIP)**

High-level modules should not depend on low-level modules. Both should depend on abstractions.

Example: Violating DIP
```java
class MySQLDatabase {
public void connect() {
System.out.println("Connecting to MySQL");
}
}

class UserService {
private MySQLDatabase database;

    public UserService() {
        this.database = new MySQLDatabase();
    }

    public void performOperation() {
        database.connect();
    }

}
```
UserService depends directly on the MySQLDatabase, which makes it tightly coupled.

Refactored Example: Applying DIP
```java
interface Database {
void connect();
}

class MySQLDatabase implements Database {
@Override
public void connect() {
System.out.println("Connecting to MySQL");
}
}

class PostgreSQLDatabase implements Database {
@Override
public void connect() {
System.out.println("Connecting to PostgreSQL");
}
}

class UserService {
private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void performOperation() {
        database.connect();
    }

}
```
Now, UserService depends on the Database abstraction, allowing easy substitution of database implementations.

Conclusion

**By following SOLID principles:**

• SRP: Keep classes focused on one responsibility.

• OCP: Design for extensibility without modifying existing code.

• LSP: Ensure subclasses can replace their base class seamlessly.

• ISP: Keep interfaces minimal and relevant.

• DIP: Rely on abstractions, not concrete implementations.

These principles lead to code that is easier to maintain, test, and extend. Let me know if you need further examples!