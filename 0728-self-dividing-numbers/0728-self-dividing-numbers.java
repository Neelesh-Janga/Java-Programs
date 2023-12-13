class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        
        while(left <= right) {
            if(computeCheck(left)) list.add(left);
            left++;
        }

        return list;
    }

    public boolean computeCheck(int number){
        int i = number;
        while(i > 0){
            if(i % 10 == 0 || (number % (i % 10) != 0)) return false;
            i /= 10;
        }
        return true;
    }
}