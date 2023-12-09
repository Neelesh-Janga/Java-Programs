class Solution {
    public int strStr(String haystack, String needle) {
        int hayEnd = haystack.length();
        int needEnd = needle.length();
        
        for(int i = 0; i < hayEnd; i++){
            while (i < hayEnd && haystack.charAt(i) != needle.charAt(0)) i++;

            if(i < hayEnd){
                int start = i + 1;
                int needIndex = 1;
                
                while(start < hayEnd && needIndex < needEnd && haystack.charAt(start) == needle.charAt(needIndex)){
                    start++;
                    needIndex++;
                }

                if (needIndex == needEnd) return i;
            }
        }

        return -1;
    }
}