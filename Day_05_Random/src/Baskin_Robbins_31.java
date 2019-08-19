import java.util.Scanner;

public class Baskin_Robbins_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int curNum = 0, userWin = 0, userLose = 0;
		System.out.println("Baskin Robbins31 Game");
		while(true) {
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("> ");
			int choice = Integer.parseInt(sc.nextLine());

			curNum = 0;
			switch(choice) {
			case 1:
				System.out.println("<< Game Start >>");
				gameOut : while(true) {
					System.out.print("Input Number(1 ~ 3) : ");
					int input = Integer.parseInt(sc.nextLine());
					if (input < 1 || input > 3) {
						System.out.println("�ùٸ� ������ ���ڸ� �Է��ϼ���");
						continue;
					}
					for(int i = 0; i < input; i++) {
						curNum++;
						if(curNum == 31) {
							System.out.println(curNum);
							System.out.println("�����ϴ�");
							userLose++;
							break gameOut;
						}
						System.out.println(curNum);
					}

					//Computer turn
					System.out.println("<Computer turn >>");
					int rand = (int)(Math.random() * 3 + 1);

					if(curNum == 29 || curNum == 23) {
						rand = 1;
					} else if(curNum == 28 || curNum == 24) {
						rand = 2;
					} else if(curNum == 27 || curNum == 25) {
						rand = 3;
					} 

					for(int i = 0; i < rand; i++) {
						curNum++;
						if(curNum == 31) {
							System.out.println(curNum);
							System.out.println("�̰���ϴ�");
							userWin++;
							break gameOut;
						}
						System.out.println(curNum);
					}
				}
				break;
			case 2:
				System.out.println("<< ����� ���� >>");
				System.out.println("W  I  N : " + userWin);
				System.out.println("L O S E : " + userLose);
				break;
			case 3:
				System.out.println("������ �����մϴ�");
				System.exit(0);
				break;
			default :
				System.out.println("�޴��� �ٽ� �����ϼ���");
			}
		}
	}
}
