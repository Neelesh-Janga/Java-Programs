class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0, j = nums.length-1; i <= j; i++, j--){
            if(map.containsKey(target-nums[i])) 
                return new int[] {map.get(target-nums[i]), i};
            
            map.put(nums[i], i);
            
            if(map.containsKey(target-nums[j])) 
                return new int[] {map.get(target-nums[j]), j};
            
            map.put(nums[j], j);
        }
        
        return new int[2];
    }
}
