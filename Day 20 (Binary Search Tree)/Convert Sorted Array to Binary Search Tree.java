class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0) {
            return null;
        }
        return help(nums, 0, len - 1);
    }
    TreeNode help(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = mid != left ? help(nums, left, mid - 1) : null;
        root.right = mid != right ? help(nums, mid + 1, right) : null;
        return root;
    }
}