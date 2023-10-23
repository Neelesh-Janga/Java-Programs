class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length-1; i++){
            int res = target - nums[i];
            if(map.containsKey(res) && map.get(res) != i){
                result[0] = i;
                result[1] = map.get(res);
            }
        }

        return result;
    }
}