class Solution {
    public String convertToBase7(int num) {
        int res = 0;
        int digitPlace = 1;
        
        while (num != 0) {
            res += digitPlace * (num % 7);
            digitPlace *= 10;
            num /= 7;
        }
        
        return Integer.toString(res);
    }
}