class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        boolean negative = exp <0;
        if(negative){
            exp = -exp;
        }
        double ans = 1.0;

        while(exp >0){
            if(exp%2 != 0){
                ans *= x;
            }
            x *= x;
            exp /= 2;
        }
        if(negative){
            ans = 1.0/ans;
        }

       return ans;
     
    }
}
