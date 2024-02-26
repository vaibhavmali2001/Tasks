package com.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<String>vt=new Vector<>();
		vt.add("A");
		vt.add("B");
		vt.add("C");
		vt.add("D");
		vt.add("E");
		vt.add("F");
		vt.add("G");
		vt.add("H");
		vt.add("I");
		vt.add("J");
//		vt.add("K");
//		vt.add("L");
		System.out.println(vt.size());
		System.out.println(vt);
		vt.remove(2);
		System.out.println(vt);
		System.out.println(vt.get(6));
	}

}
