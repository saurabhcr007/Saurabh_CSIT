class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
// code here
ArrayList<integer> ans = new ArrayList<integer>();
if(n==0) {ans.add(0); return ans;}
else{

int c=0;
solve(arr,0,n-1,0);

return ans;
    
}
}

public void solve(ArrayList<Integer> arr, int l, int r, int sum)
{
if(n==0) return;
if(l>r)
{
ans.add(sum);
return;
}
solve(arr,l+1,r,sum+ans.get(i));
solve(arr,l+1,r,sum);
}
}