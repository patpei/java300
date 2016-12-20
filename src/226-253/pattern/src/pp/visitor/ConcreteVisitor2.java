package pp.visitor;

public class ConcreteVisitor2 extends Visitor {
	
	public ConcreteVisitor2(String name){
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
