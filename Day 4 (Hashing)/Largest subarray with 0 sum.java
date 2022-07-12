class GfG
{
   int maxLen(int arr[], int n)
   {
       // Your code here
       HashMap<Integer,Integer>map=new HashMap<>();
       
       int sum=0;
       map.put(0,-1);
       int len=0;
       for(int i=0;i<n;i++){
           
           sum=sum+arr[i];
           if(map.containsKey(sum)){
              int temp_len=i-map.get(sum);
              if(len<temp_len){
                  len=temp_len;
              }
           }else{
               map.put(sum,i);
              }
       }
       return len;
   }
}