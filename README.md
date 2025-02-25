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

# List Methods in Java (ArrayList )

This document provides an overview of the commonly used methods in the `ArrayList` and `LinkedList` classes in Java, along with their time complexities.

---

## 1. Addition Methods

### `boolean add(E e)`
- **Description**: Adds an element to the end of the list.
- **Time Complexity**:
  - **ArrayList**: **O(1)** on average, but **O(n)** in case of internal array resizing.
  - **LinkedList**: **O(1)**.

### `void add(int index, E element)`
- **Description**: Adds an element at a specific index.
- **Time Complexity**:
  - **ArrayList**: **O(n)** (shifting of elements).
  - **LinkedList**: **O(1)** if the index is near the beginning or end, otherwise **O(n)**.

### `boolean addAll(Collection<? extends E> c)`
- **Description**: Adds all elements of a collection to the end of the list.
- **Time Complexity**:
  - **ArrayList**: **O(k)** (where `k` is the size of the collection).
  - **LinkedList**: **O(k)**.

### `boolean addAll(int index, Collection<? extends E> c)`
- **Description**: Adds all elements of a collection at a specific index.
- **Time Complexity**:
  - **ArrayList**: **O(n + k)** (where `k` is the size of the collection).
  - **LinkedList**: **O(n + k)**.

---

## 2. Removal Methods

### `E remove(int index)`
- **Description**: Removes the element at a specific index.
- **Time Complexity**:
  - **ArrayList**: **O(n)** (shifting of elements).
  - **LinkedList**: **O(1)** if the index is near the beginning or end, otherwise **O(n)**.

### `boolean remove(Object o)`
- **Description**: Removes the first occurrence of a specific element.
- **Time Complexity**:
  - **ArrayList**: **O(n)** (search + shifting).
  - **LinkedList**: **O(n)** (search).

### `boolean removeAll(Collection<?> c)`
- **Description**: Removes all elements present in the specified collection.
- **Time Complexity**:
  - **ArrayList**: **O(n * k)** (where `k` is the size of the collection).
  - **LinkedList**: **O(n * k)**.

### `void clear()`
- **Description**: Removes all elements from the list.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

---

## 3. Access Methods

### `E get(int index)`
- **Description**: Returns the element at a specific index.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(n)**.

### `E set(int index, E element)`
- **Description**: Replaces the element at a specific index.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(n)**.

---

## 4. Search Methods

### `boolean contains(Object o)`
- **Description**: Checks if the list contains a specific element.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

### `int indexOf(Object o)`
- **Description**: Returns the index of the first occurrence of a specific element.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

### `int lastIndexOf(Object o)`
- **Description**: Returns the index of the last occurrence of a specific element.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

---

## 5. Size and Check Methods

### `int size()`
- **Description**: Returns the number of elements in the list.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(1)**.

### `boolean isEmpty()`
- **Description**: Checks if the list is empty.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(1)**.

---

## 6. Conversion Methods

### `Object[] toArray()`
- **Description**: Returns an array containing all elements of the list.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

### `<T> T[] toArray(T[] a)`
- **Description**: Returns an array containing all elements of the list, with a specific type.
- **Time Complexity**:
  - **ArrayList**: **O(n)**.
  - **LinkedList**: **O(n)**.

---

## 7. Iteration Methods

### `Iterator<E> iterator()`
- **Description**: Returns an iterator over the elements of the list.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(1)**.

### `ListIterator<E> listIterator()`
- **Description**: Returns a bidirectional iterator over the elements of the list.
- **Time Complexity**:
  - **ArrayList**: **O(1)**.
  - **LinkedList**: **O(1)**.

---

## 8. Sublist Methods

### `List<E> subList(int fromIndex, int toIndex)`
- **Description**: Returns a view of a sublist between the specified indices.
- **Time Complexity**:
  - **ArrayList**: **O(1)** (creation of the view).
  - **LinkedList**: **O(1)** (creation of the view).

---

## Summary of Time Complexities

| Method                        | ArrayList       | LinkedList                     |
|-------------------------------|-----------------|--------------------------------|
| `add(E e)`                    | O(1) (O(n) if resizing) | O(1)                          |
| `add(int index, E element)`   | O(n)            | O(n) (O(1) if near ends)       |
| `remove(int index)`           | O(n)            | O(n) (O(1) if near ends)       |
| `remove(Object o)`            | O(n)            | O(n)                          |
| `get(int index)`              | O(1)            | O(n)                          |
| `set(int index, E element)`   | O(1)            | O(n)                          |
| `contains(Object o)`          | O(n)            | O(n)                          |
| `indexOf(Object o)`           | O(n)            | O(n)                          |
| `size()`                      | O(1)            | O(1)                          |
| `isEmpty()`                   | O(1)            | O(1)                          |
| `iterator()`                  | O(1)            | O(1)                          |
| `subList(int from, int to)`   | O(1)            | O(1)                          |

