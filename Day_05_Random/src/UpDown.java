import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		//1~99���� �������ڸ� ���ߴ� ����
		// switch-case������ ���� ��
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		//System.out.println(rand);

		int cnt = 100;
		while(true) {
			try {
				while(true) {
					int rand = (int)(Math.random() * 99) + 1;
					System.out.println("== Up & Down Game ==");
					System.out.println();
					System.out.println("1. Game Start");
					System.out.println("2. Game Score");
					System.out.println("3. End Game");
					System.out.println();
					System.out.print("> ");
					try {
					input = Integer.parseInt(sc.nextLine());
					} catch(Exception e) {
						System.out.println("���ڸ� �Է��ϼ���");
						continue;
					}
					
					switch(input) {
					case 1:
						cnt = 0;
						System.out.println("<<  Game Start >>");
						System.out.print("Input Number : ");
						while(true) {
							try {
							input = Integer.parseInt(sc.nextLine());
							}catch(Exception e) {
								System.out.println("���ڸ� �Է��ϼ���");
								continue;
							}
							cnt++;
							if(input == rand) {
								System.out.println("�����Դϴ�");
								break;
							}
							if(input < rand) {
								System.out.println("<<  U   P  >>");
								continue;
							} else if(input > rand) {
								System.out.println("<< D O W N >>");
								continue;
							}
						}
						break;
					case 2:
						System.out.println("������� �ּ� ���Ƚ���� " + cnt + "�� �Դϴ�");
						break;
					case 3:
						System.out.println("������ �����մϴ�");
						System.exit(0);
					}
				}
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}

	}
}

