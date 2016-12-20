package guide;

/**
 * 	Static init blocks are executed at class loading time, instance init blocks run
	right after the call to super() in a constructor. When multiple init blocks of a single type
	occur in a class, they run in order, from the top down
	
	1. static
	2. super()
	3. init
	4. constructor
 * @author pps
 *
 */
class Bird {
	{
		System.out.println("b1 ");
	}

	public Bird() {
		System.out.println("b2 ");
	}
}

class Raptor extends Bird {
	static {
		System.out.println("r1 ");
	}

	public Raptor() {
		System.out.println("r2 ");
	}

	{
		System.out.println("r3 ");
	}

	static {
		System.out.println("r4 ");
	}
}

class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.println("pre ");
		new Hawk();
		System.out.println("hawk ");
	}
}
