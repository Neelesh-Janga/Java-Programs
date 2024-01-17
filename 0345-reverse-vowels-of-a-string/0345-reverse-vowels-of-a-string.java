class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        char[] c = s.toCharArray();
        byte[] vowels = new byte[123];
        vowels['a'] = 1; vowels['e'] = 1; vowels['i'] = 1; vowels['o'] = 1; vowels['u'] = 1;
        vowels['A'] = 1; vowels['E'] = 1; vowels['I'] = 1; vowels['O'] = 1; vowels['U'] = 1;

        while(i < j){
            if(vowels[c[i]] == 1 && vowels[c[j]] == 1){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;   
            }
            if (vowels[c[i]] != 1){
                i++;
            }
            if (vowels[c[j]] != 1){
                j--;
            }
        }

        return new String(c);
    }
}