import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 가장 좋아하는 과일을 선택하세요.");
		System.out.println("1. 사과");
		System.out.println("2. 망고");
		System.out.println("3. 딸기");
		System.out.print("선택> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("아침에 사과가 보약보다 좋답니다.");
		} else if(menu == 2) {
			System.out.println("망고는 비싸답니다.");
		} else if(menu == 3) {
		System.out.println("딸기는 피부에 좋답니다.");
		} else {
			System.out.println("메뉴를 다시 확인해주세요.");
		}
	}
}
