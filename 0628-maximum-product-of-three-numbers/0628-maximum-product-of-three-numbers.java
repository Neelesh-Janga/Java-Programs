class Solution {
    public int maximumProduct(int[] nums) {
        
        int n1 = Integer.MAX_VALUE, n2 = 0, n3 = 0; 
        int p1 = Integer.MIN_VALUE, p2 = 0, p3 = 0;

        for(int i = 0; i < nums.length; i++){
            // For Negative Numbers
            if(nums[i] < n1){
                n3 = n2;
                n2 = n1;
                n1 = nums[i];
            }else if(nums[i] < n2){
                n3 = n2;
                n2 = nums[i];
            }else if(nums[i] < n3){
                n3 = nums[i];
            }

            // For Positive Numbers
            if(nums[i] > p1){
                p3 = p2;
                p2 = p1;
                p1 = nums[i];
            }else if(nums[i] > p2){
                p3 = p2;
                p2 = nums[i];
            }
            else if(nums[i] > p3){
                p3 = nums[i];
            }
        }

        if(p1 == Integer.MIN_VALUE)
            return n1 * n2 * n3;
        if(n1 == Integer.MAX_VALUE)
            return p1 * p2 * p3;

        return Math.max(p1 * p2 * p3, n1 * n2 * p1);
    }
}