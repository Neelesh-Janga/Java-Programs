class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        int prevIndex = -1, nextIndex = computeNextIndex(s, c, 0);

        if(nextIndex != Integer.MAX_VALUE){
            prevIndex = nextIndex;
        }

        for(int i = 0; i < arr.length; i++){
            if(i > nextIndex){
                prevIndex = nextIndex;
                nextIndex = computeNextIndex(s, c, i);
            }
            arr[i] = Math.abs(Math.min(nextIndex - i, i - prevIndex));
        }

        return arr;
    }

    public int computeNextIndex(String s, char c, int currentIndex){
        while(currentIndex < s.length() && s.charAt(currentIndex) != c){
            currentIndex++;
        }

        if(currentIndex >= s.length()) return Integer.MAX_VALUE;
        
        return currentIndex;
    }
}