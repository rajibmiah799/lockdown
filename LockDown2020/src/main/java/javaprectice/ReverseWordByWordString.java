package javaprectice;

public class ReverseWordByWordString {

	public static void main(String[] args) {
		String s = "I love java coding";
		String[] word = s.split("\\s");
		String re = "";

		for (int i = 0; i < word.length; i++) {
			String words = word[i];
			String reverse = "";
			for (int j = words.length() - 1; j >= 0; j--) {
				reverse += words.charAt(j);
			} // end j
			re += reverse +" ";
		} // end for loop i
		System.out.println(re);

	}// end main

}// end class
