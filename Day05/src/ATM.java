import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, money = 0, input = 0; // Scope Issue로 while문 안에 선언하면 while이 반복될 때마다 값이 초기화된다
		while(true) {
			System.out.println("***ATM 시뮬레이터");
			while(true) {
				try {
					System.out.println("1. 잔액조회");
					System.out.println("2. 입금하기");
					System.out.println("3. 출금하기");
					System.out.println("4. 종료하기");
					System.out.print(">>");
					input = Integer.parseInt(sc.nextLine());
					if(input < 1 || input > 4) {
						System.out.println("올바른 메뉴를 다시 선택해 주세요");
						continue;
					}
					break;
				}
				catch(Exception e) {
					System.out.println("올바른 값을 입력하세요");
				}
			}

			switch(input) {
			case 1 :
				System.out.println("현재 보유 잔액은 " + total + " 입니다.");
				break;
			case 2 :
				while(true) {
					System.out.print("얼마를 입금하시겠습니까 : ");
					try {
						money = Integer.parseInt(sc.nextLine());
						if(money < 1) {
							System.out.println("제대로 된 돈 단위를 넣어주세요");
							continue;
						}
					}catch(Exception e) {
						System.out.println("올바른 값을 입력하세요");
						continue;
					}

					System.out.println(money + "원이 입금되었습니다");
					total += money;
					System.out.println("현재 잔액은 " + total + "원 입니다");
					break;
				}
				break;
			case 3:
				while(true) {
					System.out.print("얼마를 출금하시겠습니까 : ");
					try {
						money = Integer.parseInt(sc.nextLine());
						if(total < money) {
							System.out.println("잔액이 부족합니다");
							break;
						} else if(total < 0 || money == 0) {
							System.out.println("제대로 된 돈 단위를 넣어주세요");
							continue;
						}
					}catch(Exception e) {
						System.out.println("올바른 값을 입력하세요");
						continue;
					}
					System.out.println(money + "원이 출금되었습니다");
					total -= money;						
					System.out.println("현재 잔액은 " + total + " 입니다");
					break;
				}
				break;
			case 4:
				System.out.println("이용해 주셔서 감사합니다");
				System.exit(0);
			}

		}

	}
}