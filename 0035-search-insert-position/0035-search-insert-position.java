class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        else if(target < nums[0]) return 0;
        else if(target > nums[nums.length-1]) return nums.length;
        
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) 
                return i;
            else if(target < nums[i] && index == -1) 
                index = i; 
        }

        return index;
    }
}
