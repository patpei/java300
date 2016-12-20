package sxt;

public class TestOperator {
	
	public static void main(String[] args){
		
		double d = 10.2%3; //小数也可以取余数
		System.out.println(d);
		
		int a = 3;
		int b = a++;   //执行完后,b=3。先给b赋值，再自增。
		int c = ++a;   //执行完后,c=5。先自增,再给b赋值
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//	 	int c1 = 3/0; java.lang.ArithmeticException: / by zero
		double c1 = (double)  10 / 0;
		System.out.println("/zero: "+c1);
		System.out.println("isInfinite: "+Double.isInfinite(c1));
		System.out.println(Double.POSITIVE_INFINITY +" "+Double.NEGATIVE_INFINITY); ;
		
		boolean c2 = 1<2||2>(3/0); 
//		boolean c2 = 1<2&&2>(3/0); java.lang.ArithmeticException: / by zero
		System.out.println(c2);
	
	
		//测试位运算
		int m = 9; //1001 
		int n = 5; //0101
		System.out.println("测试位运算");
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(~m);
		System.out.println(m^n);
		
		
		System.out.println("<< >>");
        int a3 = 3*2*2; //3: 0011
		int b3 = 3<<3;  //0011000 相当于：3*2*2*2;
		int c3 = 12/2/2;// 12: 01100
		int d3 = 12>>2; // 011
		System.out.println(a3);
		System.out.println(b3);
		System.out.println(c3);
		System.out.println(d3);
		
		boolean b4 = true&false;
		System.out.println(b4);
	
	

		System.out.println("扩展运算符");
		int  a4 = 3;
		a4 +=5;  //a2 = a2+5;
		System.out.println(a4);
		
		int c4=7;
		c4-=3;//c4=c4-3
		System.out.println(c4);
	
	
		//字符串相连：加号两边只要有一个为字符串，则变为字符串连接符，整个结果为字符串。
		System.out.println(4+"5");
	
	
		int a5=3;
		int b5=5;
		String str= "";
		/*
		if(a<b){
			str = "a<b";
		}else{
			str = "a>b";
		}
		*/
		str = (a5<b5)?"a5<b5":"a5>=b5";
		System.out.println(str);

		
	}

}
