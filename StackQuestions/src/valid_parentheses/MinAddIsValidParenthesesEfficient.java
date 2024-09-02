package valid_parentheses;

import java.util.Stack;

public class MinAddIsValidParenthesesEfficient {
    public static void main(String[] args) {
        String s = "()))";
        System.out.println(minAddEfficient(s));
    }
    static int minAddEfficient(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
