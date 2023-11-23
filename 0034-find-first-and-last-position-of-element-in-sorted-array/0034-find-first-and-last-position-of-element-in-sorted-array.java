class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        int i = 0, j = nums.length-1;

        if(nums.length == 0) return arr;
        
        while(i <= j){
            if(arr[0] != -1 && arr[1] != -1) return arr;
            if(nums[i] == target && arr[0] == -1) arr[0] = i;
            if(nums[j] == target && arr[1] == -1) arr[1] = j;
            i = (arr[0] == -1) ? i+1 : i;
            j = (arr[1] == -1) ? j-1 : j;
        }

        return arr;
    }
}