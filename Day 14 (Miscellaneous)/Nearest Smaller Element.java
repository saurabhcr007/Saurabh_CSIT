public class Solution {
public int[] prevSmaller(int[] A) {
Stack<Integer> stack = new Stack<>();
int[] arr=new int[A.length];
for(int i=0;i<A.length;i++){
int x=-1;
while(!stack.isEmpty() && stack.peek()>=A[i]){
stack.pop();
}
if(!stack.isEmpty()){
x=stack.peek();
}
arr[i]=x;
stack.push(A[i]);
}
return arr;
}
}