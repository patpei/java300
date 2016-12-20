package com.bjsxt.others.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bjsxt.others.synread.Chair;
import com.google.common.collect.ImmutableList;

/**
 * 只读设置
 * @author Administrator
 *
 */
public class DemoImmutableList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//对原有的list进行包装，相等于原有List的一个视图，快照，不够安全
		List<String> readList =Collections.unmodifiableList(list);
		//java.lang.UnsupportedOperationException
		//readList.add("d");
		list.add("d"); //改变原有List 视图也一起改变
		
		//对比 查看 初始化List guava对只读设置 安全可靠，并且相对简单
		List<String> immutableList =ImmutableList.of("a", "b", "c"); 
		//immutableList.add("d");//java.lang.UnsupportedOperationException
		
		
		List<Chair> list1 =new ArrayList<Chair>();
		list1.add(new Chair("a"));
		list1.add(new Chair("b"));
		//list可以同步
		List<Chair> unmodifiableList1 =ImmutableList.copyOf(list1);
		//ImmutableList 不能增加删除修改元素，
		//但元素本身的属性依然可以通过setter改变
		//而且原来的list里的元素属性也被改变了
		unmodifiableList1.get(0).setName("kk");
		System.out.println(list1);
		System.out.println(unmodifiableList1);
		System.out.println("ImmutableList 不能增加删除修改元素，"
				+ "但元素本身的属性依然可以通过setter改变,"
				+ "而且原来的list里的元素属性也被改变了");	
		list1.add(new Chair("c"));
		System.out.println(list1);
		System.out.println(unmodifiableList1);
		
	}

}
