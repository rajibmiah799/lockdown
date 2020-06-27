package simplealgorithms;

public class FindMinValue {

	public static void main(String[] args) {

		int[] num = { 2, 4, 87, 97, 3, 7, 34 };

		int min1 = 10000;
		int min2 = 10000;

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min1) {
				min2 = min1;
				min1 = num[i];

			} else if (num[i] < min2) {
				min2 = num[i];
			} // end if
		} // end for
		System.out.println("min1 is " + min1);
		System.out.println("min2 is " + min2);

	}// end main

}// end class
