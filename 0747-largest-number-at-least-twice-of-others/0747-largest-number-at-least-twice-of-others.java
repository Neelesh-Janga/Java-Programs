class Solution {
    public int dominantIndex(int[] nums) {
        int firstLargest = -1, secondLargest = -1, firstLargestIndex = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > firstLargest){
                firstLargestIndex = i;
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }else if(nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }

        return firstLargest >= (2 * secondLargest) ? firstLargestIndex : -1;
    }
}