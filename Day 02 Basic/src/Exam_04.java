import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요.");
		System.out.print("입력>");
		String input = sc.nextLine();
		
		System.out.println("사용자의 메세지는 : " + input);
	}
}
