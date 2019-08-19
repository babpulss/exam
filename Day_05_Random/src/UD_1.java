import java.util.Scanner;

public class UD_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bestScore = 100; // ��������� ��� �÷��̾� �� ���� ������ ���� ����� �����ϴ� ����
		int count = 1; // �÷��̾ ���� Ƚ���� ����ϴ� ����

		while(true) {
			System.out.println("=== Up & Down ===");
			System.out.println("1.Game Start");
			System.out.println("2.Game Score");
			System.out.println("3.Game Quit");
			System.out.print("Menu > ");
			String menu = sc.nextLine();

			if(menu.equals("1")) {
				int target = (int)(Math.random() * 100 + 1); // ���� ����
				System.out.println(target);
				System.out.println("<<< Game Start >>>");
				
				while(true) {
					System.out.print("Input Number : ");
					int input = Integer.parseInt(sc.nextLine()); // ����� �õ�

					if(input > target) { 
						System.out.println("Down!");
					}else if(target > input) {
						System.out.println("Up!");
					}else {
						System.out.println("�����Դϴ�!");
						if(count < bestScore) {
							System.out.println("�����մϴ�! �ְ��� ����!!");
							bestScore = count; // �̹� �÷����� ����� �ְ������� ��ϵ�
						}
						break;
					}
					System.out.println(bestScore);
					System.out.println(count);
					count++;
					
				}
			}else if(menu.equals("2")) {
				System.out.println("��������� �ְ� ����� " + bestScore + "�� �Դϴ�.");
			}else if(menu.equals("3")) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}else {
				System.out.println("�޴��� �ٽ� Ȯ���ϼ���.");
			}
		}
	}
}







