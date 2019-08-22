package Synchronization;
/* ������ ������ ���α׷� */
import java.util.Random;

import Thread_Test.ThreadTest;
public class BasicSynchronization extends Thread {
	private int id = -1;
	public BasicSynchronization(int id){
		this.id = id;
	}
	public void run(){
		System.out.println( id + "�� ������ ���� ��..." );
		Random r = new Random(System.currentTimeMillis());
		try {
			long s = r.nextInt(3000); // 3�ʳ��� ������.
			Thread.sleep(s); // �����带 ��� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println( id + "�� ������ ���� ����..." );
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start main method.");
		
		for(int i = 0 ; i < 10 ; i++ ){
			ThreadTest test = new ThreadTest(i);
			test.start(); // �� �޼ҵ带 �����ϸ� Thread ���� run()�� �����Ѵ�.
		}
		
		System.out.println("End main method.");
	}
}