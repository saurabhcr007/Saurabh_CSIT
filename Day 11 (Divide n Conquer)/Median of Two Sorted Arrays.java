class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0&nums2.length==0){
            return 0;
        }
        int[]finalArr=new int[nums1.length+nums2.length];
        int n1=0;
        int n2=0;
        for(int i=0;i<finalArr.length;i++){
            if(n2>=nums2.length||(n1<nums1.length&&nums1[n1]<=nums2[n2])){
                finalArr[i]=nums1[n1];
                n1++;
            }else{
                finalArr[i]=nums2[n2];
                n2++;
            }
        }
        return finalArr.length%2==1?finalArr[finalArr.length/2]:(finalArr[(finalArr.length/2)-1]+finalArr[(finalArr.length/2)])/2.0;
        
    }
}