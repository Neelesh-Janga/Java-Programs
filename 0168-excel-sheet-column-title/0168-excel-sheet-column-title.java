class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer res = new StringBuffer();

        while(columnNumber > 0){
            int mod = columnNumber % 26;
            res.append((char) (mod == 0 ? (90) : (mod + 64)));
            columnNumber = columnNumber / 26;
            if(mod == 0) columnNumber--;
        }

        return res.reverse().toString();
    }
}