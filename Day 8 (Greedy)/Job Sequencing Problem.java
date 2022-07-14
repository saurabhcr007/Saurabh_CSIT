class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b) -> a.deadline - b.deadline);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int time = 0, profit = 0;
        for(int i = 0; i < n; i ++) {
            int p = arr[i].profit;
            int d = arr[i].deadline;
            if(time + 1 <= d) {
                profit += p;
                pq.offer(p);
                time ++;
            } else {
                if(!pq.isEmpty() && pq.peek() < p) {
                    profit += p - pq.poll();
                    pq.offer(p);
                }
            }
        }
        return new int[]{pq.size(), profit};
        
    }
}