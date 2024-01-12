class Solution {
    public boolean isPowerOfFour(int n) {
        float res = (float)(Math.log(n) / Math.log(4));
        return res == (int) res;
    }
}