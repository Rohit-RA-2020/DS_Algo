package com.company.rohit.session8;

public class CustomStack {
    protected int[] data;
    private final int DEFAULT_SIZE = 10;
    protected int top = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item) {
        if(isfull()) {
            System.out.println("Stack Overflow");
            return;
        }
        this.data[++top] = item;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    protected boolean isfull() {
        return top == this.data.length - 1;
    }

    public Integer peak() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data[top];
    }

}
