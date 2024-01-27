class Solution {
    public int tribonacci(int n) {
        int num1 = 0, num2 = 1, num3 = 1;

        return switch(n){
            case 0 -> num1;
            case 1 -> num2;
            case 2 -> num3;
            default -> {
                int res = 0;
                for(int i = 3; i <= n; i++){
                    res = num1 + num2 + num3;
                    num1 = num2;
                    num2 = num3;
                    num3 = res;
                }

                yield num3;
            }
        };
    }
}