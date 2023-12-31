class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuffer sbS = new StringBuffer(s);
        StringBuffer sbT = new StringBuffer(t);
        int sPtr = -1, tPtr = -1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                sPtr++;
                sbS.setCharAt(sPtr, s.charAt(i));
            }else{
                if(sPtr > -1) sPtr--;
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#'){
                tPtr++;
                sbT.setCharAt(tPtr, t.charAt(i));
            }else{
                if(tPtr > -1) tPtr--;
            }
        }

        if(sPtr != tPtr) return false;

        return (sbS.substring(0, sPtr+1)).equals(sbT.substring(0, tPtr+1));
    }
}