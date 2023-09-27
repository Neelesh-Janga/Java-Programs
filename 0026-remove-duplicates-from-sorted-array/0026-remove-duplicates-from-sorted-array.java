class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(swap(nums, i) == 1){
                k++;
            }else{
                break;
            }
        }
        return k;
    }

    public int swap(int [] nums, int index){
        int beforeElement = nums[index-1];
        for(int i = index; i < nums.length; i++){
            if(nums[i] > beforeElement){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                return 1;
            }
        }
        return 0;
    }
}