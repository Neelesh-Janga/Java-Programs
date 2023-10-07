class Solution {
    public int mySqrt(int x) {
        long num = x;
        for(long i = 1; i <= num / 2 + 1; i++){
            long low = i * i;
            long high = (i + 1) * (i + 1);
            if(low <= num && num < high){
                return (int) i;
            }
        }
        return 0;
    }
}