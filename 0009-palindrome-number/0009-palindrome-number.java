class Solution {
    public boolean isPalindrome(int x) {
        int num = x, res = 0;
        
        while(x > 0){
            res = res * 10 + (x % 10);
            x /= 10;
        }

        return num == res;
    }
}