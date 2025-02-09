package ma.ecole.HackerRank;
import java.util.*;
public class DequeExe {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();

            int n = in.nextInt();
            int m = in.nextInt();
            int max=1;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
            }
            //m
            for(int i=0 ;i<deque.size();i++){
                int elem=deque.poll();
                int j=1;
                int s=1;
                for(int execute : deque){
                    if(j>=m){
                        break;
                    }
                    if(execute!=elem){
                        s=s+1;
                    }
                    j++;

                }
                if(s>max){
                    max=s;
                }

            }
            System.out.println(max);




        }
    }





