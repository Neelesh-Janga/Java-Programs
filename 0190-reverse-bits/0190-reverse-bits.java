public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        int res = 0, i = 31;
        
        while(i >= 0){
            if((n & 1) == 1) res = res + (1 << i);
            n >>= 1;
            i--;
        }

        return res;
    }
}
