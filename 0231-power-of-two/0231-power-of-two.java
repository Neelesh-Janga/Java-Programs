class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0){
            return false;
        }

        if(n == 1){
            return true;
        }

        double res = Math.log10((long)n) / Math.log10(2);

        return res == (int)res ? true : false;
    }
}