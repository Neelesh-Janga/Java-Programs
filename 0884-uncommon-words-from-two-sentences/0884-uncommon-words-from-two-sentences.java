class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> mapS1 = new HashMap<>();
        Map<String, Integer> mapS2 = new HashMap<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        String[] res;
        int count = 0;

        for(String word: arr1){
            mapS1.put(word, mapS1.getOrDefault(word, 0) + 1);
        }

        for(String word: arr2){
            mapS2.put(word, mapS2.getOrDefault(word, 0) + 1);
        }

        for(String word: mapS1.keySet()){
            if(mapS1.get(word) == 1 && !mapS2.containsKey(word))
                set.add(word);
        }

        for(String word: mapS2.keySet()){
            if(mapS2.get(word) == 1 && !mapS1.containsKey(word))
                set.add(word);
        }

        res = new String[set.size()];
        
        for(String word: set) res[count++] = word;

        return res;
    }
}