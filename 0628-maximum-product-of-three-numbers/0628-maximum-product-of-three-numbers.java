class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0] * nums[1] * nums[2];
        int b = nums[0] * nums[1] * nums[nums.length-1];
        int c = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int d = nums[nums.length-1] * nums[nums.length-2] * nums[0];

        if(a > b){
            if(a > c){
                if(a > d){
                    return a;
                }else{
                    return d;
                }
            }else{
                if(c > d){
                    return c;
                }else{
                    return d;
                }
            }
        }else{
            if(b > c){
                if(b > d){
                    return b;
                }else{
                    return d;
                }
            }else{
                if(c > d){
                    return c;
                }else{
                    return d;
                }
            }
        }        
    }
}