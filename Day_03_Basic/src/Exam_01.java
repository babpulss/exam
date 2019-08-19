import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("아무 숫자나 입력하세요 : ");
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		System.out.println(name + " 님이 입력한 숫자는 " + number + " 입니다.");
		
		
	}
}
