# Java 21 Overview

| Item | Details |
|---|---|
| Release Type | Long-Term Support (LTS) |
| Release Date | September 2023 |
| Focus Areas | Performance, Concurrency, Developer Productivity, JVM Improvements |

---

# Major Java 21 Features

| Feature | Type | Explanation |
|---|---|---|
| Virtual Threads | Final | Lightweight threads that allow handling millions of concurrent tasks efficiently with very low memory usage. Great for microservices and high-scale applications. |
| Pattern Matching for switch | Final | Allows `switch` to work with object types and patterns, reducing boilerplate type-checking and casting code. |
| Record Patterns | Final | Enables extracting values directly from records during pattern matching for cleaner and shorter code. |
| Sequenced Collections | Final | Introduces common APIs like `getFirst()`, `getLast()`, and `reversed()` for ordered collections such as List, Set, and Map. |
| String Templates | Preview | Simplifies string creation using embedded expressions like `STR."Hello \{name}"`, improving readability over string concatenation. |
| Unnamed Patterns and Variables | Preview | Uses `_` to ignore unused variables or pattern values, making pattern matching cleaner and easier to read. |
| Scoped Values | Preview | A lightweight and safer alternative to `ThreadLocal` for sharing immutable data between threads. |
| Foreign Function & Memory API | Preview | Allows Java to directly call native libraries (C/C++) and manage off-heap memory safely without JNI complexity. |
| Structured Concurrency | Preview | Treats multiple concurrent tasks as a single unit, improving cancellation, error handling, and thread management. |
| Generational ZGC | JVM Enhancement | Improves Z Garbage Collector performance by separating young and old objects, reducing GC pauses and increasing efficiency. |

---

# Short Explanations

## Virtual Threads

Very lightweight threads managed by JVM instead of OS.  
Helps build highly scalable applications with simpler concurrent code.

---

## Pattern Matching for switch

Allows:

```java
case CardPayment card ->
```

instead of manual `instanceof` and casting.

---

## Record Patterns

Directly extracts record values:

```java
case Payment(String name, double amount)
```

without getter calls.

---

## Sequenced Collections

Provides common ordered collection methods:

```java
getFirst()
getLast()
reversed()
```

for List, Set, and Map.

---

## String Templates

Cleaner string formatting:

```java
STR."Hello \{name}"
```

instead of `"Hello " + name`.

---

## Unnamed Patterns and Variables

Ignore unused values using `_`:

```java
case Payment(_, _, double amount)
```

---

## Scoped Values

Better alternative to `ThreadLocal`.

Useful for:
- request context
- user session data
- transaction tracking

especially with Virtual Threads.

---

## Foreign Function & Memory API

Directly calls native code without JNI:

```java
C library ↔ Java
```

Also supports safer off-heap memory access.

---

## Structured Concurrency

Groups related concurrent tasks together.

If one task fails:
- others can be cancelled automatically.

Improves reliability and readability.

---

## Generational ZGC

Enhanced garbage collector for:
- lower pause times
- better throughput
- large heap optimization

Ideal for enterprise-scale applications.

---

# Enterprise Usage Examples

| Feature | Common Usage |
|---|---|
| Virtual Threads | Payment systems, APIs, microservices |
| Pattern Matching | DTO processing, event routing |
| Record Patterns | REST APIs, Kafka consumers |
| Sequenced Collections | Audit logs, transaction history |
| String Templates | Email templates, SQL generation |
| Scoped Values | Request context propagation |
| Structured Concurrency | Parallel service calls |
| Foreign Function API | Native integrations |
| Generational ZGC | High-performance servers |

---

# Java 21 Compilation Notes

## Preview Features Require

Compile:

```bash
javac --enable-preview --release 21 FileName.java
```

Run:

```bash
java --enable-preview FileName
```

---

# Preview Features in Java 21

| Preview Feature |
|---|
| String Templates |
| Unnamed Patterns and Variables |
| Scoped Values |
| Foreign Function & Memory API |
| Structured Concurrency |

---
```