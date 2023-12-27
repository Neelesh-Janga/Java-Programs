class Solution {
    public int binaryGap(int n) {
        int max = 0;
        // 32 represents integer size in bits & is used to detect single 1's case Eg: 2, 4, 8, 16, 32 etc
        for (int count = -32; n > 0; count++) {
            if (n % 2 == 1) {
                max = Math.max(max, count);
                count = 0;
            }
            n /= 2;
        }

        return max;
    }
}