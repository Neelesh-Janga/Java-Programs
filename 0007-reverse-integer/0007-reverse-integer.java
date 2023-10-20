class Solution {
    public int reverse(int x) {

        long res = 0, sign = 1;

        if(x < 0){
            sign = -1;
            x = -x;
        }

        while(x > 0){
            res = res * 10 + (x % 10);
            x /= 10;
        }

        if(res > Integer.MAX_VALUE){
            return 0;
        }

        return (int)(sign * res);
    }
}