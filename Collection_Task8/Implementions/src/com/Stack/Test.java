package com.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(11);
		st.push(22);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.size());
		st.pop();
		System.out.println(st.peek());
	}

}
