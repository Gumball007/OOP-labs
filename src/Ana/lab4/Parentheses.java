package Ana.lab4;

import java.util.Stack;

public class Parentheses{
    public String text;

    public String Balance() {
        if (this.text.isEmpty())
            return "Balanced";

        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < this.text.length(); i++) {
            char c = this.text.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return "Incorrect";
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return "Incorrect";
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return "Incorrect";
                }
            }

        }
        return "Incorrect";
    }
}