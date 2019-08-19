import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 인원은 몇 명 인가요? ");
		//int num = Integer.parseInt(sc.nextLine());
		String[] name = new String[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 사람의 이름 : " );
			name[i] = sc.nextLine();
		}
		System.out.println("==== 명단 확인 ====");
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번째 사람의 이름 : " + name[i]);
		}
	}
}