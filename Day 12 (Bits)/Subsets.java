class Solution {
    List<List<Integer>> output = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        
        if(nums.length == 0){
            return output;
        }
            backTrack(0,new ArrayList<Integer>(),nums);
         return output;
        }
        public void backTrack(int start, ArrayList<Integer> current,int[] nums){
            output.add(new ArrayList<Integer> (current));
            for(int i = start; i< nums.length;i++){
                current.add(nums[i]);
                backTrack(i+1, current,nums);
                current.remove(current.size()-1);
            }
        }
        
       
    }