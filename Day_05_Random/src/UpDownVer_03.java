import java.util.Scanner;

public class UpDownVer_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, com = 0;
		int maxSug = 100, minSug =1;

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
						if (input < 1 || input > 3) {
							System.out.println("�޴��� �ٽ� �����ϼ���");
						}
					} catch(Exception e) {
						System.out.println("���ڸ� �Է��ϼ���");
						continue;
					}

					switch(input) {
					case 1:
						maxSug = 100; minSug = 0; 
						cnt = 0;
						System.out.println("<<  Game Start >>");
						while(true) {
							System.out.print("Input Number : ");
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
								if(input > minSug){
									minSug = input + 1;
								}
							} else if(input > rand) {
								System.out.println("<< D O W N >>");
								if(input < maxSug){
									maxSug = input - 1;
								}
							}
							while(true) { 
								com = (int)(Math.random() * (maxSug - minSug + 1) + minSug); 
								if(com < minSug || com > maxSug) {
									continue;
								} else if(input == com) {
									continue;
								} else {
									break;
								}
							}
							System.out.println("���İ� : " + com);
							if(com == rand) {
								System.out.println("���İ� ������ϴ�");
								break;
							}
							if(com < rand) {
								System.out.println("<<  U   P  >>");
								minSug = com + 1; 
							} else if(com > rand) {
								System.out.println("<< D O W N >>");
								maxSug = com - 1; 
							}
						}
						break;
					case 2:
						System.out.println("���� Ƚ����  " + cnt + "�� �Դϴ�");
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
