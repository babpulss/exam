package Thread_Test;

public class Test extends Thread{
	int seq;
	
	public Test(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(seq + "..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Test t = new Test(i);
			t.start();
		}
	}
}
