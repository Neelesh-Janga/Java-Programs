class Solution {
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();

        for(
            int p1 = a.length()-1, p2 = b.length()-1, carry = 0; 
            p1 >= 0 || p2 >= 0 || carry == 1; 
            p1--, p2--)
            {

            // '0' - 48, '1' - 49, '2' - 
            char c1 = (p1 >= 0 ? a.charAt(p1) : '0');
            char c2 = (p2 >= 0 ? b.charAt(p2) : '0');
            
            int sum = c1 + c2 + carry;
            
            if(sum > 97){
                res.append((sum - 98));
                carry = 1;
            }else {
                res.append((sum - 96));
                carry = 0;
            }
        }

        return res.reverse().toString();
    }
}