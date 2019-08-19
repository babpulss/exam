import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("첫 번째 숫자 입력 :  ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println(1);
				break;
			} catch(Exception e) {
				System.out.println("입력한 값은 숫자가 아닙니다");
				System.out.println(2);
			}
		}
			System.out.println(3);
	}
}
