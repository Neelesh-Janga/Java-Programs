class Solution {
    public int arrangeCoins(int n) {
        int stair = 0;
        
        for(int i = 1; i <= n; i++){
            if(n < i) return stair;
            stair++;
            n -= i;
        }

        return stair;
    }
}