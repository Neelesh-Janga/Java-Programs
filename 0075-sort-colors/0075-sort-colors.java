class Solution {
    public void sortColors(int[] nums) {
        mergeSort(0, nums.length-1, nums);
    }

    public void mergeSort(int low, int high, int[] arr){
        if(low < high){
            int mid = low + (high-low)/2;
            mergeSort(low, mid, arr);
            mergeSort(mid+1, high, arr);

            sort(arr, low, mid, high);
        }
    }

    public void sort(int [] unsortedArr, int low, int mid, int high){
        int sizeOfLeftArr = mid - low + 1;
        int sizeOfRightArr = high - mid;
        int startIndexOfSortedArr = low;
        int [] leftUnsortedArr = new int[sizeOfLeftArr];
        int [] rightUnsortedArr = new int[sizeOfRightArr];
        
        for(int i = 0; i < sizeOfLeftArr; i++){
            leftUnsortedArr[i] = unsortedArr[i + low];
        }
        for(int i = 0; i < sizeOfRightArr; i++){
            rightUnsortedArr[i] = unsortedArr[i+mid+1];
        }
        int i, j;
        for(i = 0, j = 0; i < sizeOfLeftArr && j < sizeOfRightArr; ){
            if(leftUnsortedArr[i] < rightUnsortedArr[j]){
                unsortedArr[startIndexOfSortedArr++] = leftUnsortedArr[i++];
            }else{
                unsortedArr[startIndexOfSortedArr++] = rightUnsortedArr[j++];
            }
        }

        while(i < sizeOfLeftArr){
            unsortedArr[startIndexOfSortedArr++] = leftUnsortedArr[i++];
        }

        while(j < sizeOfRightArr){
            unsortedArr[startIndexOfSortedArr++] = rightUnsortedArr[j++];
        }
    }
}