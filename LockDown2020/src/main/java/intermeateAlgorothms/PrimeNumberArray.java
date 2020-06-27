package intermeateAlgorothms;

public class PrimeNumberArray {

	public static void main(String[] args) {

		int[] num = { 34, 3, 5, 11, 57, 16, 25, 17, 101, 201 };
		boolean isPrime = true;
		for (int i = 0; i < num.length; i++) {
			for (int j = 2; j < num[i] / 2; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				} // end if
			} // end for j

			if (isPrime == false)
				System.out.println(num[i] + " is not a Prime Number");
			else
				System.out.println(num[i] + " is a Prime Number");
			isPrime = true;
		} // end for i

	}// end main

}// end class
