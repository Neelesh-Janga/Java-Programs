class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum=0, bobSum=0, diffAvg;
        Set<Integer> set = new HashSet();

        for(int i = 0; i < aliceSizes.length; i++){
            aliceSum = aliceSum + aliceSizes[i];
        }

        for(int i = 0; i < bobSizes.length; i++){
            bobSum = bobSum + bobSizes[i];
            set.add(bobSizes[i]);
        }

        diffAvg = (aliceSum - bobSum)/2;

        for(int i = 0; i < aliceSizes.length; i++){
            if(set.contains(aliceSizes[i] - diffAvg))
                return new int[] {aliceSizes[i], aliceSizes[i] - diffAvg};
        }

        return new int[]{-1, -1};
    }
}