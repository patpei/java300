package com.bjsxt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分拣存储: 1:N
 * 统计 单词 出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 
 * 思路
 * 1、分割字符串 
 * 2、分拣存储
 * 3、按要求查看 单词出现的次数
 * 4、加入面向对象
 * @author bj
 *
 */
public class MapDemo02 {

	public static void main(String[] args) {
		// 1、分割字符串 
		String[] arr ="this is a cat and that is a mice and where is the food ?".split(" ");
		// 2、分拣存储
		Map<String,Letter> map =new HashMap<String,Letter>();
		for(String key:arr){
			/*
			//第一次查看是否 存在 袋子
			if(!map.containsKey(key)){ //不存在
				map.put(key, new Letter(key));  //准备好袋子
			}
			//获取袋子
			Letter value =map.get(key);
			value.setCount(value.getCount()+1);//装东西
			*/
			Letter value =map.get(key);
			if(null==value){
				value =new Letter();
				map.put(key, value);
			}
			value.setCount(value.getCount()+1);//装东西
			
			
		}
		//3、查看每个单词出现的次数
		for(String key:map.keySet()){
			Letter value =map.get(key);
			System.out.println(key+"-->"+value.getCount());
		}
		
		
	}

}
