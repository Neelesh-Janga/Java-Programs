class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";

        while(columnNumber > 0){
            int mod = columnNumber % 26;
            res = (char) (mod == 0 ? (90) : (mod + 64)) + res;
            columnNumber = columnNumber / 26;
            if(mod == 0) columnNumber--;
        }

        return res;
    }
}