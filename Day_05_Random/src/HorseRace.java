import java.util.Scanner;

public class HorseRace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int money = 0;
		System.out.println("경마게임에 오신 것을 환영합니다");
		while(true) {
			System.out.println("1. 게임시작");
			System.out.println("2. 잔액 충전");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.print("> ");
			String choice = sc.nextLine();

			if(choice.equals("1")) {
				while(true) {
					if(money < 1) {
						System.out.println("잔액이 없습니다");
						break;
					}
					System.out.println("말들이 준비되어 있습니다. 배팅하고 싶은 말을 선택하세요");
					System.out.println("1. 야생마");
					System.out.println("2. 적토마");
					System.out.println("3. 조랑말");

					int horseChoice = Integer.parseInt(sc.nextLine());
					System.out.print("얼마를 배팅하시겠습니까? ");
					int battingMoney = Integer.parseInt(sc1.nextLine());
					if(battingMoney > money) {
						System.out.println("잔액이 부족합니다");
						continue;
					}
					System.out.println(battingMoney + "원을 배팅했습니다");
					money -= battingMoney;

					int rand = (int)(Math.random() * 3 + 1);
					System.out.println(rand);
					if(rand == 1) {
						System.out.println("야생마가 이김");
					}
					if(rand == 2) {
						System.out.println("적토마가 이김");
					}
					if(rand == 3) {
						System.out.println("조랑말이 이김");
					}

					if(rand == horseChoice) {
						System.out.println("배팅을 건 말이 승리했습니다");
						System.out.println((battingMoney * 2) + "원을 획득했습니다");
						money += battingMoney * 2;
						break;
					} else {
						System.out.println("경기에서 졌습니다");
						System.out.println(battingMoney + "원을 잃으셨습니다");
						break;
					}
				}
			} else if(choice.equals("2")){
				System.out.print("얼마를 충전하시겠습니까?");
				money += Integer.parseInt(sc.nextLine());
				System.out.println(money + "원이 충전되었습니다");
			} else if(choice.equals("3")) {
				System.out.println("현재 잔액은 " + money + "원 입니다");
			} else if(choice.equals("4")) {
				System.out.println("경마장을 떠났습니다");
				return;
			} else {
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
	}
}
