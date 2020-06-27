package intermeateAlgorothms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrecticeMaxLow {

	public static void main(String[] args) {
		//
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2,377,478,84, 998,78,377,3,0,23));
		
		//Collections.min(num);
		Collections.sort(num);
		//Collections.reverse(num);
		
		//System.out.println(num);
		
		//Collections.reverse(num);
		System.out.println(num);
		System.out.println("min num is: "+num.get(0));
		System.out.println("2nd min num is: "+num.get(1));
		System.out.println("Frequency num: "+Collections.frequency(num, 377));

	}

}
