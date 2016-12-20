package pp.visitor;

public class ConcreteElementA extends Element {

	public ConcreteElementA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);

	}

}
