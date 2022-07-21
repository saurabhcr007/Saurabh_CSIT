public class Solution {
    public static int findMSB(int n) {
		int res=(int)(Math.log(n)/Math.log(2));
		return (int)(Math.pow(2,res));
    }
}