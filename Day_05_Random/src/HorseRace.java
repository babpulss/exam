import java.util.Scanner;

public class HorseRace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int money = 0;
		System.out.println("�渶���ӿ� ���� ���� ȯ���մϴ�");
		while(true) {
			System.out.println("1. ���ӽ���");
			System.out.println("2. �ܾ� ����");
			System.out.println("3. �ܾ� ��ȸ");
			System.out.println("4. ����");
			System.out.print("> ");
			String choice = sc.nextLine();

			if(choice.equals("1")) {
				while(true) {
					if(money < 1) {
						System.out.println("�ܾ��� �����ϴ�");
						break;
					}
					System.out.println("������ �غ�Ǿ� �ֽ��ϴ�. �����ϰ� ���� ���� �����ϼ���");
					System.out.println("1. �߻���");
					System.out.println("2. ���丶");
					System.out.println("3. ������");

					int horseChoice = Integer.parseInt(sc.nextLine());
					System.out.print("�󸶸� �����Ͻðڽ��ϱ�? ");
					int battingMoney = Integer.parseInt(sc1.nextLine());
					if(battingMoney > money) {
						System.out.println("�ܾ��� �����մϴ�");
						continue;
					}
					System.out.println(battingMoney + "���� �����߽��ϴ�");
					money -= battingMoney;

					int rand = (int)(Math.random() * 3 + 1);
					System.out.println(rand);
					if(rand == 1) {
						System.out.println("�߻����� �̱�");
					}
					if(rand == 2) {
						System.out.println("���丶�� �̱�");
					}
					if(rand == 3) {
						System.out.println("�������� �̱�");
					}

					if(rand == horseChoice) {
						System.out.println("������ �� ���� �¸��߽��ϴ�");
						System.out.println((battingMoney * 2) + "���� ȹ���߽��ϴ�");
						money += battingMoney * 2;
						break;
					} else {
						System.out.println("��⿡�� �����ϴ�");
						System.out.println(battingMoney + "���� �����̽��ϴ�");
						break;
					}
				}
			} else if(choice.equals("2")){
				System.out.print("�󸶸� �����Ͻðڽ��ϱ�?");
				money += Integer.parseInt(sc.nextLine());
				System.out.println(money + "���� �����Ǿ����ϴ�");
			} else if(choice.equals("3")) {
				System.out.println("���� �ܾ��� " + money + "�� �Դϴ�");
			} else if(choice.equals("4")) {
				System.out.println("�渶���� �������ϴ�");
				return;
			} else {
				System.out.println("�޴��� �ٽ� �����ϼ���");
			}
		}
	}
}
