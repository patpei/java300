package com.bjsxt.others.guava;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
import com.google.common.collect.Tables;

/**
 * 双键的Map -->Table -->rowKey+columnKey+value
 * 1、方法
 *  所有的行数据:cellSet()
 *  所有的学生: rowKeySet()
 *  所有的课程:columnKeySet()
 *  所有的成绩: values()
 *  学生对应的课程: rowMap() +get(学生)
 *  				row(学生)
 *  课程对应的学生: columnMap +get(课程)
 *  				column(课程)
 * @author Administrator
 *
 */
public class DemoTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table<String,String,Integer> table=HashBasedTable.create();
		//测试数据
		table.put("a", "javase", 80);
		table.put("b", "javase", 90);
		table.put("a", "oracle", 100);
		table.put("c", "oracle", 95);
		
		//所有的行数据
		Set<Cell<String,String,Integer>> cells =table.cellSet();
		for(Cell<String,String,Integer> cell:cells){
			System.out.println(cell.getRowKey()+"-->"+cell.getColumnKey()+"-->"+cell.getValue());
		}
		
		System.out.println("==========学生查看成绩==============");
		System.out.print("学生\t");
		//所有的课程
		Set<String> columnKeys=table.columnKeySet();
		for(String t:columnKeys){
			System.out.print(t+"\t");
		}
		System.out.println();
		//所有的学生
		Set<String> stus =table.rowKeySet();
		for(String rowKey:stus){
			System.out.print(rowKey+"\t");
			Map<String,Integer> rowMap =table.row(rowKey);
			for(String c:columnKeys){
				System.out.print(rowMap.get(c)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==========课程查看成绩==============");
		System.out.print("课程\t");
		//所有的学生
		Set<String> stuSet =table.rowKeySet();
		for(String t:stuSet){
			System.out.print(t+"\t");
		}
		System.out.println();
		//所有的课程
		Set<String> courSet =table.columnKeySet();
		for(String c:courSet){
			System.out.print(c+"\t");
			Map<String,Integer> scores =table.column(c);
			for(String s:stuSet){
				System.out.print(scores.get(s)+"\t");
			}
			System.out.println();
		}
		System.out.println("===========转换===========");
		Table<String,String,Integer> tables2 =Tables.transpose(table);
		//所有的行数据
		Set<Cell<String,String,Integer>> cells2 =tables2.cellSet();
		for(Cell<String,String,Integer> temp:cells2){
			System.out.println(temp.getRowKey()+"-->"+temp.getColumnKey()+"-->"+temp.getValue());
		}
		
	}

}
