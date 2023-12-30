class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            sb.append(c == '.' ? "[.]" : c);
        }

        return sb.toString();
    }
}