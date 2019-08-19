import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, money = 0, input = 0; // Scope Issue�� while�� �ȿ� �����ϸ� while�� �ݺ��� ������ ���� �ʱ�ȭ�ȴ�
		while(true) {
			System.out.println("***ATM �ùķ�����");
			while(true) {
				try {
					System.out.println("1. �ܾ���ȸ");
					System.out.println("2. �Ա��ϱ�");
					System.out.println("3. ����ϱ�");
					System.out.println("4. �����ϱ�");
					System.out.print(">>");
					input = Integer.parseInt(sc.nextLine());
					if(input < 1 || input > 4) {
						System.out.println("�ùٸ� �޴��� �ٽ� ������ �ּ���");
						continue;
					}
					break;
				}
				catch(Exception e) {
					System.out.println("�ùٸ� ���� �Է��ϼ���");
				}
			}

			switch(input) {
			case 1 :
				System.out.println("���� ���� �ܾ��� " + total + " �Դϴ�.");
				break;
			case 2 :
				while(true) {
					System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ� : ");
					try {
						money = Integer.parseInt(sc.nextLine());
						if(money < 1) {
							System.out.println("����� �� �� ������ �־��ּ���");
							continue;
						}
					}catch(Exception e) {
						System.out.println("�ùٸ� ���� �Է��ϼ���");
						continue;
					}

					System.out.println(money + "���� �ԱݵǾ����ϴ�");
					total += money;
					System.out.println("���� �ܾ��� " + total + "�� �Դϴ�");
					break;
				}
				break;
			case 3:
				while(true) {
					System.out.print("�󸶸� ����Ͻðڽ��ϱ� : ");
					try {
						money = Integer.parseInt(sc.nextLine());
						if(total < money) {
							System.out.println("�ܾ��� �����մϴ�");
							break;
						} else if(total < 0 || money == 0) {
							System.out.println("����� �� �� ������ �־��ּ���");
							continue;
						}
					}catch(Exception e) {
						System.out.println("�ùٸ� ���� �Է��ϼ���");
						continue;
					}
					System.out.println(money + "���� ��ݵǾ����ϴ�");
					total -= money;						
					System.out.println("���� �ܾ��� " + total + " �Դϴ�");
					break;
				}
				break;
			case 4:
				System.out.println("�̿��� �ּż� �����մϴ�");
				System.exit(0);
			}

		}

	}
}