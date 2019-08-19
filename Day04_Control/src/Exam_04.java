import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("어떤 직업이 매력적인가요?");
		System.out.println("1. 응용 SW 개발자");
		System.out.println("2. Web개발자");
		System.out.println("3. 데이터 과학자");
		System.out.println("입력 : ");
		String input = sc.nextLine();

		switch(input) {
		case "1":
			System.out.println("시장성이 큰 가장 흔한 개발자 직종입니다.");
			break;
		case "2":
			System.out.println("시장성이 점점 커지고 있는 유망한 직종입니다.");
			break;
		case "3":
			System.out.println("4차산업에 발 맞춘 하이테크 기술자입니다.");
			break;
		default:
			System.out.println("메뉴를 다시 확인해주세요.");
		}
	}
}
