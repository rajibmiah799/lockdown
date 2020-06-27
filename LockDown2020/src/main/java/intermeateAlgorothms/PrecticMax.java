package intermeateAlgorothms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrecticMax {

	public static void main(String[] args) {
		ArrayList<Integer>num = new ArrayList<>(Arrays.asList(2, 46, 847, 848, 874));
		
		//Collections.max(num);
		
		
		Collections.sort(num);// by default result will be ascending order, sort is higher to lower
		
		System.out.println("2nd lowest number is: "+num.get(1));
		
		//Collections.reverse(num);// it will be bigger to smaller . desecnding order
		
		//System.out.println(Collections.max(num));
		//System.out.println(num.get(0));
		
		
		//System.out.println(Collections.reverse(num));
	}

}

// for max and 2nd max we have to use sort method and reverse method
// for smallar and 2nd small we only use sort