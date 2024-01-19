class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        int[] res;
        int count = 0;

        for(int num: nums1){
            if(arr[num] == 0) arr[num]++;
        }
        
        for(int num: nums2){
            if(arr[num] == 1) {
                count++;
                arr[num]++;
            }
        }

        res = new int[count];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                res[--count] = i;
            }
        }

        return res;
    }
}