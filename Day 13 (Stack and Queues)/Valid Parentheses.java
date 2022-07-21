class Solution {
	public boolean isValid(String str) {
		int n = str.length();
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ')') {
				if (s.isEmpty())
					return false;
				else {
					char ch = s.pop();
					if (ch != '(')
						return false;
				}
			} else if (str.charAt(i) == ']') {
				if (s.isEmpty())
					return false;
				else {
					char ch = s.pop();
					if (ch != '[')
						return false;
				}
			} else if (str.charAt(i) == '}') {
				if (s.isEmpty())
					return false;
				else {
					char ch = s.pop();
					if (ch != '{')
						return false;
				}
			} else
				s.push(str.charAt(i));
		}
		return s.isEmpty();
	}
}