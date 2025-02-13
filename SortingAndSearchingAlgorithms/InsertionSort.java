package ma.ecole.SortingAndSearchingAlgorithms;

public class InsertionSort {


    // we start by two element and we insert the third extera....
    // we tak a element and we put it in the right position after a shifting (dof3a li amam) for the lower elements
    public static void insertionSort(int[] arr) {
     int n = arr.length;
     for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) { //for shifting element
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;

     }





    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        System.out.println(1/2);
    }


}
