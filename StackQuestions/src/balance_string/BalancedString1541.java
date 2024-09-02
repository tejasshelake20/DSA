package balance_string;

import java.util.Stack;

public class BalancedString1541{
    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minInsertions(s));;
    }

    static int minInsertions(String s) {
        int left = 0; // count of unmatched '('
        int insertions = 0; // count of insertions needed

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                left++;
            } else { // ch == ')'
                    if (i+1 == s.length() || s.charAt(i + 1) != ')') {
                    insertions++;
                    } else {
                        i++;
                    }
                    if (left == 0) {
                        insertions++;
                    } else {
                        left--;
                    }
                }
            }
        return insertions + 2 * left;
    }

}
