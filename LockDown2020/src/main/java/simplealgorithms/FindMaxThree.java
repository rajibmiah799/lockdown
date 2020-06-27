package simplealgorithms;

public class FindMaxThree {

	public static void main(String[] args) {
		int [] num = {2, 5, 433, 6, 765, 45, 34, 97,123, 4001};
		
		int max1 =0;
		int max2 =0;
		int max3 =0;
		
		for(int i =0; i<num.length; i++) {
			if(num[i]>max1) {
				max3 = max2;
				max2 = max1;
				max1 = num[i];
			}
			else if
			(num[i]>max2) {
				max3 = max2;
				max2 = num[i];
			}
			else if(num[i]>max3) {
				max3=num[i];
				
			}// end if
		}// end for
		System.out.println("max1 is a "+max1);
		System.out.println("max2 is a "+max2);
		System.out.println("max3 is a "+max3);
		
		

	}

}
