class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0, count;

        int [] arr = new int[20_001];

        for(int i: nums){
            arr[i+10_000] = arr[i+10_000] + 1;
        }
        
        for(int i = 0, k = 0; i < 20_001; i++){
            count = arr[i];
            while(count > 0){
                nums[k++] = i - 10_000;
                count--;
            }
        }

        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }

        return sum;
    }
}