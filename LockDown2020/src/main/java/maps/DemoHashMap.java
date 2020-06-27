package maps;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<String, Integer> score = new HashMap<>();

		// put = add ( in HashMap)

		// accept duplicate values

		score.put("nazrul", 100);
		score.put("bristy", 100);
		score.put("nazrul", 98);

		System.out.println(score.get("bristy"));

		score.remove("nazrul");
		System.out.println(score);

		HashMap<String, Integer> grades = new HashMap<>();
		grades.put("mahbub", 12);

		System.out.println(grades);

	}

}
