class Solution 
{
   static class Meeting{
       int s;
       int e;
       Meeting(int s,int e){
           this.s = s;
           this.e = e;
       }
   }
   public static int maxMeetings(int start[], int end[], int n)
   {
       PriorityQueue<Meeting> pq = new PriorityQueue<>((p1,p2)->(p1.e-p2.e));
       for(int i=0;i<n;i++){
           pq.add(new Meeting(start[i],end[i]));
       }
       int count = 1;
       Meeting prev = pq.poll();
       while(!pq.isEmpty()){
           Meeting pol = pq.poll();
           if(pol.s > prev.e){
               count++;
               prev = pol;
           }
       }
       return count;
   }
}