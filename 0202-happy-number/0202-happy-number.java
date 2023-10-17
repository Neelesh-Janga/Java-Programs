class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        ArrayList<Integer> list = new ArrayList<>();

        int sum = calculateSum(n);
        
        while(!list.contains(sum)){
            list.add(sum);
            if(sum == 1) return true;
            sum = calculateSum(sum);
        }
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