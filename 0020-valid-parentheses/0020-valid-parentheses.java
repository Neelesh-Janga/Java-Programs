import java.util.*;

class Solution {
    public boolean isValid(String s) {
        char [] arr = new char[s.length()];
        int k = -1;

        for(int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);

            if(token == '{' || token == '[' || token == '('){
                arr[++k] = token;
            }

            if(token == '}' || token == ']' || token == ')'){
                if(k < 0)
                    return false;
        
                char c = arr[k];
                
                if(
                    (token == ')' && c == '(') || 
                    (token == ']' && c == '[') || 
                    (token == '}' && c == '{')) {
                    k--;
                }else{
                    return false;
                }
            }
        }

        return k == -1 ? true : false;
    }
}