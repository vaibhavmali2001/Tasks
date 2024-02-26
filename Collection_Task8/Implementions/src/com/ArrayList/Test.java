package com.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(23);
		list.add(34);
		list.add(55);
		list.add(78);
		list.add(99);
		list.add(76);
		list.add(78);
		list.add(28);
	System.out.println(list);

	System.out.println(list.size());
	list.add(19);
	System.out.println(list.size());
	System.out.println(list.get(1));
	list.remove(4);
	System.out.println(list);
	}

}
