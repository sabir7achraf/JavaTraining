# Java Arrays Methods for Problem Solving

## Overview
This document lists essential `Arrays` methods in Java that are useful for problem-solving, along with their time complexities.

## Array Methods & Complexities

### 1. **Finding Length of an Array**
```java
int length = arr.length;
```
- **Time Complexity**: `O(1)` (constant time)

### 2. **Accessing an Element**
```java
int value = arr[index];
```
- **Time Complexity**: `O(1)`

### 3. **Updating an Element**
```java
arr[index] = newValue;
```
- **Time Complexity**: `O(1)`

### 4. **Copying an Array**
```java
int[] newArr = Arrays.copyOf(arr, arr.length);
```
- **Time Complexity**: `O(n)`, where `n` is the length of the array

### 5. **Sorting an Array**
```java
Arrays.sort(arr);
```
- **Time Complexity**: `O(n log n)` (uses Dual-Pivot Quicksort for primitives and MergeSort for objects)

### 6. **Binary Search (for Sorted Arrays)**
```java
int index = Arrays.binarySearch(arr, key);
```
- **Time Complexity**: `O(log n)`

### 7. **Filling an Array with a Value**
```java
Arrays.fill(arr, value);
```
- **Time Complexity**: `O(n)`

### 8. **Checking Array Equality**
```java
boolean isEqual = Arrays.equals(arr1, arr2);
```
- **Time Complexity**: `O(n)`

### 9. **Finding Minimum and Maximum in an Array**
```java
int min = Arrays.stream(arr).min().getAsInt();
int max = Arrays.stream(arr).max().getAsInt();
```
- **Time Complexity**: `O(n)`

### 10. **Converting an Array to a List**
```java
List<Integer> list = Arrays.asList(arr);
```
- **Time Complexity**: `O(1)` (for reference-backed list) or `O(n)` (if a new list is created)

### 11. **Reversing an Array**
```java
Collections.reverse(Arrays.asList(arr));
```
- **Time Complexity**: `O(n)`

### 12. **Converting an Array to a String**
```java
String arrayStr = Arrays.toString(arr);
```
- **Time Complexity**: `O(n)`

### 13. **Finding the Sum of an Array**
```java
int sum = Arrays.stream(arr).sum();
```
- **Time Complexity**: `O(n)`

### 14. **Checking if an Array Contains an Element**
```java
boolean contains = Arrays.stream(arr).anyMatch(x -> x == value);
```
- **Time Complexity**: `O(n)`

## Summary Table

| Method                      | Complexity  |
|-----------------------------|------------|
| `arr.length`                | O(1)       |
| `arr[index]`                | O(1)       |
| `arr[index] = value`        | O(1)       |
| `Arrays.copyOf()`           | O(n)       |
| `Arrays.sort()`             | O(n log n) |
| `Arrays.binarySearch()`     | O(log n)   |
| `Arrays.fill()`             | O(n)       |
| `Arrays.equals()`           | O(n)       |
| `Stream.min()/max()`        | O(n)       |
| `Arrays.asList()`           | O(1) / O(n)|
| `Collections.reverse()`     | O(n)       |
| `Arrays.toString()`         | O(n)       |
| `Stream.sum()`              | O(n)       |
| `Stream.anyMatch()`         | O(n)       |

These methods cover the most common operations needed for problem-solving with `Arrays` in Java.

