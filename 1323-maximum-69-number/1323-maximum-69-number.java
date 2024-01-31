class Solution {
    public int maximum69Number (int num) {
        String numStr = Integer.toString(num);
        String ans = "";
        boolean check = false;
        
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '9') {
                ans = numStr.substring(0, i) + '9' + numStr.substring(i + 1, numStr.length());
                check = true;
            }

            if (check) break;
        }

        return ans.isEmpty() ? num : Integer.parseInt(ans);
    }
}