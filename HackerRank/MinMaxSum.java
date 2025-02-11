package ma.ecole.HackerRank;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

   public class MinMaxSum {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Long> arr) {
            // Write your code here
            Collections.sort(arr);
            int maxSum=0;
            int minSum=0;
            for (int i=0;i<arr.size();i++){
                if(i!=arr.size()-1){
                    minSum+=arr.get(i);
                }
                if(i!=0){
                    maxSum+=arr.get(i);
                }
            }
            System.out.print(minSum+" "+maxSum);
        }

    }

     class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .collect(toList());

            MinMaxSum.miniMaxSum(arr);

            bufferedReader.close();
        }
    }





