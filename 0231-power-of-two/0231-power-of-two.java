class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 1){
            return n == 1 ? true : false;
        }else{
            double res = Math.log10((long)n) / Math.log10(2);
            return res == (long)res ? true : false;
        }
    }
}