package com.bjsxt.gen03;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
public static void main(String[] args) {
	Fruit f = new Apple();
	//范型没有多态
	//List<Fruit> list = new ArrayList<Apple>();
	List <? extends Fruit> list=new ArrayList<Apple>();
	//范型没有数组
	//Fruit<String>[] arr = new Fruit<String>[10];
}
}
