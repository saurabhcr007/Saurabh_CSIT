class Solution {
	public int largestRectangleArea(int[] h) {
		int n = h.length;
		Stack<Pair> s = new Stack<>();
		// nsr
		int[] nsr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			if (s.isEmpty())
				nsr[i] = n;
			else if (s.peek().ele < h[i])
				nsr[i] = s.peek().idx;
			else {
				while (!s.isEmpty() && s.peek().ele >= h[i]) {
					s.pop();
				}
				if (s.isEmpty())
					nsr[i] = n;
				else
					nsr[i] = s.peek().idx;
			}
			s.push(new Pair(h[i], i));
		}
		// nsl
		int[] nsl = new int[n];
		s = new Stack<>();
		for (int i = 0; i < n; i++) {
			if (s.isEmpty())
				nsl[i] = -1;
			else if (s.peek().ele < h[i])
				nsl[i] = s.peek().idx;
			else {
				while (!s.isEmpty() && s.peek().ele >= h[i]) {
					s.pop();
				}
				if (s.isEmpty())
					nsl[i] = -1;
				else
					nsl[i] = s.peek().idx;
			}
			s.push(new Pair(h[i], i));
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max((nsr[i] - nsl[i] - 1) * h[i], max);
		}
		return max;

	}

	public static class Pair {
		int ele;
		int idx;

		public Pair(int ele, int idx) {
			this.ele = ele;
			this.idx = idx;
		}
	}
}