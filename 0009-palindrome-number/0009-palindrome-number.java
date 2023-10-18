class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;

        int num = x, res = 0;
        
        while(x > 0){
            res = res * 10 + (x % 10);
            x /= 10;
        }

        return num == res;
    }
}