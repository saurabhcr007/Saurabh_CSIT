class Solution
{
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new Comparator<Item>() {
            public int compare (Item a, Item b) {
                double r1 = (double)a.value / (double)a.weight;
                double r2 = (double)b.value / (double)b.weight;
                
                if (r1 < r2) 
                    return 1;
                else
                    return -1;
            }  
        });
        
        double maxProfit = 0;
        int currWeight = W;
        
        for (int i = 0; i < n; i++) {
            if (arr[i].weight <= currWeight) {
                maxProfit += arr[i].value;
                currWeight -= arr[i].weight;
            }
            else {
                maxProfit += (double)currWeight * ((double)arr[i].value / (double)arr[i].weight);
                break;
            }
        }
        
        return maxProfit;
    }
}