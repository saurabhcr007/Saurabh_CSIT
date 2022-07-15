class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> track = new ArrayList<>();
        backtrack(nums, track, 0, res);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> track, int index, List<List<Integer>> res) {
        res.add(new ArrayList<>(track));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, track, i + 1, res);
            track.remove(track.size() - 1);
        }
    }
}