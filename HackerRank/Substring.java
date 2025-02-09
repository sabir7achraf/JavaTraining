package ma.ecole.HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Substring {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] arr3 = {{1, 2}, {5, 6}};

        int []row =new int[10];


        String s = "hello world world 142";
        String replaced = s.replace("[^1-9]", "number");
        System.out.println(replaced);


        int[] arr = {1, 2, 2, 3, 4, 4};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates); // [2, 4]

        int a= 110%100;
        System.out.println(a);

        System.out.println(Arrays.deepEquals(arr1, arr2));
    }
}
