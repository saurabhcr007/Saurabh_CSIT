class GFG 
{
  
    // All denominations of Indian Currency 
    static int deno[] = {1, 2, 5, 10, 20, 
    50, 100, 500, 1000};
    static int n = deno.length;
  
    static void findMin(int V)
    {
        // Initialize result 
        Vector<Integer> ans = new Vector<>();
  
        // Traverse through all denomination 
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations 
            while (V >= deno[i]) 
            {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }
  
        // Print result 
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                " " + ans.elementAt(i));
        }
    }