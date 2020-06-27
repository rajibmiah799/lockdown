package simplealgorithms;

public class OddEvenArrays {

	public static void main(String[] args) {
		// 3, 27, 16, 124, 90, 97, 129

		int[] num = { 3, 27, 16, 124, 90, 97, 128 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				System.out.println(num[i] + " :is an even number");
			else if (num[i] % 2 != 0)
				System.out.println(num[i] + " : is an odd number");
			else
				System.out.println("unknown");

		} // end for

	}// end main

}// end of class
