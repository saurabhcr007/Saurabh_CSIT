class Solution {
    public double myPow(double x, int n) {
        if(n<0)
            return 1.0/test(x,Math.abs(n));
        return test(x,n);
    }
    public double test(double x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2==0)
            return test(xx,n/2);
        return xtest(x*x,n/2);
    }
}