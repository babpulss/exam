import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 100 ������ ���� �Է��ϼ���.");
		System.out.print("�Է� > ");
		int result = Integer.parseInt(sc.nextLine());
		System.out.println("==== �� �� ====");
		
		if(0 < result || result < 100) {			
			if (result % 2 == 1) {
				System.out.println("Ȧ���Դϴ�.");
			} else {
				System.out.println("¦���Դϴ�.");
			}
		} else {
			System.out.println("������ ������ϴ�");
		}
	}
}
