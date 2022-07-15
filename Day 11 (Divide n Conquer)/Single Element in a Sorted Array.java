class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;
        }
        if(nums[0] != nums[1]){
            return nums[0] ;
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1] ;
        }
        return solve(nums,0,nums.length-1) ;
    }
    
    public int solve(int[] nums,int start,int end){
        if(start >= end){
            return nums[end] ;
        }
        int mid = start + (end-start)/2 ;
        
        if(nums[mid] == nums[mid-1]){
            if((mid-start+1)%2 == 0){
                return solve(nums,mid+1,end) ;
            }else{
                return solve(nums,start,mid) ;
            }
        }else if(nums[mid] == nums[mid+1]){
            if((end-mid+1)%2 == 0){
                return solve(nums,start,mid-1) ;
            }else{
                return solve(nums,mid,end) ;
            }
        }else{
            return nums[mid] ;
        }
    }
}