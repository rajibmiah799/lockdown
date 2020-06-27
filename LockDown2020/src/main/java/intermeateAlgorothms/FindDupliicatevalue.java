package intermeateAlgorothms;

public class FindDupliicatevalue {

	public static void main(String[] args) {
		
		int[] num = {2, 3,3, 4, 5, 6, 4, 7, 7, 8, 9, 9};
		
		for(int i = 0; i<num.length-1; i++) {
			if (num[i]==num[i+1])
				System.out.println("Found Duplicate "+num[i]);
			
		}//end for

	}//end main

}//end class
