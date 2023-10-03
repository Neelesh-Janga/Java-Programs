class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int [] hash = new int[nums.length+1];
        
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            
            hash[nums[i]] += 1;

            if(hash[nums[i]] == 2){
                res.add(nums[i]);
            }
        }

        return res;
    }
}