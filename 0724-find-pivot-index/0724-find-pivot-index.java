class Solution {
    public int pivotIndex(int[] nums) {
        int prevSum = 0, totalSum = 0, i = 0;

        for(int num: nums){
            totalSum += num;
        }

        while(i < nums.length){
            if( (2 * prevSum) == (totalSum - nums[i]) ) return i;
            prevSum += nums[i++];
        }

        return -1;
    }
}