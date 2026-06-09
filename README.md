# Java Data Structures

A collection of fundamental and advanced data structures implemented in Java. This repository serves as a learning resource, reference guide, and practical implementation library for understanding how data structures work under the hood.

## Overview

Data structures are the foundation of efficient software development. This repository contains Java implementations of commonly used data structures, along with examples and explanations to demonstrate their functionality and use cases.

## Implemented Data Structures

### Linear Data Structures

* Arrays
* Dynamic Arrays
* Linked Lists

  * Singly Linked List
  * Doubly Linked List
  * Circular Linked List
* Stacks
* Queues

  * Simple Queue
  * Circular Queue
  * Priority Queue
  * Deque

### Non-Linear Data Structures

* Trees

  * Binary Tree
  * Binary Search Tree (BST)
  * AVL Tree
  * Heap
* Graphs

  * Directed Graphs
  * Undirected Graphs
  * Weighted Graphs

### Hash-Based Structures

* Hash Tables
* Hash Maps
* Hash Sets

## Project Structure

```text
java-data-structures/
│
├── arrays/
├── linked-lists/
├── stacks/
├── queues/
├── trees/
├── graphs/
├── hash-tables/
└── examples/
```

## Prerequisites

* Java 17 or later
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)
* Basic understanding of Java programming

## Running the Code

1. Clone the repository:

```bash
git clone https://github.com/your-username/java-data-structures.git
```

2. Navigate to the project directory:

```bash
cd java-data-structures
```

3. Compile and run the desired Java file:

```bash
javac Main.java
java Main
```

## Learning Goals

Through this repository, you will:

* Understand the internal implementation of common data structures.
* Learn their strengths and weaknesses.
* Analyze time and space complexity.
* Practice writing clean and efficient Java code.
* Build a strong foundation for technical interviews and software engineering.

## Future Additions

* Sorting Algorithms
* Searching Algorithms
* Recursion Examples
* Dynamic Programming
* Advanced Graph Algorithms
* Competitive Programming Solutions

## Time Complexity Reference

| Data Structure     | Access    | Search    | Insertion | Deletion  |
| ------------------ | --------- | --------- | --------- | --------- |
| Array              | O(1)      | O(n)      | O(n)      | O(n)      |
| Linked List        | O(n)      | O(n)      | O(1)      | O(1)      |
| Stack              | O(n)      | O(n)      | O(1)      | O(1)      |
| Queue              | O(n)      | O(n)      | O(1)      | O(1)      |
| Hash Table         | N/A       | O(1)      | O(1)      | O(1)      |
| Binary Search Tree | O(log n)* | O(log n)* | O(log n)* | O(log n)* |

* Average case.

## Contributing

Contributions, suggestions, and improvements are welcome. Feel free to fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.

---

Created to strengthen understanding of Data Structures and Algorithms in Java.
