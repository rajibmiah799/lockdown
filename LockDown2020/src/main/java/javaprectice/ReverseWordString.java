package javaprectice;

public class ReverseWordString {

	public static void main(String[] args) {
		String s = "Bangladesh";
		String re = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			re += s.charAt(i);

		} // end for loop
		System.out.println(re);

	}// end main

}// end class
