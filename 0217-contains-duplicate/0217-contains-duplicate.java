class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-2){
                return nums[i] == nums[i+1] ? true : false;
            }
            else if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}