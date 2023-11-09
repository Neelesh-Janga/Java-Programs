public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        long res = 0;

        for(int i = 0; i < 32; i++){
            System.out.print(n&1);
            res += Math.pow(2, 31-i) * (n & 1);
            n >>= 1;
        }

        return (int)res;
    }
}
