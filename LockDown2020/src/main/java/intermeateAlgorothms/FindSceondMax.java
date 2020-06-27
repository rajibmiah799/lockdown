package intermeateAlgorothms;

public class FindSceondMax {

	public static void main(String[] args) {
		int[] num = { 3, 384, 7839, 89, 20, 60 };
		int maxone = 0;
		int maxtwo = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > maxone) {
				maxtwo = maxone;
				maxone = num[i];

			} // end if
			else if (num[i] > maxtwo) {
				maxtwo = num[i];
			} // else if

		} // end for
		System.out.println("the max value: " + maxone);
		System.out.println("the sceond max value: " + maxtwo);

	}// end main

}// end class
