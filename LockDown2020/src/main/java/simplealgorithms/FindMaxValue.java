package simplealgorithms;

public class FindMaxValue {

	public static void main(String[] args) {

		int[] num = { 2, 40, 24, 77, 789, 428, 350 };

		// int max = -1;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num.length ; i++) {
			if (num[i] > max)
				max = num[i];

		} // end for
		System.out.println("The Max Value is: " + max);

	}// end main

}// end class
