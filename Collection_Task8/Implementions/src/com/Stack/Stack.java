package com.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack <T> {
	
	private Deque<T> stack;
	
	public Stack() {
		stack=new ArrayDeque<>();
	}
	
	//check isEmpty
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	//size
	public int size() {
		return stack.size();
	}
	
	//push new element
	public void push(T element) {
		stack.push(element);
	}
	
	//remove element
	@SuppressWarnings("unchecked")
	public T pop() {
		if(isEmpty()) {
			return (T) "Stack is Empty!!!";
		}
		return stack.pop();
	}
	//see element
	@SuppressWarnings("unchecked")
	public T peek() {
		if(isEmpty()) {
			return (T) "Stack is Empty!!!";
		}
		return stack.peek();
	}
	
}