import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		// 숫자 두개를 입력받아 덧셈한 결과를 
		// 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String num1 = sc.nextLine();
		System.out.print("두번째 숫자를 입력하세요 : ");
		String num2 = sc.nextLine();
		int num01 = Integer.parseInt(num1);
		int num02 = Integer.parseInt(num2);
		
		System.out.println("두 수의 합은 " + (num01 + num02));
	}
}


























