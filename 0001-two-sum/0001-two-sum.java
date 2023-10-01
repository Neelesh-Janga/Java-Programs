class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer, Integer> myMap = new HashMap<>();
        ArrayList list = new ArrayList();
        int [] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            // list.add(myMap.put(nums[i], i));
            list.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];
            if(list.contains(res) && list.indexOf(res) != i){
                result[0] = i;
                result[1] = list.indexOf(res);
                break;
            }
        }
        return result;
    }
}