class Solution {
    public int firstUniqChar(String s) {
        int lowestIndex = Integer.MAX_VALUE;

        for(int start = 'a'; start <= 'z'; start++){
            int currentIndex = s.indexOf(start);
            if(currentIndex != -1 && currentIndex == s.lastIndexOf(start) && lowestIndex > currentIndex) {
                lowestIndex = currentIndex;
            }
        }

        return lowestIndex == Integer.MAX_VALUE ? -1 : lowestIndex;
    }
}