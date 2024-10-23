package ma.ecole.letcode;

public class SortMerge {


    public void sort(int[]nums1,int m,int[] nums2,int n){
        int j=0;
        for(int i=m;i<n+m;i++,j++){
            nums1[i]=nums2[j];
        }
        for(int k=0;k<m+n;k++){
            for(int l=k;l<n+m;l++){
                if (nums1[k] > nums1[l]){
                    int r = nums1[k];
                    nums1[k] = nums1[l];
                    nums1[l] = r;
                }
            }
        }
    }


    public static void main(String[] args) {
        int []nums1={4,5,6,0,0,0};
        int []nums2={1,2,3};
        SortMerge sortMerge=new SortMerge();
        sortMerge.sort(nums1,3,nums2,nums2.length);
    }
}
