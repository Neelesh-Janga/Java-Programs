class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "", t1 = "";
        int sHash = 0, tHash = 0;

        for(int i = s.length()-1, j = t.length()-1; i >= 0 || j >= 0;){
            if(i >= 0){
                if(s.charAt(i) == '#') {
                    sHash++;
                    i--;
                }
                else{
                    if(sHash > 0) {
                        sHash--;
                        i--;
                    }else{
                        s1 = s.charAt(i) + s1;
                        i--;
                    }
                }
            }

            if(j >= 0){
                if(t.charAt(j) == '#') {
                    tHash++;
                    j--;
                }
                else{
                    if(tHash > 0) {
                        tHash--;
                        j--;
                    }else{
                        t1 = t.charAt(j) + t1;
                        j--;
                    }
                }
            }
        }
        System.out.println(s1 + " - " + t1);
        return s1.equals(t1);
    }
}