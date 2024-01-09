class NumArray {

    private int[] computedSum;

    public NumArray(int[] nums) {
        this.computedSum = new int[nums.length];

        computedSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++){
            computedSum[i] = nums[i] + computedSum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return computedSum[right] - (left == 0 ? 0 : computedSum[left - 1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */