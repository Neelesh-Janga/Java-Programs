class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] > 0){
                break;
            }

            for(int j = i+1; j < nums.length-1; j++){
                
                int k = -(nums[i] + nums[j]);
                
                if(map.containsKey(k) && map.get(k) > j){
                    result.add(Arrays.asList(nums[i], nums[j], k));
                }

                j = map.get(nums[j]);
            }

            i = map.get(nums[i]);
        }
        System.gc();
        return result;
    }
}