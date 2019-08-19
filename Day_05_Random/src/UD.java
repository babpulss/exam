import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bestScore = 100; // 현재까지의 모든 플레이어 중 가장 점수가 높은 기록을 저장하는 변수

		while(true) {
			System.out.println("=== Up & Down ===");
			System.out.println("1.Game Start");
			System.out.println("2.Game Score");
			System.out.println("3.Game Quit");
			System.out.print("Menu > ");
			String menu = sc.nextLine();

			if(menu.equals("1")) {
				int count = 1; // 플레이어가 맞춘 횟수를 기록하는 변수
				int target = (int)(Math.random() * 100 + 1); // 정답 생성
				System.out.println(target);
				System.out.println("<<< Game Start >>>");
				
				while(true) {
					System.out.print("Input Number : ");
					int input = Integer.parseInt(sc.nextLine()); // 사용자 시도

					if(input > target) { 
						System.out.println("Down!");
					}else if(target > input) {
						System.out.println("Up!");
					}else {
						System.out.println("정답입니다!");
						if(count < bestScore) {
							System.out.println("축하합니다! 최고기록 갱신!!");
							bestScore = count; // 이번 플레이의 기록이 최고기록으로 등록됨
						}
						break;
					}
					count++;
					
				}
			}else if(menu.equals("2")) {
				System.out.println("현재까지의 최고 기록은 " + bestScore + "번 입니다.");
			}else if(menu.equals("3")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인하세요.");
			}
		}
	}
}







