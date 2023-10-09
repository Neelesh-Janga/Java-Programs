import java.util.*;

class Solution {
    public static void main(String[] args) {
        Map<Character, Integer> map = displayDuplicateStringsWithFrequencies("abbcccaxycc");
        for(Map.Entry m : map.entrySet()){
            System.out.println("Char=" + m.getKey()+" ::: Count="+m.getValue());    
       }  

    }
    
    public static Map<Character, Integer> displayDuplicateStringsWithFrequencies(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i), value);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1){
                map.remove(s.charAt(i));
            }
        }
        
        return map;
    }
}