package com.company.rohit.session8;

import java.util.Stack;

public class CheckParenthesis {
    public static void main(String[] args) {
        String str = "{()[}}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            {
                stack.push(str.charAt(i));
            } else {
                char open = findOpenBracket(str.charAt(i));
                char ch = stack.pop();
                if(ch != open) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static char findOpenBracket(char ch) {
        if (ch == ']') {
            return '[';
        } else if (ch == '}') {
            return '{';
        } else {
            return '(';
        }
    }
}
