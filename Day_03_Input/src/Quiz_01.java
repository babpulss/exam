import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============");
		System.out.print("�� �� : ");
		sc.nextLine();
		System.out.println("=============");
		System.out.print("�� �� : ");
		int korean = Integer.parseInt(sc.nextLine());		
		System.out.print("�� �� : ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.print("�� �� : ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.println("=============");
		System.out.println("�� �� : " + (korean + english + math));
		System.out.println("�� �� : " + (korean + english + math)/3.0);
	}
}
