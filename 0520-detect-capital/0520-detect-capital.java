class Solution {
    public boolean detectCapitalUse(String word) {
        int index = 1;
        
        if(word.charAt(0) < 91){
            byte upperFlag = 0, lowerFlag = 0;
            char letter;
            while(index < word.length()){
                letter = word.charAt(index++);
                if(letter > 91 && lowerFlag == 0) lowerFlag = 1;
                if(letter < 91 && upperFlag == 0) upperFlag = 1;
                if(upperFlag == 1 && lowerFlag == 1) return false;
            }
        }else{
            index = 1;
            
            while(index < word.length()){
                if(word.charAt(index++) < 91) return false;
            }
        }
        
        return true;
    }
}