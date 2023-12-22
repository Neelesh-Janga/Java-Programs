class Solution {
    public String removeDuplicates(String s) {
        char[] stack = s.toCharArray();
        int top = -1;
        
        for(char letter: stack){
            if(top != -1 && letter == stack[top]){
                top--;
            }else{
                stack[++top] = letter;
            }
        }

        return new String(stack, 0, top+1);
    }
}