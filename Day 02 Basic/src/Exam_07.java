import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		// ���� �ΰ��� �Է¹޾� ������ ����� 
		// ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		String num1 = sc.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		String num2 = sc.nextLine();
		int num01 = Integer.parseInt(num1);
		int num02 = Integer.parseInt(num2);
		
		System.out.println("�� ���� ���� " + (num01 + num02));
	}
}


























