class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;

        int a = 0, b = 1, res = 1;

        while (n > 2){
            res = a + b;
            a = b;
            b = res;
            n--;
        }

        return a + b;
    }
}