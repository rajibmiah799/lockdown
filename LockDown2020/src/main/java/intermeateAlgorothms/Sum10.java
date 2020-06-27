package intermeateAlgorothms;

public class Sum10 {

	public static void main(String[] args) {
		// 2,5,4,7,1,8,3		
		int[] num = { 2, 5, 4, 7, 1, 8, 3 };
		
		for (int i = 0; i < num.length; i++) {
			int v1 = num[i];
			for (int j = i + 1; j < num.length; j++) {
				int v2 = num[j];

				if (v1 + v2 == 10) {
					System.out.println(v1 + "," + v2 + " makes it to 10");
				} // end if
			} // end j
		} // end for

	}// end main

}// end class
