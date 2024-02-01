class Solution {
    public int maximum69Number (int num) {
        char[] arr = Integer.toString(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}