# Méthodes de la classe `HashMap` en Java

La classe `HashMap` en Java fait partie du framework `java.util` et implémente l'interface `Map`. Voici une liste des méthodes les plus couramment utilisées :

## Méthodes de base

- **`void clear()`**  
  Supprime tous les éléments de la `HashMap`.

- **`Object clone()`**  
  Retourne une copie superficielle de cette instance de `HashMap`.

- **`boolean containsKey(Object key)`**  
  Retourne `true` si la `HashMap` contient une entrée pour la clé spécifiée.

- **`boolean containsValue(Object value)`**  
  Retourne `true` si la `HashMap` contient une ou plusieurs clés mappées à la valeur spécifiée.

- **`Set<Map.Entry<K, V>> entrySet()`**  
  Retourne une vue `Set` des entrées (paires clé-valeur) contenues dans la `HashMap`.

- **`V get(Object key)`**  
  Retourne la valeur associée à la clé spécifiée, ou `null` si la clé n'est pas trouvée.

- **`boolean isEmpty()`**  
  Retourne `true` si la `HashMap` est vide.

- **`Set<K> keySet()`**  
  Retourne une vue `Set` des clés contenues dans la `HashMap`.

- **`V put(K key, V value)`**  
  Associe la valeur spécifiée à la clé spécifiée dans la `HashMap`.

- **`void putAll(Map<? extends K, ? extends V> m)`**  
  Copie toutes les entrées de la `Map` spécifiée dans cette `HashMap`.

- **`V remove(Object key)`**  
  Supprime l'entrée pour la clé spécifiée et retourne la valeur associée.

- **`int size()`**  
  Retourne le nombre de paires clé-valeur dans la `HashMap`.

- **`Collection<V> values()`**  
  Retourne une vue `Collection` des valeurs contenues dans la `HashMap`.

## Méthodes par défaut (depuis Java 8)

- **`V getOrDefault(Object key, V defaultValue)`**  
  Retourne la valeur associée à la clé spécifiée, ou `defaultValue` si la clé n'est pas trouvée.

- **`V putIfAbsent(K key, V value)`**  
  Associe la valeur spécifiée à la clé spécifiée si la clé n'est pas déjà associée à une valeur.

- **`boolean remove(Object key, Object value)`**  
  Supprime l'entrée pour la clé spécifiée uniquement si elle est actuellement mappée à la valeur spécifiée.

- **`boolean replace(K key, V oldValue, V newValue)`**  
  Remplace l'entrée pour la clé spécifiée uniquement si elle est actuellement mappée à la valeur spécifiée.

- **`V replace(K key, V value)`**  
  Remplace l'entrée pour la clé spécifiée uniquement si elle est actuellement mappée à une valeur.

- **`void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)`**  
  Remplace chaque valeur par le résultat de la fonction donnée appliquée à chaque entrée.

- **`V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`**  
  Calcule une nouvelle valeur pour la clé spécifiée en utilisant la fonction de remappage.

- **`V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)`**  
  Calcule une nouvelle valeur pour la clé spécifiée si elle n'est pas déjà associée à une valeur.

- **`V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`**  
  Calcule une nouvelle valeur pour la clé spécifiée si elle est déjà associée à une valeur.

- **`V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)`**  
  Fusionne la valeur spécifiée avec la valeur existante associée à la clé spécifiée.

## Méthodes héritées

- **`boolean equals(Object o)`**  
  Compare l'objet spécifié avec cette `HashMap` pour l'égalité.

- **`int hashCode()`**  
  Retourne le code de hachage pour cette `HashMap`.

- **`String toString()`**  
  Retourne une représentation en chaîne de caractères de cette `HashMap`.


# Set Methods in Java (HashSet)

This document provides an overview of the commonly used methods in the `HashSet` class in Java, along with their time complexities.

---

## 1. Addition Methods

### `boolean add(E e)`
- **Description**: Adds an element to the set if it is not already present.
- **Time Complexity**:
  - **Average**: **O(1)**.
  - **Worst Case**: **O(n)** (in case of collisions and rehashing).

---

## 2. Removal Methods

### `boolean remove(Object o)`
- **Description**: Removes a specific element from the set if it is present.
- **Time Complexity**:
  - **Average**: **O(1)**.
  - **Worst Case**: **O(n)** (in case of collisions).

