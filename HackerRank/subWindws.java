package ma.ecole.HackerRank;

public class subWindws {


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 5};
        int k = 3; // Window size
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Max Sum: " + maxSum); // 10
    }

}
