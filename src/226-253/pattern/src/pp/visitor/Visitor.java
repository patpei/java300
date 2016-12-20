package pp.visitor;

public abstract class Visitor {
	
	protected String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void visitConcreteElementA(Element a);
	
	public abstract void visitConcreteElementB(Element a);

}
