class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        
        for(int i = 0; i < nums2.length; i++){
            for(int j = i+1; j < nums2.length; j++){
                if(nums2[i] < nums2[j]){
                    arr[nums2[i]] = nums2[j];
                    break;
                }
            }
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = arr[nums1[i]] > 0 ? arr[nums1[i]] : -1;
        }

        return nums1;
    }
}