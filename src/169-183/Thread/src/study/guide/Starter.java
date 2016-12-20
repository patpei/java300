package study.guide;

public class Starter implements Runnable {

	void go(long id) {

		System.out.println(id);

	}

	public static void main(String[] args) {

		System.out.print(Thread.currentThread().getId() + " ");


		new Starter().run(); //1 1
		//new Starter().start(); //X
		//new Thread(new Starter()); //1
		//new Thread(new Starter()).run(); //1 1
		//new Thread(new Starter()).start();  //1 8

	}

	public void run() {
		go(Thread.currentThread().getId());
	}
}
