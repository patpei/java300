package com.bjsxt.others.ref;

import java.util.Calendar;

public class Chair {
	
	static int created = 0; //对象创建计数    
    static int finalized = 0; //对象回收计数    
    //构造器    
    Chair(){    
        created++;    
        System.out.println("created "+created+"【"+Calendar.getInstance().get(Calendar.MINUTE)+"m "+Calendar.getInstance().get(Calendar.SECOND)+"s】");    
    }    
    //垃圾回收析构函数    
    protected void finalize() {    
        finalized++;    
        System.out.println("finalize "+finalized+"【"+Calendar.getInstance().get(Calendar.MINUTE)+"m "+Calendar.getInstance().get(Calendar.SECOND)+"s】");    
    }    
}

