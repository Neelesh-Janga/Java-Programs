class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) 
            return false;

        int N = n;
        
        for (int i = 2; n > 1 && i < N/2 + 1; i++){
            if (n % 2 == 0) n /= 2;
            else if (n % 3 == 0) n /= 3;
            else if (n % 5 == 0) n /= 5;
            else return false;
        }

        return true;
    }
}