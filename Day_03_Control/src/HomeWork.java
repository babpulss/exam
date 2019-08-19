import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("심리 테스트를 시작하지");
		System.out.println("당신은 숲을 걷다가 길을 잃고 말았습니다\n 그런데 앞에 허름한 오두막이 나타났습니다");
		System.out.println("오두막에서 가장 먼저 눈의 띄이는 것은 무엇입니까?");
		System.out.println("1. 파란색 벽지 \n2. 빨간색 액자 \n3. 일반적인 탁자");
		System.out.println();
		System.out.print("당신의 선택은? > ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			System.out.println("당신은 이성을 볼 때 얼굴을 가장 먼저 보는 스타일");
		} else if(choice == 2) {
			System.out.println("당신은 이성을 볼 때 얼굴을 가장 먼저 보는 스타일");
		} else if(choice == 3) {
			System.out.println("당신은 이성을 볼 때 성격을 가장 먼저 보는 스타일");
		} else {
			System.out.println("잘못된 선택입니다.");
		}
			
		System.out.println("숲에서 나온 당신은 야생동물이 되기로 결심했다.");
		System.out.println("어떤 동물이 되고 싶습니까?");
		System.out.println("1. 사자 \n2. 기린 \n3. 코끼리\n4. 얼룩말");
		System.out.print("당신의 선택은? > ");
		choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			System.out.println("강하지만 여린  경쟁심이 낮고 누군가의것을빼앗고는 못사는 독기를 품기엔 너무나도 착한사람");
		} else if(choice == 2) {
			System.out.println("분석력과 쟁취심이 강한 사람\n 충동적인 단점이 있긴하지만 그래도 남을 딛고 일어서는 데에 가책을 느끼지 않고 경쟁이라고 생각하는 사람");
		} else if(choice == 3) {
			System.out.println("자아가 엄청 단단한 사람\n무던한 사람이고 생각하지만 나만을 생각하는 사람\n내 것을 주지도 빼앗지도 않는 그런 사람");
		} else {
			System.out.println("추진력이 있고 저돌적인 스타일\n이지만 너무 앞만 보고 달려나가 주변을 신경쓰지 못하는 사람\n 그래서 이기적으로도 보이는 사람");
		}
	}
}
