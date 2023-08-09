package Valid_Parentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "{[]}";
        String s5 = "[";
        String s6 = "((";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        //key: opening, value: closing
        HashMap<Character, Character> openToClose = new HashMap<>() {{
            put( ')', '(' );
            put( ']', '[' );
            put( '}', '{' );
        }};

        for(char c : s.toCharArray()) {
            if(openToClose.containsValue(c)) {
                stack.push(c);
            } else {  //closing parentheses
                if(!stack.empty() && stack.peek().equals(openToClose.get(c))) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

}
