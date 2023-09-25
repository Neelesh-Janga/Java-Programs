class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int num = x, res = 0;

        while(num != 0){
            int rem = num % 10;
            res = res * 10 + rem;
            num /= 10;
        }

        return x == res ? true : false;
    }
}