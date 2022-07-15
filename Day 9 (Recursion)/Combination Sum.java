class Solution {
    public void findsum(int[] arr,int n,int target,ArrayList<Integer> ans,List<List<Integer>> res)
    {
        if(n==arr.length)
        {
            if(target==0)
                res.add(new ArrayList<>(ans));
            return;
        }
        if(arr[n]<=target)
        {
            ans.add(arr[n]);
            findsum(arr,n,target-arr[n],ans,res);
            ans.remove(ans.size()-1);
            findsum(arr,n+1,target,ans,res);
        }
        else
        {
            findsum(arr,n+1,target,ans,res);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        findsum(candidates,0,target,ans,res);
        return res;
    }
}