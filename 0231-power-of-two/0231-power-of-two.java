class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 1){
            return n == 1 ? true : false;
        }else{
            return 
            Math.log10((long)n) / Math.log10(2) 
            == 
            (long)(Math.log10((long)n) / Math.log10(2)) 
            ? 
            true : false;
        }
    }
}