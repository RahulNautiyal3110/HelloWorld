package org;

public class IplAuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New File");
		test("Hello","My", "Name", "Good");
	}
	
	public static void test(String... param ) {
		int len = param.length;
		for(String s:param) {
		System.out.println(s);
		}
	}

}
