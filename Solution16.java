import java.util.*;

public class Solution16 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
           
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            
            else {
              
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Solution16 ob = new Solution16();
        String ex = "[]{";
        boolean res = ob.isValid(ex);
        System.out.println(res); // Output: true
    }
}
