# Java Collections Framework Overview

| Item | Details |
|---|---|
| Purpose | Store and manipulate groups of objects dynamically |
| Introduced | Java 1.2 |
| Package | `java.util` |
| Supports | Dynamic data structures and algorithms |

---

# Collection Hierarchy

```text
Iterable
   |
Collection
   |
------------------------------------------------
|                |               |             |
List             Set             Queue         Deque
```

```text
Map (Separate hierarchy)
```

---

# Major Collection Types

| Collection Type | Description | Allows Duplicate | Ordered | Sorted |
|---|---|---|---|---|
| List | Ordered collection | Yes | Yes | No |
| Set | Unique elements | No | Depends | Depends |
| Queue | FIFO processing | Yes | Yes | No |
| Deque | Double-ended queue | Yes | Yes | No |
| Map | Key-value pairs | Keys No | Depends | Depends |

---

# List Interface

## Purpose

Stores ordered elements.

Supports:
- duplicates
- index-based access

---

# Common List Implementations

| Class | Description |
|---|---|
| ArrayList | Dynamic array |
| LinkedList | Doubly linked list |
| Vector | Thread-safe dynamic array |
| Stack | LIFO stack structure |

---

# ArrayList

## Features

- Fast random access
- Dynamic resizing
- Maintains insertion order

---

## Example

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> payments =
                new ArrayList<>();

        payments.add("UPI");

        payments.add("CARD");

        payments.add("WALLET");

        System.out.println(payments);

        System.out.println(payments.get(1));
    }
}
```

---

## Output

```text
[UPI, CARD, WALLET]

CARD
```

---

# LinkedList

## Features

- Faster insertion/deletion
- Doubly linked structure
- Implements List and Deque

---

## Example

```java
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> transactions =
                new LinkedList<>();

        transactions.add("Payment 1");

        transactions.addFirst("Priority Payment");

        transactions.addLast("Refund");

        System.out.println(transactions);
    }
}
```

---

## Output

```text
[Priority Payment, Payment 1, Refund]
```

---

# Set Interface

## Purpose

Stores unique elements.

No duplicates allowed.

---

# Common Set Implementations

| Class | Description |
|---|---|
| HashSet | Fast unordered set |
| LinkedHashSet | Maintains insertion order |
| TreeSet | Sorted set |

---

# HashSet

## Features

- No duplicates
- Unordered
- Fast operations

---

## Example

```java
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> paymentMethods =
                new HashSet<>();

        paymentMethods.add("UPI");

        paymentMethods.add("CARD");

        paymentMethods.add("UPI");

        System.out.println(paymentMethods);
    }
}
```

---

## Output

```text
[UPI, CARD]
```

---

# LinkedHashSet

## Features

- Maintains insertion order
- No duplicates

---

## Example

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> methods =
                new LinkedHashSet<>();

        methods.add("UPI");

        methods.add("CARD");

        methods.add("WALLET");

        System.out.println(methods);
    }
}
```

---

## Output

```text
[UPI, CARD, WALLET]
```

---

# TreeSet

## Features

- Sorted collection
- No duplicates

---

## Example

```java
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> amounts =
                new TreeSet<>();

        amounts.add(5000);

        amounts.add(1000);

        amounts.add(3000);

        System.out.println(amounts);
    }
}
```

---

## Output

```text
[1000, 3000, 5000]
```

---

# Queue Interface

## Purpose

FIFO (First In First Out).

Used in:
- task scheduling
- payment processing
- messaging systems

---

# Common Queue Implementations

| Class | Description |
|---|---|
| PriorityQueue | Sorted queue |
| ArrayDeque | Faster queue/deque |
| LinkedList | Queue implementation |

---

# PriorityQueue

## Features

- Elements sorted automatically
- Smallest element first by default

---

## Example

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue =
                new PriorityQueue<>();

        queue.add(300);

        queue.add(100);

        queue.add(200);

        System.out.println(queue);

        System.out.println(queue.poll());
    }
}
```

---

## Output

```text
[100, 300, 200]

