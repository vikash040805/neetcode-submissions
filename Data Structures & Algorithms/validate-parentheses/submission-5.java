class Solution {
    public boolean isValid(String st) {
        Deque<Character> stack=new ArrayDeque<>();
        if(st.length()%2!=0) return false;
        char[] c=st.toCharArray();
        for(int i=0;i<st.length();i++){
            if(c[i]=='(' || c[i]=='{' || c[i]=='['){
                stack.push(c[i]);
            }
            
                else if(c[i]==')' && !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else if(c[i]=='}' && !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else if(c[i]==']' && !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            
        }
        return stack.isEmpty();
        
    }
}
