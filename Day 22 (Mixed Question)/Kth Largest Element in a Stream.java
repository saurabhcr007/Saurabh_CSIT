class KthLargest {
    private int k;
    private Queue<Integer> heap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>((a,b)->a-b);
        for(int v : nums){
            heap.offer(v);
            if(heap.size()>k) heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>k) heap.poll();
        return heap.peek();
    }
}