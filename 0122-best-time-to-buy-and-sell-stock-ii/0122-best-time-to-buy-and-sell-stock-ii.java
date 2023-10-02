class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;

        for(int i = 0; i < prices.length; i++){    

            if(prices[i] < min)
                min = prices[i];

            if(prices[i]-min > 0){
                result += prices[i]-min;
                min = prices[i];
            }
        }

        return result;
    }
}