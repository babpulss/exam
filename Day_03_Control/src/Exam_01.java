import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���� �����ϴ� ������ �����ϼ���.");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.print("����> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("��ħ�� ����� ���ຸ�� ����ϴ�.");
		} else if(menu == 2) {
			System.out.println("����� ��δ�ϴ�.");
		} else if(menu == 3) {
		System.out.println("����� �Ǻο� ����ϴ�.");
		} else {
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
		}
	}
}
