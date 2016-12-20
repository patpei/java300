package guide;

class Dog {

	public void bark() {
		System.out.print("woof ");
	}
}

class Hound extends Dog {
	
	public void bark() {
		System.out.print("howl ");
	}

	public void sniff() {
		System.out.print("sniff ");
	}


}

public class DogShow {

	public static void main(String[] args) {
		new DogShow().go();
	}

	void go() {
		new Dog().bark();

		new Hound().bark();

		((Dog) new Hound()).bark();

		Dog d = new Hound();
		d.bark();
		
		// ((Dog) ).sniff();

	}
}
