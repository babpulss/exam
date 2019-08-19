import java.util.Scanner;

public class PaperRockSciesiors {
	public static void main(String[] args) {
		//		===가위 바위 보 게임===
		//		숫자를 선택하세요(1.가위/2.바위/3.보): 
		//			===결 과 ===
		//			당신은 가위를 냈습니다.
		//		컴퓨터는 보를 냈습니다.
		//		=================
		//		컴퓨터가 이겼습니다. ㅠ.ㅠ

		System.out.println("===가위 바위 보 게임===");
		while(true) {
			System.out.print("1. 가위/2. 바위/ 3. 보 : ");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			int com = (int)(Math.random()*3) + 1;
			String com1 = null;
			if(com == 1) {
				com1 = "가위";
			}else if(com == 2) {
				com1 = "바위";
			}else {
				com1 = "보";
			}

			System.out.println("===결 과===");
			if(input == 1) {
				System.out.println("당신은 가위를 냈습니다");
				System.out.println("컴퓨터는 " + com1 + "을 냈습니다"); 
			} else if(input == 2) {
				System.out.println("당신은 바위를 냈습니다");
				System.out.println("컴퓨터는 " + com1 + "을 냈습니다"); 
			} else {
				System.out.println("당신은 보를 냈습니다");
				System.out.println("컴퓨터는 " + com1 + "을 냈습니다"); 
			}
			System.out.println("==============");
			if(input == com) {
				System.out.println("비겼습니다");
			}
			if(com == 1) {
				if(input == 3) {
					System.out.println("컴퓨터가 이겼습니다ㅠ.ㅠ");
				} else if(input == 2) {
					System.out.println("이겼습니다");
				}
			}
			if(com == 2) {
				if(input == 1) {
					System.out.println("컴퓨터가 이겼습니다ㅠ.ㅠ");
				} else if(input == 3) {
					System.out.println("이겼습니다");
				}
			}
			if(com == 3) {
				if(input == 2) {
					System.out.println("컴퓨터가 이겼습니다ㅠ.ㅠ");
				} else if(input == 1) {
					System.out.println("이겼습니다");
				}
			}
		}
	}
} 
