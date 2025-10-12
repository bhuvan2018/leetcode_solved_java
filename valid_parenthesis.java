import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if (c=='(' || c=='{' || c=='[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c==')' && top!='(') ||
                    (c=='}' && top!='{') ||
                    (c==']' && top!='[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
public class valid_parenthesis{
    public static void main(String args[]){
        Solution sol=new Solution();
        String s="()[]{}";
        System.out.print(sol.isValid(s));
    }
}