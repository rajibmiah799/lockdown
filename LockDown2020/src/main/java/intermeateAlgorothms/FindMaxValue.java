package intermeateAlgorothms;

public class FindMaxValue {

	public static void main(String[] args) {
		
		int [] num = { 2, 56, 54, 1, 999, 76, 43, 87, 987,56};
		// for min we have to assome max vlaue
		int max = 0;
		for(int i =0; i<num.length; i++) {
			if (num[i]>max)
				max = num[i];
		}
		System.out.println("max num is "+max);
		
		

	}

}
