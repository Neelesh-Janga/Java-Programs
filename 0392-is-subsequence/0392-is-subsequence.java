class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(t);
        int i = sb2.length()-1, j = sb1.length()-1;

        while(i >= 0 && j >= 0){
            if(sb1.charAt(j) == sb2.charAt(i))
                j--;
            i--;
        }

        if(j < 0) return true;
        else return false;
    }
}