### `void clear()`
- **Description**: Removes all elements from the set.
- **Time Complexity**: **O(n)** (where `n` is the number of elements in the set).

---

## 3. Search Methods

### `boolean contains(Object o)`
- **Description**: Checks if the set contains a specific element.
- **Time Complexity**:
  - **Average**: **O(1)**.
  - **Worst Case**: **O(n)** (in case of collisions).

---

## 4. Size and Check Methods

### `int size()`
- **Description**: Returns the number of elements in the set.
- **Time Complexity**: **O(1)**.

### `boolean isEmpty()`
- **Description**: Checks if the set is empty.
- **Time Complexity**: **O(1)**.

---

## 5. Iteration Methods

### `Iterator<E> iterator()`
- **Description**: Returns an iterator over the elements of the set.
- **Time Complexity**:
  - **To obtain the iterator**: **O(1)**.
  - **To traverse all elements**: **O(n)**.

---

## 6. Conversion Methods

### `Object[] toArray()`
- **Description**: Returns an array containing all elements of the set.
- **Time Complexity**: **O(n)**.

### `<T> T[] toArray(T[] a)`
- **Description**: Returns an array containing all elements of the set, with a specific type.
- **Time Complexity**: **O(n)**.

---

## 7. Set Manipulation Methods

### `boolean addAll(Collection<? extends E> c)`
- **Description**: Adds all elements of a collection to the set.
- **Time Complexity**:
  - **Average**: **O(k)** (where `k` is the size of the collection).
  - **Worst Case**: **O(n + k)**.

### `boolean removeAll(Collection<?> c)`
- **Description**: Removes all elements from the set that are present in the specified collection.
- **Time Complexity**:
  - **Average**: **O(n * k)** (where `k` is the size of the collection).
  - **Worst Case**: **O(n * k)**.

### `boolean retainAll(Collection<?> c)`
- **Description**: Retains only the elements in the set that are present in the specified collection.
- **Time Complexity**:
  - **Average**: **O(n * k)** (where `k` is the size of the collection).
  - **Worst Case**: **O(n * k)**.

---

## 8. Cloning Methods

### `Object clone()`
- **Description**: Returns a shallow copy of the set.
- **Time Complexity**: **O(n)**.

---

## Summary of Time Complexities

| Method                        | Average Case    | Worst Case       |
|-------------------------------|-----------------|------------------|
| `add(E e)`                    | O(1)            | O(n)             |
| `remove(Object o)`            | O(1)            | O(n)             |
| `contains(Object o)`          | O(1)            | O(n)             |
| `size()`                      | O(1)            | O(1)             |
| `isEmpty()`                   | O(1)            | O(1)             |
| `iterator()`                  | O(1) to obtain  | O(n) to traverse |
| `toArray()`                   | O(n)            | O(n)             |
| `addAll(Collection<?>)`       | O(k)            | O(n + k)         |
| `removeAll(Collection<?>)`    | O(n * k)        | O(n * k)         |
| `retainAll(Collection<?>)`    | O(n * k)        | O(n * k)         |
| `clone()`                     | O(n)            | O(n)             |



---

## Notes:
- The **average case** time complexity for basic operations (`add`, `remove`, `contains`) is **O(1)** due to the hash table implementation.
- The **worst case** time complexity is **O(n)** when all elements have the same hash (collision), effectively turning the hash table into a linked list.
- Bulk operations (`addAll`, `removeAll`, `retainAll`) depend on the size of the collection passed as a parameter (`k`).

---
# Sorting Algorithms Overview



## Table of Sorting Algorithms

