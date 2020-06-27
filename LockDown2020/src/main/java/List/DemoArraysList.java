package List;

import java.util.ArrayList;

public class DemoArraysList {

	public static void main(String[] args) {

		// Array List - is a dynamic length data structure

		ArrayList<Integer> age = new ArrayList<Integer>();

		age.add(7);
		age.add(12);
		age.add(25);
		age.add(9);

		System.out.println(age.get(1));

		System.out.println("Length of the ArrayList is: " + age.size());
		System.out.println(age.get(2));

	}

}
