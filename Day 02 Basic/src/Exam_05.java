import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); // Integer.parseInt로 String의 값을 int로 변환시킴		
		System.out.println(num 	+ 5);
	}
}
