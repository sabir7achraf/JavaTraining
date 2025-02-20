package ma.ecole.HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Pangram {




    class Result {

        /*
         * Complete the 'pangrams' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String pangrams(String s) {
            // Write your code here
            // String all ="abcdefghijklmnopqrstywz";
            HashSet<Character> ourString = new HashSet<>();
            s.toLowerCase();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' '){
                    ourString.add(s.charAt(i));
                }

            }
            if(ourString.size()==26){
                return "pangram";
            }

            else {
                System.out.println(ourString.size());
                return "not pangram";
            }

        }

    }


        public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Result.pangrams(s));

        }


}
