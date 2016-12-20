package guide;

public class Dark {

	int x = 3;

	public static void main(String[] args) {

		new Dark().go1();

	}

	void go1() {

		//int x; //the local variable x is not initialized

		go2(++x); // ++ then assign
		//go2(x++); //	assign then ++
	}

	void go2(int y) {

		int x = ++y;

		System.out.println(x);

	}
}