100
```

---

# Deque Interface

## Purpose

Double-ended queue.

Supports:
- insertion/removal from both ends

---

# ArrayDeque

## Features

- Faster than Stack
- Faster than LinkedList in many cases

---

## Example

```java
import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<String> deque =
                new ArrayDeque<>();

        deque.addFirst("First");

        deque.addLast("Last");

        System.out.println(deque);
    }
}
```

---

## Output

```text
[First, Last]
```

---

# Map Interface

## Purpose

Stores key-value pairs.

Keys are unique.

---

# Common Map Implementations

| Class | Description |
|---|---|
| HashMap | Fast unordered map |
| LinkedHashMap | Ordered map |
| TreeMap | Sorted map |
| Hashtable | Thread-safe old map |

---

# HashMap

## Features

- Fast lookup
- No order guarantee
- Most commonly used map

---

## Example

```java
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> payments =
                new HashMap<>();

        payments.put(101, "UPI");

        payments.put(102, "CARD");

        payments.put(103, "WALLET");

        System.out.println(payments);

        System.out.println(payments.get(102));
    }
}
```

---

## Output

```text
{101=UPI, 102=CARD, 103=WALLET}

CARD
```

---

# LinkedHashMap

## Features

- Maintains insertion order

---

## Example

```java
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        map.put(1, "UPI");

        map.put(2, "CARD");

        map.put(3, "WALLET");

        System.out.println(map);
    }
}
```

---

## Output

```text
{1=UPI, 2=CARD, 3=WALLET}
```

---

# TreeMap

## Features

- Sorted by keys

---

## Example

```java
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> map =
                new TreeMap<>();

        map.put(300, "CARD");

        map.put(100, "UPI");

        map.put(200, "WALLET");

        System.out.println(map);
    }
}
```

---

## Output

```text
{100=UPI, 200=WALLET, 300=CARD}
```

---

# Collection Comparison Table

| Collection | Ordered | Sorted | Duplicate Allowed | Thread Safe |
|---|---|---|---|---|
| ArrayList | Yes | No | Yes | No |
| LinkedList | Yes | No | Yes | No |
| HashSet | No | No | No | No |
| LinkedHashSet | Yes | No | No | No |
| TreeSet | Yes | Yes | No | No |
| HashMap | No | No | Values Yes | No |
| LinkedHashMap | Yes | No | Values Yes | No |
| TreeMap | Yes | Yes | Values Yes | No |
| Vector | Yes | No | Yes | Yes |
| Hashtable | No | No | Values Yes | Yes |

---

# When to Use Which Collection

| Requirement | Recommended Collection |
|---|---|
| Fast random access | ArrayList |
| Frequent insertion/deletion | LinkedList |
| Unique elements | HashSet |
| Maintain insertion order | LinkedHashSet |
| Sorted data | TreeSet |
| Fast key-value lookup | HashMap |
| Sorted key-value storage | TreeMap |
| FIFO processing | Queue |
| Stack operations | ArrayDeque |

---

# Time Complexity

| Operation | ArrayList | LinkedList | HashSet | HashMap |
|---|---|---|---|---|
| Add | O(1) | O(1) | O(1) | O(1) |
| Get/Search | O(1) | O(n) | O(1) | O(1) |
| Remove | O(n) | O(1) | O(1) | O(1) |

---

# Enterprise Usage Examples

| Collection | Real Usage |
|---|---|
| ArrayList | Payment history |
| LinkedList | Task queues |
| HashSet | Unique user sessions |
| TreeSet | Sorted reports |
| HashMap | Caching |
| Queue | Message processing |
| PriorityQueue | Job scheduling |
| TreeMap | Sorted transaction reports |

---

# Java Collection Utility Class

## Collections Class

Provides utility methods.

Example:

```java
Collections.sort(list);

Collections.reverse(list);

Collections.shuffle(list);
```

---

# Important Interfaces

| Interface | Purpose |
|---|---|
| Iterable | Supports iteration |
| Collection | Root collection interface |
| List | Ordered collection |
| Set | Unique elements |
| Queue | FIFO processing |
| Map | Key-value storage |

---

# Fail Fast vs Fail Safe

| Type | Description |
|---|---|
| Fail Fast | Throws `ConcurrentModificationException` |
| Fail Safe | Works on cloned copy |

Examples:
- ArrayList iterator → Fail Fast
- CopyOnWriteArrayList → Fail Safe

---

# Java Collections Best Practices

- Use interfaces for references
- Prefer ArrayList for reads
- Prefer HashMap for lookups
- Use immutable collections when possible
- Avoid synchronized collections unless needed

---