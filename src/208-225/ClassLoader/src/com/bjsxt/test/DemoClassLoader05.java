package com.bjsxt.test;


/**
 * 线程上下文类加载器的测试
 * @author 尚学堂高淇 www.sxt.cn
 *
 */
public class DemoClassLoader05 {
	public static void main(String[] args) throws Exception {
		ClassLoader loader = DemoClassLoader05.class.getClassLoader();
		System.out.println(loader);
		
		
		ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
		System.out.println(loader2);
		
		Thread.currentThread().setContextClassLoader(new FileSystemClassLoader("d:/myjava/"));
		System.out.println(Thread.currentThread().getContextClassLoader());
		
		Class<DemoSystemJavaCompiler> c = (Class<DemoSystemJavaCompiler>) Thread.currentThread().getContextClassLoader().loadClass("com.bjsxt.test.Demo01");
		System.out.println(c);
		System.out.println(c.getClassLoader());
		
	}
}
