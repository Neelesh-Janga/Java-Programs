class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0, max = 0;
        int[] res = new int[100];

        for(int[] arr: dominoes){
            int unitsPlace = Math.min(arr[0], arr[1]);
            int tensPlace = Math.max(arr[0], arr[1]);

            max += res[tensPlace * 10 + unitsPlace]++;
        }

        return max;
    }
}