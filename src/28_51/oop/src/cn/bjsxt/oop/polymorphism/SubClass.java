package cn.bjsxt.oop.polymorphism;

class ParentClass {   
    protected int i = 10; 
    
    public int getI(){
    	return i;
    }
}  

public class SubClass extends ParentClass {   
    protected int i = 30;   
    
    public int getI(){
    	return i;
    }
      public static void main(String[] args) {   
    	ParentClass parentClass = new SubClass();   
    	System.out.println(parentClass instanceof ParentClass);
    	System.out.println(parentClass instanceof SubClass);
    	System.out.println(parentClass.getClass().getName());
        SubClass subClass = new SubClass();   
        System.out.println(parentClass.i + subClass.i);
        System.out.println(parentClass.getI() + subClass.i);
        
          
    }   
}  

 
  

