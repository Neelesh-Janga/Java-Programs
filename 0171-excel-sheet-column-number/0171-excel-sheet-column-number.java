class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;

        for(int i = columnTitle.length()-1, k = 0; i >= 0; i--, k++){
            res += (columnTitle.charAt(i) - 64) * Math.pow(26, k);
        }

        return res;
    }
}