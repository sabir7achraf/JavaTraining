package ma.ecole.letcode;

class Solution {
    public long maxKelements(int[] nums, int k) {
        int indexMax;
        int score=0;
        for(int j=0;j<k;j++){
            indexMax=maxNums(nums);
            score=score+nums[indexMax];
            nums[indexMax]=ceil(nums[indexMax]/3);
        }
        return score;
    }
    public int maxNums(int[] nums){
        int Max=0;
        int indexMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>Max) {
                Max = nums[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public int ceil(float val ){
    if(val==(int)val){
        return (int)val;

    }else{
        return (int)val +1;
    }

    }
    public static void main(String[] args) {
      int  []nums={1,10,3,3,3};
      System.out.println(new Solution().maxKelements(nums,3));
    }

}