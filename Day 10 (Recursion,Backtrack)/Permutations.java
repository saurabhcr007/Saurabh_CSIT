class Solution {
// swaping function :
	public void swap(int[] nums , int i , int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public void rec(int[] nums , List<List<Integer>> ans , int i){
		// base case:
		if(i==nums.length){
			// convert array to list :
			List<Integer> ls = new ArrayList<>();
			for(int x=0; x<nums.length; x++){
				ls.add(nums[x]);
			}
			ans.add(new ArrayList(ls));
			return;
		}

		for(int j=i; j<nums.length; j++){
			swap(nums , i , j);  // swaping
			rec(nums , ans , i+1);
			swap(nums , i , j); // backtracking
		}
	}
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int index = 0;
		rec(nums, ans , index);
		return ans;
	}
}