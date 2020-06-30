package javaprectice;

public class ReverseBySentenceString {

	public static void main(String[] args) {
		String s = "I love Allah";
		
		String re = " ";

		for (int i = s.length() - 1; i >= 0; i--) {
			re += s.charAt(i);
		}// end for loop
		System.out.println(re);

	}// end main

}// end class
