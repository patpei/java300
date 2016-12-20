package pp.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> elements = new ArrayList();
	
	public void attach(Element e){
		elements.add(e);
	}
	
	public void accept(Visitor visitor){
		for(Element e: elements){
			e.accept(visitor);
		}
	}
	
}
