class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < min){
                min = prices[i];
            }

            if (prices[i] - min > max){
                max = prices[i] - min;
            }
        }

        return max < 0 ? 0 : max;
    }
}