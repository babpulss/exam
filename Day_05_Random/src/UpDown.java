import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		//1~99까지 랜덤숫자를 맞추는 게임
		// switch-case문으로 만들 것
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
						System.out.println("숫자만 입력하세요");
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
								System.out.println("숫자만 입력하세요");
								continue;
							}
							cnt++;
							if(input == rand) {
								System.out.println("정답입니다");
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
						System.out.println("현재까지 최소 기록횟수는 " + cnt + "번 입니다");
						break;
					case 3:
						System.out.println("게임을 종료합니다");
						System.exit(0);
					}
				}
			}catch(Exception e) {
				System.out.println("숫자만 입력하세요");
			}
		}

	}
}

