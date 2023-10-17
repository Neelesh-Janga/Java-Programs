class Solution {
    public boolean isHappy(int n) {
        int fastSum = n;
        int slowSum = n;

        do{
            fastSum = calculateSum(calculateSum(fastSum));
            slowSum = calculateSum(slowSum);
            if(slowSum == 1 || fastSum == 1) return true;
        }while (fastSum != slowSum);

        return false;
    }

    public int calculateSum(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}