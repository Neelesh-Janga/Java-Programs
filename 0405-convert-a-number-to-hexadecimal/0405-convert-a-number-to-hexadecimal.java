class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        long unsignedNum = num;

        if (num < 0) unsignedNum = 4_294_967_296L + num;

        StringBuilder result = new StringBuilder();
        
        while (unsignedNum > 0) {
            int mod = (int)(unsignedNum % 16);
            result.append(getCharValue(mod));
            unsignedNum /= 16;
        }
        
        return result.reverse().toString();
    }

    private char getCharValue(int num){
        return switch(num){
            case 10 -> 'a';
            case 11 -> 'b';
            case 12 -> 'c';
            case 13 -> 'd';
            case 14 -> 'e';
            case 15 -> 'f';
            default -> (char)(num + '0');
        };
    }
}