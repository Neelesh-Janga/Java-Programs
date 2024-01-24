class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1, len = 0; i >= 0; i--){
            char c = arr[i];
            if(c != '-'){
                if(len == k) {
                    sb.append('-');
                    len = 0;
                }
                sb.append(Character.toUpperCase(c));
                len++;
            }
        }

        return sb.reverse().toString();
    }
}