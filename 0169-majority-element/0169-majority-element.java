class Solution {
    public int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0 && number != nums[i]){
                number = nums[i];
                count = 1;
            }
            else 
                count = (number == nums[i]) ? count+1 : count-1;
        }

        return number;
    }
}