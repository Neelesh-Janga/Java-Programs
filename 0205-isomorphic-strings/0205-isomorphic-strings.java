class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;

        char [] map1 = new char[256];
        char [] map2 = new char[256];

        for(int i = 0; i < s.length(); i++){
            if(map1[s.charAt(i)] != 0){
                if(map1[s.charAt(i)] != t.charAt(i)) return false;
            }else{
                if(map2[t.charAt(i)] != 0){
                    if(map2[t.charAt(i)] != s.charAt(i)) return false;
                }else{
                    map2[t.charAt(i)] = s.charAt(i);
                }
                map1[s.charAt(i)] = t.charAt(i);
            }
        }

        return true;
    }
}