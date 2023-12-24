class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false, desc = false;
        int i = 1;

        while(i < nums.length){
            if(inc && desc) return false;
            else if(!inc && nums[i] > nums[i-1]) inc = true;
            else if(!desc && nums[i] < nums[i-1]) desc = true;
            i++;
        }

        return !(inc && desc);
    }
}