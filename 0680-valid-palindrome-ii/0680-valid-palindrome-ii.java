class Solution {
    public boolean validPalindrome(String s) {

        for(int i = 0, j = s.length()-1; i < j; i++, j--){
            if(s.charAt(i) == s.charAt(j)){
                continue;
            }else{
                return 
                isPalindrome(s, i, j-1) 
                || 
                isPalindrome(s, i+1, j);
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int left, int right){
        for(int i = left, j = right; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}