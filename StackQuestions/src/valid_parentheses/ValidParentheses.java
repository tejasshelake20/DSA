package valid_parentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(()[]{})";
        System.out.println(isValidGreedy(s));
        System.out.println(isValidEfficient(s));
    }

    static boolean isValidGreedy(String s){
        Stack<Character> a = new Stack<>();
        int i = 0;
        while(i < s.length()){

            if((!a.isEmpty()) && ((a.peek() == '(' && s.charAt(i) == ')') || (a.peek() == '{' && s.charAt(i) == '}') || (a.peek() == '[' && s.charAt(i) == ']'))){
                a.pop();
            }
            else {
                a.push(s.charAt(i));
            }
            i++;
        }
        if (a.isEmpty()){
            return true;
        }
        return false;
    }

    static boolean isValidEfficient(String s){
        Stack<Character> a = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                a.push(ch);
            }
            else {
                if(ch == ')'){
                    if(a.isEmpty() || a.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(a.isEmpty() || a.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(a.isEmpty() || a.pop() != '['){
                        return false;
                    }
                }
            }
            }
        return a.isEmpty();
        }
}
