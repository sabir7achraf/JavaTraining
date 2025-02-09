package ma.ecole.HackerRank;
import java.util.*;
public class JavaStack {



        public static  boolean isBalanced(String input){
            char open1='{';
            char open2='(';
            char close1='}';
            char close2=')';
            char open3='[';
            char close3=']';
            char first=input.charAt(0);
            if(first == close1 || first == close2||first == close3 ){
                return false;
            }
            //{}(
            Deque<Character> opening = new ArrayDeque<>() ;
            for(int i=0;i<input.length();i++){
                char actuel = input.charAt(i);
                if(actuel==open1 || actuel==open2 || actuel==open3){
                    opening.push(actuel);}

                else if(actuel==close1){
                    if(!opening.isEmpty()&& opening.pop()!=open1){
                        return false ;
                    }
                }
                else if(actuel==close2){
                    if(opening.isEmpty()&& opening.pop()!=open2){
                        return false ;
                    }
                }

                else if(actuel==close3){
                    if(opening.isEmpty()&& opening.pop()!=open3){
                        return false ;
                    }
                }
            }

            return false;

        }

        public static void main(String []argh)
        {



            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input=sc.next();
                System.out.println(isBalanced(input));
                //Complete the code
            }
            //find a method to just verefie if  our string is closed or not  ({
            //find inside our strige if there is some other parenthes or bracket ar closed or not (({}))


        }
    }





