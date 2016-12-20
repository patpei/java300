package sxt;

//测试浮点数
public class TestFloatType {
	
	public static void main(String[] args){
	
		//double d = 3.14;   //浮点数常量默认类型是double。
		//float f = 6.28F;
		double d2 = 314e-2;   //采用科学计数法的写法
		System.out.println(d2);
		
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);   //false
	
		
	

	
		System.out.println("http://hovertree.com/h/bjaf/xtui46q9.htm");

        float floValue=51.2F;  //定义Float型数据必须使用F结尾；
        double floval1=5.12E2; //使用科学记数法
        double d1=51.2;  //定义double型不需要使用D结尾；
        System.out.println("float型输出:"+floValue);
        System.out.println("科学记数法输出："+floval1);
        System.out.println("double型输出:"+d1);
        
        //以下程序测试正、负无穷大、非数是否相等
        double c1=Double.POSITIVE_INFINITY;
        float f1=Float.POSITIVE_INFINITY;
        double c2=Double.NEGATIVE_INFINITY;
        float f2=Float.NEGATIVE_INFINITY;
        System.out.println(c1==f1);  //输出正无穷大是否相等，相等为true;否则为false;
        System.out.println(c2==f2);  //输出负穷大是否相等，相等为true;否则为false;
        System.out.println("2.0/0==Float.NaN "+(2.0/0==Float.NaN)); //输出两个0相除之后是否等NaN;
        System.out.println("2.0/0==Double.NaN "+(2.0/0==Double.NaN)); //输出两个0相除之后是否等NaN;
        System.out.println(2.0/0.0==Float.NaN); //输出两个0相除之后是否等NaN;
        System.out.println(0.0/0.0==Float.POSITIVE_INFINITY); 
        System.out.println("2.0/0.0==Float.POSITIVE_INFINITY "+(2.0/0.0==Float.POSITIVE_INFINITY));
        System.out.println(0.0/0.0);        
    }

}
