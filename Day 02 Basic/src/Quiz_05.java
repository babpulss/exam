
public class Quiz_05 {
	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("��� : " + i1 + i2);
		System.out.println("��� : " + (i1 + i2));
		System.out.println("��� : " + i1 + f1);
		System.out.println("��� : " + (i1 + f1));
		System.out.println("��� : " + f1 + c1);
		System.out.println("��� : " + (f1 + c1));
		System.out.println("��� : " + c1 + c2);
		System.out.println("��� : " + (c1 + c2));
		/*
		 * 1020
		 * 30
		 * 103.14
		 * 13.14f
		 * 3.14A
		 * 68.14
		 * AB
		 * 131
		 */
	}
}
