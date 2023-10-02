class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0];
        int min = Integer.MAX_VALUE;
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