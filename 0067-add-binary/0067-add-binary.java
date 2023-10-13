class Solution {
    public String addBinary(String a, String b) {
        int hold = 0;
        int pl = a.length() <= b.length() ? b.length()-1 : a.length()-1;
        int ps = a.length() < b.length() ? a.length()-1 : b.length()-1;
        String res = "", longStr = a.length() <= b.length() ? b : a, shortStr = a.length() <= b.length() ? a : b;
        
        while(true){
            if(pl < 0 && ps < 0){
                return hold == 1 ? "1" + res : res;
            }
            else if(pl >= 0 && ps >= 0){
                if(longStr.charAt(pl) == '0' && shortStr.charAt(ps) == '0'){
                    res = hold + res;
                    hold = 0;
                }else if(longStr.charAt(pl) == '1' && shortStr.charAt(ps) == '1'){
                    res = hold + res;
                    hold = 1;
                }else if(longStr.charAt(pl) != shortStr.charAt(ps)){
                    res = (hold == 0 ? 1 : 0) + res;
                }
                pl--;
                ps--;
            }else{
                if(longStr.charAt(pl) == '0'){
                    res = hold + res;
                    hold = 0;
                }
                else if(longStr.charAt(pl) == '1'){
                    res = (hold == 0 ? 1 : 0) + res;
                }
                pl--;
            }

            System.out.print(hold);
        }
    }
}