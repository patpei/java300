package guide;

class Alpha {
	static String s = " ";

	protected Alpha() {
		s += "alpha ";
	}
}

class SubAlpha extends Alpha {
	/**
	 * with private, can't have a sub class construtor no arguments 
	 */
	private SubAlpha() {
		s += "sub ";
	}
}

public class SubSubAlpha extends Alpha {
	private SubSubAlpha() {
		s += "subsub ";
	}

	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
