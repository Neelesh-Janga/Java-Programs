class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer(x+"");
        return (x+"").equals(sb.reverse().toString());
    }
}