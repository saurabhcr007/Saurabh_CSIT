class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<>();
        sum(candidates,target,tempList,list,0);
        return list;
    }
    public void sum(int[] candidates,int target,ArrayList<Integer> tempList,List<List<Integer>> list,int index)
    {
        if(target == 0){
            list.add(new ArrayList(tempList));
            return;
        }
        if(target < 0)
        {
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(i > index && candidates[i-1]==candidates[i]) continue;
            tempList.add(candidates[i]);
            sum(candidates,target-candidates[i],tempList,list,i+1);
            tempList.remove(tempList.size()-1);
        }      
    }
}