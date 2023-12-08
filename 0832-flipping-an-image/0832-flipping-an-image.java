class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            image[i] = flipAndInvertSubArray(image[i]);
        }

        return image;
    }

    public int[] flipAndInvertSubArray(int [] arr){
        int temp;

        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] == 1 ? 0 : 1;
        }

        return arr;
    }
}