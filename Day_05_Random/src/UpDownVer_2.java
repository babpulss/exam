import java.util.Scanner;

public class UpDownVer_2 {
	public static void main(String[] args) {
		//��ǻ�Ͱ� �������ڸ� ������ �� �ֵ��� �ۼ�
		Scanner sc = new Scanner(System.in);
		int input = 0, com = 0;
		
		int cnt = 100;
		while(true) {
			try {
				while(true) {
					int rand = (int)(Math.random() * 99) + 1;
					System.out.println(rand);
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
							} else if(input > rand) {
								System.out.println("<< D O W N >>");
							}
							com = (int)(Math.random() * 99 + 1);
							System.out.println("���İ� : " + com);
							if(com == rand) {
								System.out.println("��ǻ�Ͱ� �­����ϴ�");
								break;
							}
							if(com < rand) {
								System.out.println("<<  U   P  >>");
							} else if(com > rand) {
								System.out.println("<< D O W N >>");
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

