import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("ù ��° ���� �Է� :  ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println(1);
				break;
			} catch(Exception e) {
				System.out.println("�Է��� ���� ���ڰ� �ƴմϴ�");
				System.out.println(2);
			}
		}
			System.out.println(3);
	}
}