| Algorithm       | Main Idea                                                                 | Worst-Case Time Complexity | Average Time Complexity | Best-Case Time Complexity | Space Complexity | Stable? |
|-----------------|---------------------------------------------------------------------------|----------------------------|-------------------------|---------------------------|------------------|---------|
| **Bubble Sort** | Compares adjacent elements and swaps them if necessary, repeats until the list is sorted. | O(n²)                      | O(n²)                   | O(n)                      | O(1)             | Yes     |
| **Selection Sort** | Finds the smallest element and places it in the correct position, repeats for the rest of the list. | O(n²)                      | O(n²)                   | O(n²)                     | O(1)             | No      |
| **Insertion Sort** | Builds the sorted array one element at a time by inserting each element in its correct position. | O(n²)                      | O(n²)                   | O(n)                      | O(1)             | Yes     |
| **QuickSort**   | Chooses a pivot, partitions the array into two subarrays (elements < pivot and elements > pivot), then recursively sorts the subarrays. | O(n²)                      | O(n log n)              | O(n log n)                | O(log n)         | No      |
| **MergeSort**   | Divides the array into two halves, recursively sorts each half, then merges the two sorted halves. | O(n log n)                 | O(n log n)              | O(n log n)                | O(n)             | Yes     |
| **HeapSort**    | Builds a heap from the array, then extracts elements one by one to obtain a sorted array. | O(n log n)                 | O(n log n)              | O(n log n)                | O(1)             | No      |
| **Counting Sort** | Counts the number of elements with each value, then reconstructs the sorted array. | O(n + k)                   | O(n + k)                | O(n + k)                  | O(k)             | Yes     |
| **Radix Sort**  | Sorts numbers digit by digit, starting from the least significant digit (LSD) or most significant digit (MSD). | O(nk)                      | O(nk)                   | O(nk)                     | O(n + k)         | Yes     |
| **Bucket Sort** | Distributes elements into buckets, sorts each bucket individually, then concatenates the buckets. | O(n²)                      | O(n + k)                | O(n + k)                  | O(n + k)         | Yes     |
| **Shell Sort**  | Improves Insertion Sort by comparing elements that are far apart, then reducing the gap over time. | O(n²)                      | O(n log² n)             | O(n log n)                | O(1)             | No      |
| **TimSort**     | Hybrid of MergeSort and Insertion Sort, optimized for real-world data (used in Python and Java). | O(n log n)                 | O(n log n)              | O(n)                      | O(n)             | Yes     |

## Key Notes

### Stability
A sorting algorithm is **stable** if it preserves the relative order of equal elements. For example, if two elements have the same value, the one that appeared first in the input will also appear first in the output.

### Time Complexity
- **Worst-case**: The maximum time the algorithm takes for any input of size `n`.
- **Average-case**: The expected time for a random input of size `n`.
- **Best-case**: The minimum time for a specific input (e.g., an already sorted array).

### Space Complexity
Refers to the amount of extra memory the algorithm requires, excluding the input.

### Special Cases
- **Counting Sort** and **Radix Sort** are non-comparison-based algorithms and work well for integers or elements with a limited range (`k`).
- **QuickSort** has a worst-case time complexity of O(n²), but this can be avoided by choosing a good pivot (e.g., randomized pivot).
- **MergeSort** and **HeapSort** guarantee O(n log n) time complexity in all cases but require additional space.

## When to Use Which Algorithm?

| Algorithm       | Best Use Case                                                                 |
|-----------------|-------------------------------------------------------------------------------|
| **Bubble Sort** | Small datasets or educational purposes (not efficient for large datasets).    |
| **Selection Sort** | Small datasets or when memory usage is a concern.                            |
| **Insertion Sort** | Small or nearly sorted datasets.                                             |
| **QuickSort**   | General-purpose sorting (fast in practice, but not stable).                  |
| **MergeSort**   | General-purpose sorting (stable and consistent performance).                  |
| **HeapSort**    | When in-place sorting is required with guaranteed O(n log n) performance.    |
| **Counting Sort** | Sorting integers with a limited range.                                       |
| **Radix Sort**  | Sorting integers or strings with fixed-length keys.                          |
| **Bucket Sort** | Sorting uniformly distributed floating-point numbers.                         |
| **Shell Sort**  | Medium-sized datasets with some optimization over Insertion Sort.            |
| **TimSort**     | Real-world data (used in Python’s `sorted()` and Java’s `Arrays.sort()`).     |

---

# Search Algorithms in Java

## Introduction
This repository contains implementations of various search algorithms in Java, along with their descriptions, time complexities, and use cases.

## Search Algorithms

### 1. Linear Search
**Description:** Iterate through each element in the list until the target is found.

- **Time Complexity:** O(n)
- **Use Case:** Works on unsorted data or small datasets.

```java
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; // Return the index of the target
        }
    }
    return -1; // Target not found
}
```

### 2. Binary Search
**Description:** Efficiently search in a sorted array by repeatedly dividing the search interval in half.

- **Time Complexity:** O(log n)
- **Use Case:** Works only on sorted data.

```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            left = mid + 1; // Search the right half
        } else {
            right = mid - 1; // Search the left half
        }
    }
    return -1; // Target not found
}
```

### 3. Interpolation Search
**Description:** An improvement over binary search for uniformly distributed sorted data.

- **Time Complexity:** O(log log n) on average, O(n) in the worst case.
- **Use Case:** Works best on uniformly distributed sorted data.

