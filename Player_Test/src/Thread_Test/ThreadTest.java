package Thread_Test;

public class ThreadTest extends Thread implements Runnable{

	private int id = 1;

	public ThreadTest(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println(id + "..");
		try {
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(id + "end...");
	}

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest(20);
		ThreadTest t1 = new ThreadTest(2);

		Runnable r = new ThreadTest(1);
		Runnable r2 = new ThreadTest(2);
		Runnable r3 = new ThreadTest(3);
		for (int i = 0; i < 10; i++) {
			r.run();
			r2.run();
			r3.run();
			//t.start();
		}

		System.out.println("main close");


	}
}