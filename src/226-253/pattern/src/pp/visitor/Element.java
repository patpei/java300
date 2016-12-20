package pp.visitor;

public abstract class Element {
	
	
	public Element(String name) {
		super();
		this.name = name;
	}

	protected String name;

	public abstract void accept(Visitor visitor);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
