package com.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer>ls=new LinkedList<>();
		ls.addFirst(13);
		ls.addFirst(22);
		ls.addFirst(77);
		ls.addLast(90);
		System.out.println(ls);
		ls.removeLast();
		System.out.println(ls);
		ls.removeFirst();
		System.out.println(ls);
		
	}

}