class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int p1 = a.length()-1;
        int p2 = b.length()-1;
        int sum = 0;
        String res = "";

        while(p1 >= 0 || p2 >= 0 || carry == 1){
            // '0' - 48, '1' - 49, '2' - 
            char c1 = (p1 >= 0 ? a.charAt(p1) : '0');
            char c2 = (p2 >= 0 ? b.charAt(p2) : '0');
            
            sum = c1 + c2 + carry;
            
            if(sum > 48 + 49){
                carry = 1;
                res = (sum - 2 * 49) + res;
            }else {
                carry = 0;
                res = (sum - 2 * 48) + res;
            }
            
            p1--;
            p2--;
        }

        return res;
    }
}