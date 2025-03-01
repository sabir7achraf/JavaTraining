# Queue Methods in Java

## Overview
The `Queue` interface in Java is a part of the `java.util` package and extends the `Collection` interface. It follows the FIFO (First-In-First-Out) principle. Below are the commonly used methods in `Queue`, along with their time and space complexities.

## Queue Methods

### 1. `add(E e)`
- **Description**: Inserts the specified element into the queue. Throws an exception if the operation fails.
- **Time Complexity**: O(1) (for LinkedList and ArrayDeque), O(n) (for PriorityQueue)
- **Space Complexity**: O(1)

### 2. `offer(E e)`
- **Description**: Inserts the specified element into the queue. Returns `false` if the operation fails.
- **Time Complexity**: O(1) (for LinkedList and ArrayDeque), O(log n) (for PriorityQueue)
- **Space Complexity**: O(1)

### 3. `remove()`
- **Description**: Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
- **Time Complexity**: O(1) (for LinkedList and ArrayDeque), O(log n) (for PriorityQueue)
- **Space Complexity**: O(1)

### 4. `poll()`
- **Description**: Retrieves and removes the head of the queue, returning `null` if the queue is empty.
- **Time Complexity**: O(1) (for LinkedList and ArrayDeque), O(log n) (for PriorityQueue)
- **Space Complexity**: O(1)

### 5. `element()`
- **Description**: Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
- **Time Complexity**: O(1)
- **Space Complexity**: O(1)

### 6. `peek()`
- **Description**: Retrieves, but does not remove, the head of the queue, returning `null` if the queue is empty.
- **Time Complexity**: O(1)
- **Space Complexity**: O(1)

### 7. `size()`
- **Description**: Returns the number of elements in the queue.
- **Time Complexity**: O(1)
- **Space Complexity**: O(1)

### 8. `isEmpty()`
- **Description**: Returns `true` if the queue contains no elements.
- **Time Complexity**: O(1)
- **Space Complexity**: O(1)

### 9. `contains(Object o)`
- **Description**: Returns `true` if the queue contains the specified element.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

## Notes
- The **time complexity** depends on the specific implementation of the `Queue` interface:
    - `LinkedList`: O(1) for most operations.
    - `PriorityQueue`: O(log n) for insertion and deletion.
    - `ArrayDeque`: O(1) for most operations.
- **Space complexity** is usually O(1) unless storing additional elements dynamically.

## Conclusion
The `Queue` interface provides essential methods for efficient problem-solving in Java, especially in scenarios involving BFS (Breadth-First Search), task scheduling, and resource management.

