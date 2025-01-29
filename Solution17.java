import java.util.Stack;

class Solution17 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {  // Iterate over the input string
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {  // If stack is empty, there's no matching opening bracket
                    return false;
                }
                char top = stack.pop();  // Get the last opened bracket
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();  // If stack is empty, the string is balanced
    }
    
    public static void main(String[] args) {
        Solution17 ob = new Solution17();
        String ex = "()";
        boolean res = ob.isValid(ex);
        System.out.println(res);  // Expected Output: true
    }
}
