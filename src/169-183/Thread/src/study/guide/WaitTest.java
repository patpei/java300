package study.guide;

public class WaitTest {
	public static void test1(String[] args) {
		System.out.print("1 ");
		synchronized (args) {
			System.out.print("2 ");
			try {
				args.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.print("3 ");
	}

	public static synchronized void test2(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		t.wait(10000);
		System.out.print("Y");
	}
	
	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.println("X");
		long t1=System.currentTimeMillis();
		synchronized (t){
			t.wait(10000);
		}
		System.out.println(System.currentTimeMillis()-t1);
		System.out.print("Y");
	}

}
