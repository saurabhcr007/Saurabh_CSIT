class Solution
{
    
    

 public static long[] nextLargerElement(long[] arr, int n)
   { 
       Stack<Long> s1=new Stack<>();
       Stack<Long> s2=new Stack<>();
       
   s1.add(arr[n-1]);
   s2.add(-1L);
   
   for(int i=n-2;i>=0;i--){
       Long a=arr[i];
       if(a<s1.peek()){
           s2.add(s1.peek());
           s1.add(a);
       }
       else{
           while(!s1.isEmpty()&& a>s1.peek())
           s1.pop();
           if(s1.isEmpty())
           s2.add(-1L);
           else{
           s2.add(s1.peek());
           
           }
           s1.add(a);
       }
   }
   int i=0;
   while(i<n && !s2.isEmpty()){
       arr[i++]=s2.pop();
   }
   return arr;
   }  
}