import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============");
		System.out.print("이 름 : ");
		sc.nextLine();
		System.out.println("=============");
		System.out.print("국 어 : ");
		int korean = Integer.parseInt(sc.nextLine());		
		System.out.print("영 어 : ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.print("수 학 : ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.println("=============");
		System.out.println("합 계 : " + (korean + english + math));
		System.out.println("평 균 : " + (korean + english + math)/3.0);
	}
}
