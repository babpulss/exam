import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 100 사이의 수를 입력하세요.");
		System.out.print("입력 > ");
		int result = Integer.parseInt(sc.nextLine());
		System.out.println("==== 결 과 ====");
		
		if(0 < result || result < 100) {			
			if (result % 2 == 1) {
				System.out.println("홀수입니다.");
			} else {
				System.out.println("짝수입니다.");
			}
		} else {
			System.out.println("범위를 벗어났습니다");
		}
	}
}
