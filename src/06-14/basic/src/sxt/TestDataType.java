package sxt;

//测试整数类型：byte,short,int,long。以及进制之间的转换问题
public class TestDataType {
	
//	byte:	1 byte 256, from -128 to 127
//	short: 	2bytes 65536, 正负3万左右, from -32768 to 32767
//	int:	4bytes, 21 亿 2E9
//	long:	8bytes, -2^63~2^63-1
	
	
	public static void main(String[] args){
		int a = 10;
		int a2 = 010; // 0开头8进制
		int a3 = 0xf; // 0x开头16进制
//		byte b = 200;
//		System.out.println(b);
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("Integ+r.toBinaryStringInteger "+a+" : "+Integer.toBinaryString(a));
		System.out.println("Integ+r.toOctalString "+a+" : "+Integer.toOctalString(a));
		System.out.println("Integ+r.toHexString "+a+" : "+Integer.toHexString(a));
		
		int a5 = 10;
		long a6 = 200;
		byte b2 = 100;   //如果数据的大小没有超过byte/short/char的表述范围，则可以自动转型。
		
//		long  a7 = 11123213232; error out of range
		long  a7 = 11123213232L; //23 minutes in the video
		long l = 3; //not to name L to a variable 
		long l2 = l+3;    //L问题
		
	}

}
