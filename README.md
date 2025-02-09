# Arrays Utility Methods in Java

This document provides an overview of the commonly used methods in the `Arrays` class in Java, along with their time complexities.

## 1. Sorting Methods

### `Arrays.sort(int[] a)`
- **Description**: Sorts the specified array into ascending numerical order.
- **Time Complexity**:
  - For primitive types (e.g., `int[]`, `double[]`): **O(n log n)** (uses Dual-Pivot Quicksort).
  - For objects (e.g., `Object[]`, `String[]`): **O(n log n)** (uses TimSort).

### `Arrays.sort(int[] a, int fromIndex, int toIndex)`
- **Description**: Sorts a subarray within the specified range.
- **Time Complexity**: Same as above.

### `Arrays.parallelSort(int[] a)`
- **Description**: Sorts the array in parallel using a parallel sort-merge algorithm.
- **Time Complexity**: **O(n log n)** on average, with better performance on multi-core systems.

## 2. Searching Methods

### `Arrays.binarySearch(int[] a, int key)`
- **Description**: Searches the specified array for the specified value using the binary search algorithm.
- **Time Complexity**: **O(log n)** (requires the array to be sorted).

### `Arrays.binarySearch(Object[] a, Object key)`
- **Description**: Searches the specified array of objects for the specified value using binary search.
- **Time Complexity**: **O(log n)** (requires the array to be sorted).

## 3. Comparison Methods

### `Arrays.equals(int[] a, int[] b)`
- **Description**: Compares two arrays for equality.
- **Time Complexity**: **O(n)** (where `n` is the length of the arrays).

### `Arrays.deepEquals(Object[] a, Object[] b)`
- **Description**: Compares two arrays deeply (for nested arrays).
- **Time Complexity**: **O(n)** (where `n` is the total number of elements, including nested arrays).

## 4. Filling Methods

### `Arrays.fill(int[] a, int val)`
- **Description**: Assigns the specified value to each element of the array.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

### `Arrays.fill(int[] a, int fromIndex, int toIndex, int val)`
- **Description**: Assigns the specified value to each element of the specified range.
- **Time Complexity**: **O(n)** (where `n` is the length of the range).

## 5. Copying Methods

### `Arrays.copyOf(int[] original, int newLength)`
- **Description**: Copies the specified array, truncating or padding with zeros (if necessary).
- **Time Complexity**: **O(n)** (where `n` is the length of the new array).

### `Arrays.copyOfRange(int[] original, int from, int to)`
- **Description**: Copies the specified range of the array.
- **Time Complexity**: **O(n)** (where `n` is the length of the range).

## 6. Hashing Methods

### `Arrays.hashCode(int[] a)`
- **Description**: Returns a hash code based on the contents of the array.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

### `Arrays.deepHashCode(Object[] a)`
- **Description**: Returns a hash code based on the deep contents of the array.
- **Time Complexity**: **O(n)** (where `n` is the total number of elements, including nested arrays).

## 7. Conversion Methods

### `Arrays.asList(T... a)`
- **Description**: Returns a fixed-size list backed by the specified array.
- **Time Complexity**: **O(1)** (creates a view of the array).

### `Arrays.toString(int[] a)`
- **Description**: Returns a string representation of the array.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

### `Arrays.deepToString(Object[] a)`
- **Description**: Returns a string representation of the deep contents of the array.
- **Time Complexity**: **O(n)** (where `n` is the total number of elements, including nested arrays).

## 8. Stream Methods

### `Arrays.stream(int[] a)`
- **Description**: Returns a sequential stream with the specified array as its source.
- **Time Complexity**: **O(1)** (creates a stream view of the array).

### `Arrays.stream(int[] a, int startInclusive, int endExclusive)`
- **Description**: Returns a sequential stream for the specified range of the array.
- **Time Complexity**: **O(1)** (creates a stream view of the range).

## 9. Parallel Prefix Methods

### `Arrays.parallelPrefix(int[] array, IntBinaryOperator op)`
- **Description**: Performs a parallel prefix computation on the array.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

## 10. Miscellaneous Methods

### `Arrays.spliterator(int[] a)`
- **Description**: Returns a spliterator over the specified array.
- **Time Complexity**: **O(1)**.

### `Arrays.setAll(int[] array, IntUnaryOperator generator)`
- **Description**: Sets all elements of the array using the provided generator function.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

### `Arrays.parallelSetAll(int[] array, IntUnaryOperator generator)`
- **Description**: Sets all elements of the array in parallel using the provided generator function.
- **Time Complexity**: **O(n)** (where `n` is the length of the array).

## Summary of Time Complexities

| Method Category       | Time Complexity |
|-----------------------|-----------------|
| Sorting               | O(n log n)      |
| Searching             | O(log n)        |
| Comparison            | O(n)            |
| Filling               | O(n)            |
| Copying               | O(n)            |
| Hashing               | O(n)            |
| Conversion            | O(n) or O(1)    |
| Stream                | O(1)            |
| Parallel Prefix       | O(n)            |
| Miscellaneous         | O(n) or O(1)    |
