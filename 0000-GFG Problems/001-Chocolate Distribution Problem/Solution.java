import java.util.*;

class Solution {
    public static void main(String[] args){
    // Input - 1
        // Array of packets
        int arr1[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        // Number of Students
        int m1 = 7;
        
    // Input - 2
        // Array of packets
        int arr2[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        // Number of Students
        int m2 = 5;

        System.out.println("Minimum difference for input-1 is " + findMinDiff(arr1, m1));
        System.out.println("Minimum difference for input-2 is " + findMinDiff(arr2, m2));
    }

    public static int findMinDiff(int arr[], int m){
        if(m == 0 || arr.length == 0 || m > arr.length){
            return 0;
        }
        
        Arrays.sort(arr);
        
        int windowSize = m;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i+m-1 < arr.length; i++){
            if(minDiff > arr[i+m-1] - arr[i])
                minDiff = arr[i+m-1] - arr[i];
        }
        
        return minDiff;
    }
}