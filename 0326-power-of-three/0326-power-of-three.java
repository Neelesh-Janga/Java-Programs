class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0 || n % 2 == 0) return false;

        // (3 ^ 19) % (3 ^ x) == 0 --> within int range, if we compute mod of highest power of 3
        // with the given number, we get zero if the given number is power of 3.
        return 1162261467 % n == 0;
    }
}