class Solution 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {		
        // O(n) time | O(n-k+1) space
		if(nums == null || k <= 0) return new int[] {};

		int n = nums.length;
		int[] res = new int[n-k+1];
		int idx = 0;
        
		// use Double end Queue to store index
		Deque<Integer> Q = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) 
        {
			// remove numbers out of range k so we can maintain window as size k
			if(!Q.isEmpty() && Q.peek() < i - k + 1) 
				Q.poll();

			// remove numbers smaller than nums[i] from back since they are useless
            // also update Q as decreasing order
			while(!Q.isEmpty() && nums[Q.peekLast()] < nums[i]) 
				Q.pollLast();

			// Q contains index
			Q.offer(i);
            
            // update res[idx] if and only if window becomes size k
			if(i + 1 >= k)
				res[idx++] = nums[Q.peek()];
		}
		return res;
	}
}