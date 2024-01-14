class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num, mid;
        
        while(left <= right){
            mid = left + (right - left)/2;
            if(num > mid * mid) left = mid + 1;
            else if (num < mid * mid) right = mid - 1;
            else return true;
        }

        return false;
    }
}