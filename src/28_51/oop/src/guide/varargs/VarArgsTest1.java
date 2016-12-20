package guide.varargs;

 import static java.lang.System.out;
 
 /**
  * http://www.cnblogs.com/lanxuezaipiao/p/3190673.html
  * 3. 可变长参数的使用规则
	3.1 在调用方法的时候，如果能够和固定参数的方法匹配，也能够与可变长参数的方法匹配，则选择固定参数的方法。
	3.2 如果要调用的方法可以和两个可变参数匹配，则出现错误
	3.3 一个方法只能有一个可变长参数，并且这个可变长参数必须是该方法的最后一个参数
  * @author pps
  *
  */

public class VarArgsTest1 {
	
    public void print(Object args) {
    	out.println("****Object");
        out.println(args);
    }

    public void print(String... args) {
    	out.println("****String...");
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }
    
    public void print(Object[] args) {
    	out.println("****Object[] ");
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }
    


//    public void print(String test,String...args ){
//          out.println("----------");
//    }

    public static void main(String[] args) {
        VarArgsTest1 test = new VarArgsTest1();
        test.print("hello");
        test.print("hello", "alexia");
    }
}
