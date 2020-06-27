package simplealgorithms;

public class SearchALetter {

	public static void main(String[] args) {

		String name = "CareerHack";
		char find = 'e';
		//int c = 0;

		for (int i = 0; i < name.length(); i++) {
			if (find == name.charAt(i)) {
				System.out.println();
			}// end if

		}// end for

	}// end main

}// end class
