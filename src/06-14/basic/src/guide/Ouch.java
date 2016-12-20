package guide;

public class Ouch {
	static int ouch = 7;
	public static void main(String[] args) {
		new Ouch().go(ouch);
		System.out.print(" " + ouch);
	}
	void go(int ouch) {
		ouch++;
		//for(int ouch = 3; ouch < 6; ouch++);
		/**
		 * The parameter declared on line 9 is valid (although ugly), but the variable
		 *  name ouch cannot be declared again on line 11 in the same scope as the declaration on
		line 9.
		 */
		
		

		System.out.print(" " + ouch);

	}
}
