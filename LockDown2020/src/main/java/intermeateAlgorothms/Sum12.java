package intermeateAlgorothms;

public class Sum12 {

	public static void main(String[] args) {

		int[] num = { 4, 8, 6, 5, 6, 10, 3, 2, 9 };

		for (int i = 0; i < num.length; i++) {
			int v1 = num[i];

			for (int j = i + 1; j < num.length; j++) {
				int v2 = num[j];

				if (v1 + v2 == 12) {
					System.out.println(v1 + " , " + v2 + " make it 12");

				}
			}// end for j

	}//end for i
	}// end main
}// end class
