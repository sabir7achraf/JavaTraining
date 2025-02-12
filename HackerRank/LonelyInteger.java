package ma.ecole.HackerRank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class LonelyInteger {



        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */
        public static int lonelyinteger(List<Integer> a) {
            // Write your code here
            int result=0;
            HashMap<Integer,Integer>occurence=new HashMap<>();
            for(int ele : a){
                occurence.put(ele,occurence.getOrDefault(ele, 0)+1);
            }
            Iterator<Map.Entry<Integer,Integer>> iterator = occurence.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer,Integer> entry =iterator.next();
                if(entry.getValue()==1){
                    result=entry.getKey();
                    break;
                }
            }
            return result;

        }
    }

     class Solution1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = LonelyInteger.lonelyinteger(a);

         System.out.println(result);

            bufferedReader.close();

        }
    }


