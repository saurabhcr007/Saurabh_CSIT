class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return Collections.emptyList();
        
        Arrays.sort(nums);
        
        List<List<Integer>> sums = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            
            //avoid dups
            while(i > 0 && i < nums.length - 1 && nums[i] == nums[i - 1]) i++;
            
            int l = i + 1;
            int r = nums.length - 1;
            
            
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum == 0) {
                    sums.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    //avoid dups
                    while (l < r && nums[l] == nums[l-1]) l++;
                }
                
                else if (sum < 0) {
                    l++;
                }
                
                else {
                    r--;
                }
            }
            
        }
        
        return sums;
    }
}