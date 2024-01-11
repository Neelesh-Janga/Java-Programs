class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[123];
        int oddLettersCount = 0;

        for(char c: s.toCharArray()){
            arr[c]++;
            if(arr[c] % 2 == 0) oddLettersCount--;
            else oddLettersCount++;
        }

        return s.length() - oddLettersCount + (oddLettersCount > 0 ? 1 : 0);
    }
}