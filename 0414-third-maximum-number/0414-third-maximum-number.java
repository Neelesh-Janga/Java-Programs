class Solution {
    public int thirdMax(int[] nums) {
        long firstMaxNum = Long.MIN_VALUE;
        long secondMaxNum = Long.MIN_VALUE;
        long thirdMaxNum = Long.MIN_VALUE;

        for(int num: nums){
            if(num > firstMaxNum){
                thirdMaxNum = secondMaxNum;
                secondMaxNum = firstMaxNum;
                firstMaxNum = num;
            }else if(num > secondMaxNum && num != firstMaxNum){
                thirdMaxNum = secondMaxNum;
                secondMaxNum = num;
            }else if(num > thirdMaxNum && num != firstMaxNum && num != secondMaxNum){
                thirdMaxNum = num;
            }
        }

        return thirdMaxNum == Long.MIN_VALUE ? (int)firstMaxNum : (int)thirdMaxNum;
    }
}