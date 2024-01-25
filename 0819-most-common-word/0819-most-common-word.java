class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int freq = 0;
        String res = "";
        Map<String, Integer> map = new HashMap<>();

        for(String str: paragraph.toLowerCase().split("\\W+"))
            if(!contains(str, banned)) map.put(str, map.getOrDefault(str, 0) + 1);

        for(String str : map.keySet()){
            if(map.get(str) > freq){
                freq = map.get(str);
                res = str;
            }
        }
        return res;
    }

    public boolean contains(String word, String[] banned){
        for(String s: banned) if(word.equals(s)) return true;
        return false;
    }
}