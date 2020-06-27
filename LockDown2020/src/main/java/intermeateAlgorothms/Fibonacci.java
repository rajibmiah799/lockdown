package intermeateAlgorothms;

public class Fibonacci {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21.......
		// fibonacci number is addition of previous number
		// ex- 0+1 =1, 1+1=2, 1+2=3, 2+3=5, 3+5=8

		int range = 15;
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print((n1 + " " + n2));
		for (int i = 0; i < range; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		} // end for

	}// end main

}// end class
