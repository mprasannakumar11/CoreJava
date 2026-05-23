# Composition vs Aggregation vs Association

| Relationship | Meaning | Ownership | Lifetime Dependency |
|---|---|---|---|
| Association | General relationship between objects | No ownership | Independent |
| Aggregation | Weak HAS-A relationship | Partial ownership | Independent |
| Composition | Strong HAS-A relationship | Full ownership | Dependent |

---

# 1. Association

## Definition

Association means:
- two classes are connected
- one object uses another object

Both objects can exist independently.

---

# Real-Time Example

- Customer uses Bank
- Employee works for Company
- Student attends College

---

# Association Diagram

```text
Customer  -------->  Bank
```

---

# Example

```java
class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }
}

class Customer {

    String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    public void useBank(Bank bank) {

        System.out.println(
                customerName +
                " uses " +
                bank.bankName
        );
    }
}

public class AssociationExample {

    public static void main(String[] args) {

        Bank bank =
                new Bank("HDFC");

        Customer customer =
                new Customer("Prasanna");

        customer.useBank(bank);
    }
}
```

---

# Output

```text
Prasanna uses HDFC
```

---

# Important Point

If Bank object is destroyed:
- Customer can still exist

If Customer object is destroyed:
- Bank still exists

So both are independent.

---

# 2. Aggregation

## Definition

Aggregation is:
- weak HAS-A relationship
- one object contains another object
- child object can exist independently

---

# Real-Time Example

- Department has Employees
- Team has Players
- Library has Books

Employees can exist even if Department is removed.

---

# Aggregation Diagram

```text
Department <>------ Employee
```

(Empty diamond represents aggregation)

---

# Example

```java
class Employee {

    String employeeName;

    Employee(String employeeName) {

        this.employeeName = employeeName;
    }
}

class Department {

    String departmentName;

    Employee employee;

    Department(String departmentName,
               Employee employee) {

        this.departmentName = departmentName;

        this.employee = employee;
    }

    public void showDetails() {

        System.out.println(
                departmentName +
                " department has employee " +
                employee.employeeName
        );
    }
}

public class AggregationExample {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Prasanna");

        Department department =
                new Department(
                        "Payments",
                        employee
                );

        department.showDetails();
    }
}
```

---

# Output

```text
Payments department has employee Prasanna
```

---

# Important Point

Employee can exist without Department.

So lifetime is independent.

---

# 3. Composition

## Definition

Composition is:
- strong HAS-A relationship
- child object belongs completely to parent
- child cannot exist independently

---

# Real-Time Example

- House has Rooms
- Car has Engine
- Order has OrderItems

If parent is destroyed:
- child is also destroyed

---

# Composition Diagram

```text
House ◆------ Room
```

(Filled diamond represents composition)

---

# Example

```java
class Engine {

    public void start() {

        System.out.println("Engine Started");
    }
}

class Car {

    private Engine engine;

    /*
     * Engine created INSIDE Car.
     */

    Car() {

        engine = new Engine();
    }

    public void startCar() {

        engine.start();

        System.out.println("Car Started");
    }
}

public class CompositionExample {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}
```

---

# Output

```text
Engine Started

Car Started
```

---

# Important Point

Engine belongs completely to Car.

If Car is destroyed:
- Engine is also destroyed

Strong dependency exists.

---

# Key Differences

| Feature | Association | Aggregation | Composition |
|---|---|---|---|
| Relationship Type | Uses-A | HAS-A | Strong HAS-A |
| Ownership | No | Weak | Strong |
| Object Lifetime | Independent | Independent | Dependent |
| Child Exists Without Parent | Yes | Yes | No |
| Coupling | Loose | Medium | Tight |

---

# Simple Memory Trick

| Type | Memory Trick |
|---|---|
| Association | Uses |
| Aggregation | Has |
| Composition | Owns Completely |

---

# Real Enterprise Examples

| Relationship | Example |
|---|---|
| Association | Customer → Bank |
| Aggregation | Department → Employees |
| Composition | Order → OrderItems |
| Composition | Car → Engine |
| Aggregation | Team → Players |
| Association | User → PaymentService |

---

# Composition vs Aggregation Important Difference

## Aggregation

```java
Department department =
        new Department(employee);
```

Employee comes from outside.

---

## Composition

```java
engine = new Engine();
```

Object created inside parent.

---

# When to Use What

| Requirement | Use |
|---|---|
| Simple interaction | Association |
| Shared object relationship | Aggregation |
| Strong ownership | Composition |

---

# Common Interview Question

## Question

Why is Composition preferred over Inheritance?

## Answer

Composition provides:
- loose coupling
- better flexibility
- runtime behavior changes
- better maintainability

Follows:
- "Favor Composition over Inheritance"

---

# Real-Time Microservice Examples

| Example | Relationship |
|---|---|
| PaymentService uses NotificationService | Association |
| Order contains Product list | Aggregation |
| Invoice contains InvoiceItems | Composition |

---

# Final Summary

| Relationship | Best Description |
|---|---|
| Association | Objects communicate |
| Aggregation | Objects are connected but independent |
| Composition | Objects fully depend on parent |

---