package intermeateAlgorothms;

public class FindPrimeNum {

	public static void main(String[] args) {
		int[] num = { 2, 54, 4, 17, 11, 23, 87, 90, 389 };
		boolean isPrime = true;

		for (int i = 0; i < num.length; i++) {
			for (int j = 2; i < num[i] / 2; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				}// end if

			}// end for j
			if (isPrime == false)
				System.out.println(num[i] + " is a not a prime num");
			else
				System.out.println(num[i] + " is a prime num");
			isPrime = true;
		}// end for i

	}// end main

}// end class
