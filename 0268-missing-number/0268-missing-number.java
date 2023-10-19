class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = nums.length; i >= 0; i--){
            if(!map.containsKey(i)){
                return i;
            }
        }

        return 0;
    }
}