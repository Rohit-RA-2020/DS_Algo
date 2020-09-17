package com.company.rohit.session8;

//  import java.util.Stack;

public class StackClient {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();

        DynamicStack stack = new DynamicStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
