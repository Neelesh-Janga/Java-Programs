class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] > 0){
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int j = i+1, k = nums.length-1; 
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum < 0){
                    j++;
                }
                else if (sum > 0){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j < k){
                        j++;
                        if(nums[j] != nums[j-1]) break;
                    }

                    while(j < k){
                        k--;
                        if(nums[k] != nums[k+1]) break;
                    }
                }
            }
        }
        return result;
    }
}
