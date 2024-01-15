class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1, j = num2.length()-1, carry = 0, sum = 0;

        while (i >= 0 || j >= 0 || carry > 0){
            int number1 = (i < 0 ? 0 : num1.charAt(i) - '0');
            int number2 = (j < 0 ? 0 : num2.charAt(j) - '0');
            sum = number1 + number2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}