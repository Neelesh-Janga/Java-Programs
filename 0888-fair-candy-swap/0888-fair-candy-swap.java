class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum=0, bobSum=0, diffAvg;
        byte[] arr = new byte[1_00_001];

        for(int i = 0; i < aliceSizes.length; i++){
            aliceSum = aliceSum + aliceSizes[i];
        }

        for(int i = 0; i < bobSizes.length; i++){
            bobSum = bobSum + bobSizes[i];
            arr[bobSizes[i]] = 1;
        }

        diffAvg = (aliceSum - bobSum)/2;

        for(int i = 0, required; i < aliceSizes.length; i++){
            required = aliceSizes[i] - diffAvg;
            if(required >= 0 && required < 1_00_001 && arr[required] == 1)
                return new int[] {aliceSizes[i], required};
        }

        return new int[]{-1, -1};
    }
}