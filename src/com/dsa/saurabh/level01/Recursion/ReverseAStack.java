package com.dsa.saurabh.level01.Recursion;

import java.util.Stack;

public class ReverseAStack {

	private Stack<Integer> reverseAStack(Stack<Integer> stack, int index) {

		if (index == stack.size() - 1)
			return stack;
		Integer pop = stack.pop();
		stack.add(index, pop);
		index++;
		return reverseAStack(stack, index);

	}

	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		intStack.add(1);
		intStack.add(2);
		intStack.add(3);
		intStack.add(4);
		intStack.add(5);
		System.out.println("Original stack " + intStack);
		System.out.println("Value at top " + intStack.peek());
		ReverseAStack reverseAStack = new ReverseAStack();
		Stack<Integer> reversedStack = reverseAStack.reverseAStack(intStack, 0);
		System.out.println("Reversed stack is " + reversedStack);
		System.out.println("Value at top " + intStack.peek());
	}
}
