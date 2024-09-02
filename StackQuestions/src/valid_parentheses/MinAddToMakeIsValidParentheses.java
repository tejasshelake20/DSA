package valid_parentheses;

import java.util.Stack;

public class MinAddToMakeIsValidParentheses {
    public static void main(String[] args) {
        String s = "()))";
        System.out.println(minAdd(s));
        System.out.println(minAdd2(s));
    }

    static int minAdd(String s){
        Stack<Character> a = new Stack<>();
        int ans = 0;
        int i = 0;
        while(i < s.length()){

            if((!a.isEmpty()) && ((a.peek() == '(' && s.charAt(i) == ')') )){
                a.pop();
            }
            else {
                a.push(s.charAt(i));
            }
            i++;
        }
        while (!a.isEmpty()){
            a.pop();
            ans++;
        }
        return ans;
    }

    static int minAdd2(String s){
        Stack<Character> a = new Stack<>();
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                a.push(ch);
            }
            else {
                if(ch == ')'){
                    if(a.isEmpty() || a.peek() != '('){
                        a.push(ch);
                    }
                    else {
                        a.pop();
                    }
                }
                if(ch == '}'){
                    if(a.isEmpty() || a.peek() != '{'){
                        a.push(ch);
                    }
                    else {
                        a.pop();
                    }
                }
                if(ch == ']'){
                    if(a.isEmpty() || a.peek() != '['){
                        a.push(ch);
                    }
                    else {
                        a.pop();
                    }
                }
            }
        }

        while (!a.isEmpty()){
            a.pop();
            ans++;
        }
        return ans;

    }
}
