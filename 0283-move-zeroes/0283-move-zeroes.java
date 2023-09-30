class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int arr[] = new int[size];
        int k = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] != 0){
                arr[k++] = nums[i];
            }
        }
        
        for(int i = 0; i < size; i++){
            nums[i] = arr[i];
        }
    }
}