import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = (int)(Math.random()*(2 - 1 + 1) + 1);


		System.out.println("===���� �� �� ���߱�===");
		System.out.println(coin);
		System.out.print("���ڸ� �Է����ּ��� (1. �ո� / 2. �޸�) :");

		while(true) {
			int choice = Integer.parseInt(sc.nextLine());
			coin = (int)(Math.random()*(2 - 1 + 1) + 1);
			System.out.println(coin);

			if(coin == choice) {

				System.out.println("������ϴ�^^");
			} else {
				System.out.println("��! Ʋ�Ƚ��ϴ�!");
				System.out.println("--------------> restart");

			}
		}
	}
}
