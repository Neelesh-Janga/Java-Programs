public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return hammingWeight(n, 0);
    }

    public int hammingWeight(int n, int count){
        if (count > 31) return 0;
        return (n & 1) + hammingWeight(n >> 1, count + 1);
    }
}