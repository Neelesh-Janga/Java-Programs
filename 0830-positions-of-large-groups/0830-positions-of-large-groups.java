class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0, j = 0; 

        while (i < s.length()){
            int count = 0;
            char c = s.charAt(i);
            while(j < s.length() && c == s.charAt(j)){
                count++;
                j++;
            }
            if((j == s.length() && count >= 3) || count >= 3) list.add(Arrays.asList(i, j-1));
            i = j;
        }

        return list;
    }
}