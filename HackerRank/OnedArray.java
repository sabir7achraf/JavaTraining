package ma.ecole.HackerRank;
import java.util.*;
public class OnedArray {


        public static boolean canWin(int leap, int[] game) {
            // Return true if you can win the game; otherwise, return false.

            int n=game.length;
            boolean []visited = new boolean[game.length];
            Queue<Integer> quee = new LinkedList<Integer>();

            quee.add(0);
            while(quee.size()!=0){
                int i=quee.poll();
                if(i+leap>=n){
                    return true;
                }
                else {
                    visited[i]=true;
                    if(i+leap<n){
                        if(game[i+leap]==0){
                            quee.add(i+leap);
                        }
                    }

                    if(game[i+1]==0){
                        quee.add(i+leap);
                    }
                    if(i>0){if(game[i-1]==0){
                        quee.add(i+leap);
                    }}


                }
            }




            return false; }








        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }
    }


