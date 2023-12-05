class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        maxSum = sum;

        for(int i = k; i < nums.length; i++){
            sum += (nums[i] - nums[i-k]);
            if (sum > maxSum) maxSum = sum;
        }

        return (double)maxSum / k;
    }
}