package com.guowei.niuke;

import java.util.Stack;

public class NC76 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if (stack2.isEmpty()) {
    		while (!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
    public static void main(String[] args) {
    	NC76 f = new NC76();
    	f.push(1);
    	f.push(2);
    	f.push(3);
    	System.out.println(f.pop());
    	System.out.println(f.pop());
    	f.push(4);
    	System.out.println(f.pop());
    	f.push(5);
    	System.out.println(f.pop());
    	System.out.println(f.pop());

	}
}
