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
        
        String res = minStr;
        
        for(int i = 0; i < strs.length; i++){
            while(!res.isEmpty()){
                if(strs[i].startsWith(res)){
                    break;
                }else{
                    res = res.substring(0, res.length()-1);
                }
            }
        }

        return res;
    }
}