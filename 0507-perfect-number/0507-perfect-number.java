class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 0 || num % 2 != 0) return false;

        int res = 1;
        int i = 2;
        int condition = (int) Math.sqrt(num);

        while (i <= condition){
            if(num % i == 0){
                res += i;
                res += (num / i);
            }
            i++;
        }

        if (res == num) return true;

        return false;
    }
}