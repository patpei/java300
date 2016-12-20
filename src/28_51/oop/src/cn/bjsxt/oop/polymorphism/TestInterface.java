package cn.bjsxt.oop.polymorphism;

public class TestInterface {

	public static void main(String[] args) {
		Stone s= new Stone();
		s.fly();
		System.out.println(s.name);
		Flyable f = new Stone();
		f.fly();
		System.out.println(((Stone)f).name);
		
	}

}
