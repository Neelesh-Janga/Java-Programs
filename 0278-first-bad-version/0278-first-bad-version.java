/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        int mid = (j - i)/2 + i;
        
        while (i < j){
            if(isBadVersion(mid)){
                j = mid;
            }else{
                i = mid + 1;
            }
            mid = (j - i)/2 + i;
        }

        return mid;
    }
}