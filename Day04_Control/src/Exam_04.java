import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("� ������ �ŷ����ΰ���?");
		System.out.println("1. ���� SW ������");
		System.out.println("2. Web������");
		System.out.println("3. ������ ������");
		System.out.println("�Է� : ");
		String input = sc.nextLine();

		switch(input) {
		case "1":
			System.out.println("���强�� ū ���� ���� ������ �����Դϴ�.");
			break;
		case "2":
			System.out.println("���强�� ���� Ŀ���� �ִ� ������ �����Դϴ�.");
			break;
		case "3":
			System.out.println("4������� �� ���� ������ũ ������Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
		}
	}
}
