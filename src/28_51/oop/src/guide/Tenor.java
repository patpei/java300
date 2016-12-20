package guide;
/**
 * one static, one not static, Compilation fails
 * @author pps
 *
 */

class Singer {
	public static String sing() {
		return "la";
	}
}

public class Tenor extends Singer {

	public static String sing() {
		return "fa";
	}

	public static void main(String[] args) {

		Tenor t = new Tenor();

		Singer s = new Tenor();

		/**
		 * polymorphism doesn’t apply to static methods
		 * fa la
		 */
		
		System.out.println(t.sing() + " " + s.sing()); 

	}
}
