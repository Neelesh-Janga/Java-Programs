class Solution {
    public int mySqrt(int x) {
        
        if(x < 0) return 0;
        
        if(x == 0 || x == 1) return x;

        long high = x/2 + 1;
        long low = 1;

        while(high - low != 1){
            long mid = low + (high - low)/2;
            if(mid * mid > x){
                high = mid;
            }else{
                low = mid;
            }
        }

        return (int)low;
    }
}