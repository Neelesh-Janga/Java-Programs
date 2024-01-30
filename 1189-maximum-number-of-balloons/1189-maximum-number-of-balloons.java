class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26], count = new int[26];
        int min = text.length();
        
        for (int i = 0; i < text.length(); i++)
            arr[text.charAt(i) - 'a']++;

        for (char c : "balloon".toCharArray())
            count[c - 'a']++;
        
        for (char c : "balloon".toCharArray())
            min = Math.min(min, arr[c - 'a'] / count[c - 'a']);
        
        return min;
    }
}