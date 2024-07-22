package ma.letcode;

import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int tmp;
        String tomp;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    tmp = heights[i];
                    heights[i]=heights[j];
                    heights[j]=tmp;
                    tomp = names[i];
                    names[i]=names[j];
                    names[j]=tomp;
                }
            }
        }
        return names;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String names[]={"hicham", "missi","rolando","achraf","sabir"};
        int heights[]={1,2,3,4,5};
        System.out.println(Arrays.toString(solution.sortPeople(names, heights)));
    }
}