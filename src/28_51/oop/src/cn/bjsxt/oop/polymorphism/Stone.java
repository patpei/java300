package cn.bjsxt.oop.polymorphism;

public class Stone implements Flyable {
	String name="stone";

	@Override
	public void fly() {
		System.out.println("stone fly");

	}

}
