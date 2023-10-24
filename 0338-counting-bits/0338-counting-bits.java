class Solution {
    public int[] countBits(int n) {
        int [] res = new int[n+1];

        for(int i = 1; i <= n; i++){
            res[i] = res[i & (i-1)] + 1;
        }

        return res;
    }
}