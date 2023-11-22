class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] list = s.split(" ");
        Map<Character, String> map = new HashMap<>();
    
        if(pattern.length() != list.length) return false;

        for(int i = 0; i < list.length; i++){
            char letter = pattern.charAt(i);
            String word = list[i];
            if(map.containsKey(letter)){
                if(!map.get(letter).equals(word)) return false;
            }else{
                if(map.containsValue(word)) return false;
                map.put(letter, word);
            }
        }

        return true;
    }
}