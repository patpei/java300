package com.bjsxt.others.ref;

import java.lang.ref.WeakReference;

public class TestChair {
    public static void main(String[] args) {
    	test3();
    	System.out.println("end ");
	}
    
    public static void  test1(){
    	for (int i = 0; i < 47; ++i) {
    		for(int j=0; j<3;j++){
    			new Chair();
    		}
            System.out.println("*** request for gc and runFinalization ");
            System.gc();
            System.runFinalization(); 
            
        }
    }
    
    public static void  test2(){
	    while(Chair.created!=10000) {    
	        new Chair();//创建对象    
	    }    
	    while(true){    
	        if(Chair.created==10000){    
	            break;    
	        }    
	    }    
    }
    
    // 消耗大量内存
    public static void drainMemory() {
        String[] array = new String[1024 * 10];
        for(int i = 0; i < 1024 * 10; i++) {
            for(int j = 'a'; j <= 'z'; j++) {
                array[i] += (char)j;
            }           
        }
    }
    
    public static void  test3(){
    	Chair ch=new Chair();
	   WeakReference<Chair> sr=new WeakReference(ch);
	   ch=null;
	   System.gc();
    }

}
