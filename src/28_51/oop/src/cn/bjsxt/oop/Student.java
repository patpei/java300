package cn.bjsxt.oop;

public class Student {
	//静态的数据
	 String name;
	 int id;    //学号
	 int age;
	 String gender;
	 int weight;
	 
	 Computer computer;

	//动态的行为
	 public void study(){
		 System.out.println(name+"在�W�");
	 }
	 
	 public void sayHello(String sname){
		 System.out.println(name+"向"+sname+"�f：你好！");
	 }
	
}