```java
public int interpolationSearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right && target >= arr[left] && target <= arr[right]) {
        int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);
        if (arr[pos] == target) {
            return pos; // Target found
        } else if (arr[pos] < target) {
            left = pos + 1; // Search the right half
        } else {
            right = pos - 1; // Search the left half
        }
    }
    return -1; // Target not found
}
```

### 4. Hashing (Hash Table Search)
**Description:** Uses a hash function to map keys to indices in a hash table.

- **Time Complexity:** O(1) on average, O(n) in the worst case.
- **Use Case:** Fast lookups in large datasets.

```java
import java.util.HashMap;

public int hashSearch(HashMap<Integer, Integer> map, int target) {
    if (map.containsKey(target)) {
        return map.get(target); // Return the value associated with the target key
    }
    return -1; // Target not found
}
```

### 5. Ternary Search
**Description:** Similar to binary search but divides the array into three parts instead of two.

- **Time Complexity:** O(log₃ n)
- **Use Case:** Searching in unimodal functions or sorted data.

```java
public int ternarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid1 = left + (right - left) / 3;
        int mid2 = right - (right - left) / 3;
        if (arr[mid1] == target) {
            return mid1;
        }
        if (arr[mid2] == target) {
            return mid2;
        }
        if (target < arr[mid1]) {
            right = mid1 - 1;
        } else if (target > arr[mid2]) {
            left = mid2 + 1;
        } else {
            left = mid1 + 1;
            right = mid2 - 1;
        }
    }
    return -1;
}
```

### 6. Exponential Search
**Description:** Combines binary search with an initial exponential step to find the range.

- **Time Complexity:** O(log n)
- **Use Case:** Searching in unbounded or infinite sorted arrays.

```java
public int exponentialSearch(int[] arr, int target) {
    if (arr[0] == target) {
        return 0;
    }
    int i = 1;
    while (i < arr.length && arr[i] <= target) {
        i *= 2;
    }
    return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
}
```

### 7. Jump Search
**Description:** Jump through the array in fixed steps and perform a linear search.

- **Time Complexity:** O(√n)
- **Use Case:** Searching in sorted arrays where binary search is not feasible.

```java
public int jumpSearch(int[] arr, int target) {
    int step = (int) Math.sqrt(arr.length);
    int prev = 0;
    while (arr[Math.min(step, arr.length) - 1] < target) {
        prev = step;
        step += (int) Math.sqrt(arr.length);
        if (prev >= arr.length) {
            return -1;
        }
    }
    for (int i = prev; i < Math.min(step, arr.length); i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}
```

### 8. Fibonacci Search
**Description:** Uses Fibonacci numbers to divide the array into unequal parts.

- **Time Complexity:** O(log n)
- **Use Case:** Searching in sorted arrays with non-uniform access times.

```java
public int fibonacciSearch(int[] arr, int target) {
    int fibMMm2 = 0;
    int fibMMm1 = 1;
    int fibM = fibMMm2 + fibMMm1;
    while (fibM < arr.length) {
        fibMMm2 = fibMMm1;
        fibMMm1 = fibM;
        fibM = fibMMm2 + fibMMm1;
    }
    int offset = -1;
    while (fibM > 1) {
        int i = Math.min(offset + fibMMm2, arr.length - 1);
        if (arr[i] < target) {
            fibM = fibMMm1;
            fibMMm1 = fibMMm2;
            fibMMm2 = fibM - fibMMm1;
            offset = i;
        } else if (arr[i] > target) {
            fibM = fibMMm2;
            fibMMm1 = fibMMm1 - fibMMm2;
            fibMMm2 = fibM - fibMMm1;
        } else {
            return i;
        }
    }
    if (fibMMm1 == 1 && arr[offset + 1] == target) {
        return offset + 1;
    }
    return -1;
}
```

## Summary of Time Complexities
| Algorithm | Time Complexity | Use Case |
|-----------|----------------|----------|
| Linear Search | O(n) | Unsorted or small datasets |
| Binary Search | O(log n) | Sorted arrays |
| Interpolation Search | O(log log n) | Uniformly distributed sorted data |
| Hashing | O(1) | Fast lookups in large datasets |
| Ternary Search | O(log₃ n) | Unimodal functions or sorted data |
| Exponential Search | O(log n) | Unbounded sorted arrays |
| Jump Search | O(√n) | Sorted arrays where binary search is not feasible |
| Fibonacci Search | O(log n) | Sorted arrays with non-uniform access |







This README provides a concise summary of sorting algorithms, their complexities, and best use cases. Use this as a reference when choosing the appropriate sorting algorithm for your needs.

