# Java String Methods for Problem Solving

## Overview
This document lists essential `String` methods in Java that are useful for problem-solving, along with their time complexities.

## String Methods & Complexities

### 1. **Length of a String**
```java
int length = str.length();
```
- **Time Complexity**: `O(1)` (constant time)

### 2. **Character at a Specific Index**
```java
char ch = str.charAt(index);
```
- **Time Complexity**: `O(1)`

### 3. **Substring Extraction**
```java
String sub = str.substring(start);
String sub = str.substring(start, end);
```
- **Time Complexity**: `O(n)`, where `n` is the length of the substring

### 4. **Concatenation**
```java
String newStr = str1 + str2;
String newStr = str1.concat(str2);
```
- **Time Complexity**: `O(n + m)`, where `n` and `m` are the lengths of the strings

### 5. **String Comparison**
```java
boolean isEqual = str1.equals(str2);
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 6. **Lexicographic Comparison**
```java
int result = str1.compareTo(str2);
int result = str1.compareToIgnoreCase(str2);
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 7. **Checking Prefix and Suffix**
```java
boolean starts = str.startsWith(prefix);
boolean ends = str.endsWith(suffix);
```
- **Time Complexity**: `O(k)`, where `k` is the length of the prefix/suffix

### 8. **Searching for a Character or Substring**
```java
int index = str.indexOf('a');
int index = str.indexOf("abc");
int lastIndex = str.lastIndexOf("abc");
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 9. **Replacing Characters or Substrings**
```java
String replaced = str.replace('a', 'b');
String replaced = str.replaceAll("regex", "replacement");
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 10. **Splitting a String**
```java
String[] parts = str.split(" ");
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 11. **Trimming Whitespace**
```java
String trimmed = str.trim();
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 12. **Converting Case**
```java
String lower = str.toLowerCase();
String upper = str.toUpperCase();
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 13. **Converting to Character Array**
```java
char[] chars = str.toCharArray();
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string

### 14. **Checking if a String is Empty or Blank**
```java
boolean isEmpty = str.isEmpty();
boolean isBlank = str.isBlank();
```
- **Time Complexity**: `O(n)`, where `n` is the length of the string (for `isBlank()`)
- **Time Complexity**: `O(1)` for `isEmpty()`

## Summary Table

| Method                 | Complexity |
|------------------------|------------|
| `length()`             | O(1)       |
| `charAt(i)`           | O(1)       |
| `substring(a, b)`      | O(n)       |
| `concat()`             | O(n + m)   |
| `equals()`             | O(n)       |
| `compareTo()`          | O(n)       |
| `startsWith()`         | O(k)       |
| `indexOf()`            | O(n)       |
| `replace()`            | O(n)       |
| `split()`              | O(n)       |
| `trim()`               | O(n)       |
| `toLowerCase()`        | O(n)       |
| `toCharArray()`        | O(n)       |
| `isEmpty()`            | O(1)       |
| `isBlank()`            | O(n)       |

These methods cover the most common operations needed for problem-solving with `String` in Java.

