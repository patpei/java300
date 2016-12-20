package pp.visitor;

public class ConcreteElementB extends Element {

	public ConcreteElementB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);

	}

}
