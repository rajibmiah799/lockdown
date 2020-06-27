package intermeateAlgorothms;

public class PrecticeString {

	public static void main(String[] args) {
		String s = "hello world";
		// \\s = space
		//regex = regular expression
		String[] ss =s.split("\\s");
		for(String a:ss) {
			System.out.println(a.toString());
			//int i = a.length();
			//System.out.println(i);

	}

}
}