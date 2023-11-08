public class Solution {
    // you need to treat n as an unsigned value
    private int count = 0;
    public int hammingWeight(int n) {
        if (count > 31) return 0;
        count++;
        return (n & 1) + hammingWeight(n >> 1);
    }
}