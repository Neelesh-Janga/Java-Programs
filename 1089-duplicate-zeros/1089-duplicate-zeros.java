class Solution {
    public void duplicateZeros(int[] arr) {
        int i = arr.length-1;
        int j = i;

        for(int k = 0; k <= i; k++){
            if(arr[k] == 0) j++;
        }

        while(i >= 0 && i != j){
            if(j < arr.length) arr[j] = arr[i];
            j--;
            if(arr[i] == 0) {
                if(j < arr.length) arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}