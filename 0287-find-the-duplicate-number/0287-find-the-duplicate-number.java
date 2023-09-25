class Solution {
    public int findDuplicate(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], i);
            }else{
                return nums[i];
            }
        }
        return 0;
    }
}