class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] arr = new int[200];
        int size = s.length();

        for(int i = 0; i < size; i++){
            arr[s.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < size; i++){
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}