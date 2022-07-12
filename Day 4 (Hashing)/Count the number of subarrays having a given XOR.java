public class GFG {
 
    static long subarrayXor(int arr[],
                             int n, int m)
    {
         
        long ans = 0;
        for (int i = 0; i < n; i++)
        {
            int xorSum = 0;
            for (int j = i; j < n; j++)
            {
                xorSum = xorSum ^ arr[j];
                if (xorSum == m)
                    ans++;
            }
        }
         
        return ans;
    }
    public static void main(String args[])
    {
 
        int[] arr = { 4, 2, 2, 6, 4 };
        int n = arr.length;
        int m = 6;
 
        System.out.println("Number of subarrays"
                       + " having given XOR is "
                       + subarrayXor(arr, n, m));
    }
}