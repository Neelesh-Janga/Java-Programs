class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        
        s = s.strip();

        for(int i = s.length()-1; i >= 0 && s.charAt(i) != ' '; i--){
            len++;
        }

        return len;
    }
}