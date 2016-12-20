package guide;
class Tree {}
public class Redwood extends Tree {

	void go() {
		go2(new Tree(), new Redwood());
		go2(new Redwood(), new Redwood());
		go2((Redwood) new Tree(), new Redwood());
	}

	void go2(Tree t1, Redwood r1) {
		Redwood r2 = (Redwood) t1;
		Tree t2 = (Tree) r1;
	}
	
	public static void main(String[] args) {
		new Redwood().go();
	}
}


