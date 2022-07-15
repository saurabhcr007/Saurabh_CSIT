class Solution{   
public:
    int median(vector<vector<int>> &matrix, int r, int c){
        vector<int>res;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res.push_back(matrix[r][c]);
            }
        }
        sort(res.begin(),res.end());
        int a=(r*c)/2;
        return res[a];
        // code here          
    }
};