class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int count = 1, candidate = 0;
        for(int i = 1; i < nums.length ; i++) {
            count = nums[candidate] == nums[i] ? ++count : --count;
            if(count == 0) {
                count = 1;
                candidate = i;
            }
        }
        return nums[candidate];
    }
}