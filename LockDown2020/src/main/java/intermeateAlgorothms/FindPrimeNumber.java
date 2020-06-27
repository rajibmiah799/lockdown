package intermeateAlgorothms;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// prime numbers--2, 3, 5, 7, 11, 13,17
		// divisible by 1 and itself only

		int x = 17;
		boolean isPrime = true;
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				isPrime = false;
				break;
			} // end if
		} // end for
		if (isPrime == true)
			System.out.println(x + " is a Prime Number");
		else
			System.out.println(x + " is not a Prime Number");
	}// end main

}// end class
