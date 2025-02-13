package ma.ecole.SortingAndSearchingAlgorithms;

public class MergeSort {


    // Main function that sorts arr[l..r] using merge()
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int mid=(r+l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private static void merge(int[] arr, int l, int mid, int r) {
        // Find sizes of two subarrays to be merged
        int n1=mid-l+1;
        int n2=r-mid;

        int[] L=new int[n1];
        int []R=new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
        for(int i=0;i<n2;i++)
            R[i]=arr[mid+i+1];

        int ll=l;
        int i=0,j=0;
        while(i<n1 && j<n2) {
            if(L[i]<=R[j]) {
                arr[ll]=L[i];
                i++;

            }else {
                arr[ll]=R[j];
                j++;
            }
            ll++;
        }

        while(i<n1){
            arr[ll]=L[i];
            ll++;
            i++;
        }
        while(j<n2){
            arr[ll]=R[j];
            j++;
            ll++;
        }

    }

    // A utility function to print array of size n
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
