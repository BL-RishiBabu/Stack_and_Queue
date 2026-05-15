# 📚 Stack and Queue Implementation

> A comprehensive implementation of **Stack** and **Queue** data structures using **LinkedList** as the underlying data structure.

![Status](https://img.shields.io/badge/Status-Active-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

---

## 📖 Table of Contents

- [Overview](#overview)
- [Use Cases](#use-cases)
- [Features](#features)
- [Data Structures](#data-structures)
- [Getting Started](#getting-started)
- [Implementation Details](#implementation-details)
- [Contributing](#contributing)

---

## 🎯 Overview

This project implements two fundamental data structures commonly used in computer science:

- **Stack**: Last-In-First-Out (LIFO) data structure
- **Queue**: First-In-First-Out (FIFO) data structure

Both are implemented using `LinkedList` for dynamic memory management and optimal performance.

---

## 📋 Use Cases

### UC1: Create a Stack

**Objective**: Ability to create a Stack of multiple elements `56→30→70`

**Description**: 
Implement the functionality to create a stack and push multiple elements onto it. The stack maintains elements in LIFO order.

**Operation Flow**:
```
Push 56 → Push 30 → Push 70
Stack: [70, 30, 56] (top to bottom)
```

**Requirements**:
- ✅ Use LinkedList to implement Stack Operations
- ✅ Push elements onto the stack
- ✅ Maintain LIFO ordering

---

### UC2: Peak and Pop from Stack

**Objective**: Ability to peek and pop from the Stack until it is empty

**Description**:
Implement peek and pop operations to view or remove elements from the stack while maintaining LIFO order until the stack becomes empty.

**Operation Flow**:
```
Stack: [70, 30, 56]
Peek() → 70 (view without removal)
Pop()  → 70 (remove from top)
Pop()  → 30
Pop()  → 56
Stack: [] (empty)
```

**Requirements**:
- ✅ Use LinkedList to implement Stack Operations
- ✅ Peek at top element without removing it
- ✅ Pop elements from the stack
- ✅ Handle empty stack scenarios

---

### UC3: Create a Queue

**Objective**: Ability to create a Queue of multiple elements `56→30→70`

**Description**:
Implement the functionality to create a queue and enqueue multiple elements. The queue maintains elements in FIFO order.

**Operation Flow**:
```
Enqueue 56 → Enqueue 30 → Enqueue 70
Queue: [56, 30, 70] (front to rear)
```

**Requirements**:
- ✅ Use LinkedList to implement Queue Operations
- ✅ Enqueue elements into the queue
- ✅ Maintain FIFO ordering

---

### UC4: Dequeue from Beginning

**Objective**: Ability to dequeue from the beginning of the Queue

**Description**:
Implement dequeue operations to remove elements from the front of the queue following FIFO principle.

**Operation Flow**:
```
Queue: [56, 30, 70]
Dequeue() → 56 (remove from front)
Dequeue() → 30
Dequeue() → 70
Queue: [] (empty)
```

**Requirements**:
- ✅ Use LinkedList to implement Queue Operations
- ✅ Dequeue elements from the front
- ✅ Maintain FIFO ordering
- ✅ Handle empty queue scenarios

---

## ✨ Features

| Feature | Stack | Queue |
|---------|-------|-------|
| Push/Enqueue | ✅ | ✅ |
| Pop/Dequeue | ✅ | ✅ |
| Peek | ✅ | ✅ |
| Display | ✅ | ✅ |
| LinkedList Based | ✅ | ✅ |
| Dynamic Size | ✅ | ✅ |

---

## 🏗️ Data Structures

### Queue Abstract Data Type (ADT)

The Queue ADT is a collection of elements where:
- Elements are added at the **rear** (enqueue)
- Elements are removed from the **front** (dequeue)
- Follows **FIFO** (First-In-First-Out) principle

**Key Operations**:
- `enqueue(element)`: Add element to rear
- `dequeue()`: Remove element from front
- `peek()`: View front element without removal
- `isEmpty()`: Check if queue is empty
- `display()`: Show all elements

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Basic understanding of LinkedList and data structures

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Stack_and_Queue
   ```

2. **Compile the project**
   ```bash
   javac *.java
   ```

3. **Run the implementation**
   ```bash
   java Main
   ```

---

## 💻 Implementation Details

### Stack Implementation
```
LinkedList Node: [data | next]
├─ Push Operation: Add node at HEAD
├─ Pop Operation: Remove node from HEAD
└─ Peek Operation: View HEAD node without removal
```

### Queue Implementation
```
LinkedList Node: [data | next]
├─ Enqueue Operation: Add node at TAIL
├─ Dequeue Operation: Remove node from HEAD
└─ Peek Operation: View HEAD node without removal
```

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

---