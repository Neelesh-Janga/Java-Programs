class Solution {
    public int maximum69Number (int num) {
        StringBuilder numStr = new StringBuilder(Integer.toString(num));
        
        for (int i = 0; i < numStr.length(); i++) {
            if(numStr.charAt(i) == '6'){
                numStr.replace(i, i+1, "9");
                break;
            }
        }

        return Integer.parseInt(numStr.toString());
    }
}