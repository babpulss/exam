import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println("�ƹ� ���ڳ� �Է��ϼ��� : ");
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		System.out.println(name + " ���� �Է��� ���ڴ� " + number + " �Դϴ�.");
		
		
	}
}
