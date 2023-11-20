class Solution {
    public int addDigits(int num) {
        int val = num;
        int res = 0;
        while(val >= 10){
            val = (val % 10) + (val / 10);
        }

        return val;
    }
}