package org.cbutler;

public class BadTesty {

	private static String lcStatic = "";

	public static void main(String args[]) {
		lcStatic = "boo";

		try {
		int x = 100 / 0;
		} catch (Throwable t) {
			throw new RuntimeException();
		}
		System.out.println("logging to stdout");
	}
	
	private void unused() {
		for (int x = 0; x> -1; x++) {
			x = x++ + ++x;
		}
	}

}
