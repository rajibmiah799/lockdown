package simplealgorithms;

public class SingleOddEven {

	public static void main(String[] args) {

		// odd number- 3,5,7- not divisible by 2
		// even number - 2,4,6- divisible by 2

		int num = 328;
		if (num > 1) {
			if (num % 2 == 0)
				System.out.println("Even Number");

			// % = mud
			// ! = not
			else if (num % 2 != 0)
				System.out.println("Odd Number");
			else
				System.out.println("Unknown");

		} else
			System.out.println("number must be greter than 1");

	}
}