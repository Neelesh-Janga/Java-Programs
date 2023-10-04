class Solution {
    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;
        int left = 0, right = height.length-1;

        while(left < right){        
            int currentArea =  (height[left] < height[right] ? height[left++] : height[right--]) * (right - left + 1);
            if(currentArea > max){
                max = currentArea;
            }
        }

        return max;
    }
}