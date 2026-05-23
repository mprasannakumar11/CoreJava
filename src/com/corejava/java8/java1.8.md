# Java 8 Overview

| Item | Details |
|---|---|
| Release Type | Long-Term Support (LTS) |
| Release Date | March 2014 |
| Focus Areas | Functional Programming, Stream Processing, JVM Enhancements, Date & Time API |

---

# Major Java 8 Features

| Feature | Type | Explanation |
|---|---|---|
| Lambda Expressions | Final | Introduced functional programming style using concise anonymous functions. |
| Functional Interfaces | Final | Interfaces with a single abstract method used with lambda expressions. |
| Stream API | Final | Provides functional-style operations for collections such as filtering, mapping, and aggregation. |
| Default Methods | Final | Allows interfaces to contain method implementations without breaking existing classes. |
| Method References | Final | Shorter syntax for calling methods using `::` operator. |
| Optional Class | Final | Helps avoid `NullPointerException` by representing optional values safely. |
| New Date and Time API | Final | Introduced modern immutable date/time classes in `java.time` package. |
| CompletableFuture | Final | Supports asynchronous and non-blocking programming. |
| Nashorn JavaScript Engine | Final | Allows Java applications to run JavaScript code inside JVM. |
| PermGen Removed | JVM Enhancement | Replaced Permanent Generation memory with Metaspace for better memory management. |

---

# Short Explanations

## Lambda Expressions

Allows writing compact anonymous functions.

Example:

```java
(x, y) -> x + y
```

Reduces boilerplate code significantly.

---

## Functional Interfaces

Interface containing only one abstract method.

Example:

```java
@FunctionalInterface
interface PaymentProcessor {
    void process();
}
```

Works perfectly with lambdas.

---

## Stream API

Processes collections using functional operations.

Example:

```java
payments.stream()
        .filter(p -> p > 1000)
        .forEach(System.out::println);
```

Supports:
- filtering
- mapping
- sorting
- grouping

---

## Default Methods

Interfaces can now contain implementation methods.

Example:

```java
default void print() {
    System.out.println("Default Method");
}
```

Helps add new methods without breaking old implementations.

---

## Method References

Shorter version of lambda expressions.

Example:

```java
System.out::println
```

instead of:

```java
x -> System.out.println(x)
```

---

## Optional Class

Safer way to handle null values.

Example:

```java
Optional<String> name =
        Optional.of("Prasanna");
```

Avoids direct null checks.

---

## New Date and Time API

Introduced immutable date/time classes.

Examples:
- `LocalDate`
- `LocalTime`
- `LocalDateTime`

Better than old `Date` and `Calendar` APIs.

---

## CompletableFuture

Supports asynchronous programming.

Example:

```java
CompletableFuture.runAsync(() ->
        System.out.println("Payment Processing"));
```

Useful for parallel task execution.

---

## Nashorn JavaScript Engine

Allows Java to execute JavaScript code.

Example:

```java
ScriptEngine engine =
        new ScriptEngineManager()
                .getEngineByName("nashorn");
```

---

## PermGen Removed

Permanent Generation memory removed.

Replaced with:
- Metaspace

Benefits:
- better memory allocation
- fewer OutOfMemory issues

---

# Enterprise Usage Examples

| Feature | Common Usage |
|---|---|
| Lambda Expressions | Business logic simplification |
| Stream API | Data processing pipelines |
| Optional | Safer API responses |
| CompletableFuture | Async microservices |
| Date & Time API | Financial and audit systems |
| Method References | Cleaner collection operations |
| Default Methods | Framework evolution |
| Functional Interfaces | Event-driven systems |

---

# Java 8 Important APIs

| Package/API | Purpose |
|---|---|
| `java.util.stream` | Stream processing |
| `java.util.function` | Functional interfaces |
| `java.time` | Modern date/time handling |
| `java.util.Optional` | Null-safe handling |
| `CompletableFuture` | Async programming |

---

# Most Popular Functional Interfaces

| Interface | Purpose |
|---|---|
| Predicate | Returns boolean |
| Function | Takes input and returns output |
| Consumer | Consumes value without return |
| Supplier | Produces value |
| BiFunction | Takes two inputs and returns output |

---

# Example Functional Interfaces

```java
Predicate<Integer> isEven =
        n -> n % 2 == 0;

Function<String, Integer> length =
        str -> str.length();

Consumer<String> print =
        System.out::println;

Supplier<Double> random =
        Math::random;
```

---

# Why Java 8 Became Revolutionary

Java 8 completely changed Java programming style.

Before Java 8:
- more boilerplate
- imperative coding

After Java 8:
- functional programming
- cleaner collection handling
- easier concurrency
- modern APIs

---

# Most Widely Used Java Version

Java 8 became:
- one of the most adopted Java releases
- heavily used in enterprise systems
- foundation for modern Java development

---

# Java 8 JVM Improvements

| JVM Feature | Benefit |
|---|---|
| Metaspace | Better memory management |
| Parallel Array Sorting | Faster sorting |
| Compact Profiles | Smaller Java runtime |
| Improved Garbage Collection | Better JVM performance |

---

# Real-Time Enterprise Applications

| Area | Usage |
|---|---|
| Banking Systems | Transaction processing |
| Payment Gateways | Async payment handling |
| E-Commerce | Stream-based order processing |
| Microservices | CompletableFuture APIs |
| Reporting Systems | Stream aggregations |
| Audit Systems | Date/time APIs |

---