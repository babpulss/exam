import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է¹��� �ο��� �� �� �ΰ���? ");
		//int num = Integer.parseInt(sc.nextLine());
		String[] name = new String[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "��° ����� �̸� : " );
			name[i] = sc.nextLine();
		}
		System.out.println("==== ��� Ȯ�� ====");
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "��° ����� �̸� : " + name[i]);
		}
	}
}