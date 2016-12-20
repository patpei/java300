package cn.bjsxt.oop.polymorphism;

import java.io.IOException;

/**
 * 覆写是多态的一种表现，我们平时所说的覆写一般是针对方式来说，在网上看到过有人讨论试着覆写属性，于是有点兴趣，属性真能覆写吗？回答问题之前，
 * 我们还是回忆一下方法的覆写具备哪些条件，或都说哪些方法能覆写。 先回顾一下方法覆写要注意的地方：
 * 1、重载（也叫过载）时只与方法特征有关，但重写（覆写）是会进一步检查两个方法的返回类型是否相同、访问修饰权限是否缩小（假设public->
 * protected方向是缩小，反之叫扩大）和抛出的异常范围是否扩大。
 * 那么什么是方式特征呢？一个方法的特征（也可叫方法签名）仅包括方法的名字、参数的个数、
 * 类型、顺序（实质上就是参数列表），而不包括方法的返回类型、访问修饰权限与所抛出的异常。
 * 
 * @author pps
 *
 */
public class TestOverride {

	public void overwrite(int i) throws IOException {
	}
}

class B extends TestOverride {
	// !! 编译通不过，不能缩小访问权限
	// void overwrite(int i) throws IOException {}

	// !! 编译通不过，不能扩大异常范围
	// public void overwrite(int i) throws Exception {}

	// 正常，编译没问题，可以不抛出异常
	// public void overwrite(int i) {}

	// 覆写父类方法
	public void overwrite(int i) throws IOException {
	}

	protected void overload(int i) {
	}

	// 重载上面的方法
	int overload(long i) throws IOException {
		return 0;
	}
}
