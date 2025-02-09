package ma.ecole.HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EoF {
        public static void main(String[] args) {
            String msg ;
            List<String> ls= new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while(true){
                msg= sc.nextLine();
                if(msg.equals("")){
                    break;
                }
                ls.add(msg);
            }

            int i=1;
            for(String ourMsg : ls){
                System.out.println(i+" "+ ourMsg);
                i++;
            }
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
    }


