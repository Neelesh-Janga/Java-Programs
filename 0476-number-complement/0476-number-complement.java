class Solution {
    public int findComplement(int num) {
        int res = 0;
        int i = 0;

        while(num != 0){
            res += ((num & 1) == 1 ? 0 : Math.pow(2, i));
            num >>= 1;
            i++;
        }

        return res;
    }
}