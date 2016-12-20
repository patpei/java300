package sxt;

//测试自动转型和强制转型 
public class TestCast {
	
	public static void main(String[] args){
		
		byte b = 123;
		//byte b2 = 300; cannot convert
		//char c = -3;	cannot convert
		char c2 = 'a';
		int i = c2;
		long d01 = 123213;
		float f = d01;
		
		//测试强制转型
		int i2 = -100;
		char c3 = (char)i2;   //-100超过char的表数范围，所以转换成完全不同的值，无意义的值！
		System.out.println(c3);
		
	
		//表达式中的类型提升问题
		int a = 3;
		long b1 = 4;
		double d = 5.3;
		int c = (int)(a+b1);   //做所有的二元运算符(+-/*%)，都会有类型提升的问题！
		System.out.println(c);
		float f1 = (float)(a + d);
		System.out.println(f1);
	
		// 马云20年可以挣多少钱
		int money = 1_000_000_000;  //10亿
		int years = 20;
		//long total = money*years;   //返回的是负数
		long total = (long)money*years;
		System.out.println(total);
		
		//一个人70年心跳多少次
		long times = 70L*60*24*365*70;
		System.out.println(times);
		
		
	}

}
