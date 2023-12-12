class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        for(int i = 0; i < stones.length(); i++){
            res += (jewels.indexOf(stones.charAt(i)) != -1 ? 1 : 0);
        }

        return res;
    }
}