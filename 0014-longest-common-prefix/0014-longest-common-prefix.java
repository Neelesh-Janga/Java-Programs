class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String minStr = strs[0];
        int minLen = Integer.MAX_VALUE; 
        for(String s: strs){
            if(s.length() < minLen){
                minLen = s.length();
                minStr = s;
            }
        }
        
        String res = "";
        
        for(int i = 0; i < minLen; i++){
            int flag = 0;
            char subStr = minStr.charAt(i);
            for(int j = 0; j < strs.length; j++){
               if(strs[j].charAt(i) != subStr){
                   flag = 1;
                   break;
               } 
            }
            if(flag == 0){
                res += subStr;
            }else{
                break;
            }
        }


        return res;
    }
}