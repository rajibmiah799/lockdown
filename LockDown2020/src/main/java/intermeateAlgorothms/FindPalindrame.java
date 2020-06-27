package intermeateAlgorothms;

public class FindPalindrame {

	public static void main(String[] args) {
		// madam -- palindrome (mom, dad)

		String text = "madam";
		String reverse ="";

		for (int i =text.length()-1; i >= 0; i--) {
			reverse += text.charAt(i);

		}// end for
		// == compares memory location
			// .equal() compares by value
		
		if (text.equals(reverse))
			System.out.println(text +" is a palindrome");
		else
			System.out.println(text+ " is not a palindrome");

	}//end main

}// end class
