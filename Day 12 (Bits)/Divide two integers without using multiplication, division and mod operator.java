class GFG {
    static long divide(long dividend, long divisor)
    {
        long sign
            = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
 
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        long quotient = 0;
 
        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        if (sign == -1)
            quotient = -quotient;
 
        return quotient;
    }
}