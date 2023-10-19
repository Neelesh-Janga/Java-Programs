class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, num, n = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        num = (n*(n+1)/2) - sum;

        return num;
    }
}