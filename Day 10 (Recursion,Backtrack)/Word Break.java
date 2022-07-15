class Solution {
public boolean wordBreak(String s, List wordDict) {
HashSet dict=new HashSet<>();
for(String word:wordDict){
dict.add(word);
}
int dp[]=new int[s.length()];
return solution(dp,s,dict);
}
static boolean solution(int dp[],String s,HashSet dict){
for(int i=0;i<dp.length;i++){
for(int j=0;j<=i;j++){
String sub=s.substring(j,i+1);
if(dict.contains(sub)){
if(j>0) dp[i]+=dp[j-1];
else dp[i]+=1;
}
}
}
return dp[s.length()-1]>0;
}
}