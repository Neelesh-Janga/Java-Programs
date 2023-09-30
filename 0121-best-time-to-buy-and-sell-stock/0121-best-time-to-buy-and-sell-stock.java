class Solution {
    public int maxProfit(int[] prices) {
        int max = -9999999;
        int min = prices[0];
        int size = prices.length;
        for(int i = 0; i < size; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if (prices[i]-min > max){
                max = prices[i]-min;
            }
        }
        return max < 0 ? 0 : max;
    }
}