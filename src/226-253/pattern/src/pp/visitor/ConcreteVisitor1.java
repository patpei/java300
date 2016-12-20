package pp.visitor;

public class ConcreteVisitor1 extends Visitor {
	
	public ConcreteVisitor1(String name){
		 //super();
		 this.name = name;
	}

	@Override
	public void visitConcreteElementA(Element a) {
		System.out.println(this.getName()+" visit "+ a.getName());

	}

	@Override
	public void visitConcreteElementB(Element a) {
		System.out.println(this.getName()+" visit "+ a.getName());

	}

}
