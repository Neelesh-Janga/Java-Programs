class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0, j = 1;
        
        if(nums.length == 0) return list;
        if(nums.length == 1) {
            list.add(getSummary(nums[i], nums[j-1]));
            return list;
        }

        while (i < nums.length && j < nums.length){
            if(nums[j] - nums[j-1] != 1){
                list.add(getSummary(nums[i], nums[j-1]));
                i = j;
            }

            j++;
        }

        list.add(getSummary(nums[i], nums[j-1]));

        return list;
    }

    public String getSummary(int start, int end){
        StringBuilder sb = new StringBuilder();
        if (start != end) {
            sb.append(start);
            sb.append("->");
            sb.append(end);
            return sb.toString();
        }
        else {
            sb.append(start);
            return sb.toString();
        }
    }
}