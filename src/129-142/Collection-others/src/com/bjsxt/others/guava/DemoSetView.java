package com.bjsxt.others.guava;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
 * 集合的操作:交集、差集、并集
 * Sets.intersection()
 * Sets.difference()
 * Sets.union();
 * @author Administrator
 *
 */
public class DemoSetView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> sets =Sets.newHashSet(1,2,3,4,5,6);
		Set<Integer> sets2 =Sets.newHashSet(3,4,5,6,7,8,9);
		
		//交集
		System.out.println("交集为:");
		SetView<Integer> intersection =Sets.intersection(sets, sets2);
		for(Integer temp:intersection){
			System.out.println(temp);
		}
		//差集
		System.out.println("差集为:");
		SetView<Integer> diff =Sets.difference(sets, sets2);
		for(Integer temp:diff){
			System.out.println(temp);
		}
		//并集
		System.out.println("并集为:");
		SetView<Integer> union =Sets.union(sets, sets2);
		for(Integer temp:union){
			System.out.println(temp);
		}
		
	}

}
