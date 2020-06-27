package intermeateAlgorothms;

import java.util.ArrayList;

public class PrimeNumberRange {

	public static void main(String[] args) {

		int range = 50;
		boolean isPrime = true;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int c = 0;
		// C =count
		for (int i = 3; i <= range; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				} // end if
			} // end for j
			if (isPrime == true) {
				primes.add(i);
				c = c + 1;

			} // end if
			isPrime = true;

		} // end for i
		System.out.println(primes);
		System.out.println(primes.size());
		System.out.println("Number of Primes: " + c);
	}// end main
}// end class
