package List;

import java.util.LinkedList;
import java.util.List;

public class DmoLinkedlist {

	public static void main(String[] args) {
		// is part of link interface

		LinkedList<String> names = new LinkedList<String>();
		names.add("biplop");
		names.add("jessifer");
		names.add("asif");
		names.add("jessifer");
		System.out.println(names.get(1));

		List<Integer> score = new LinkedList<Integer>();

		score.add(100);
		score.add(98);
		score.add(99);

		System.out.println(score);

	}

}
