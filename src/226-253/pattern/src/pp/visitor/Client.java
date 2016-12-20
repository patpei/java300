package pp.visitor;

public class Client {

	public static void main(String[] args) {
		ConcreteElementA man = new ConcreteElementA("man");
		ConcreteElementB women = new ConcreteElementB("women");
		
		ObjectStructure o = new ObjectStructure();
		
		o.attach(man);
		o.attach(women);
		
		ConcreteVisitor1 success = new ConcreteVisitor1("success");
		ConcreteVisitor1 failure = new ConcreteVisitor1("failure");
		
		o.accept(success);
		o.accept(failure);


	}

}
