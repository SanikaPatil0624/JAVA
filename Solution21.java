import java.util.*;

class Solution21 {
    
    
    public int evalRPN(String[] str) {
        
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (!operators.contains(str[i])) {
                stack.push(str[i]);
            } else {
                
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
            
                switch (str[i]) {
                    case "+":
                        stack.push(String.valueOf(b + a));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(b * a));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }
        int returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }

    public static void main(String[] args) {
        Solution21 s=new Solution21();
        String[] str = new String[] { "2", "1", "+", "3", "*" };
        int res=s.evalRPN(str);
        System.out.println(res);
        
    }
}
