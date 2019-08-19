import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===구구단 출력 프로그램===");
		System.out.println();
		System.out.print("1 ~ 9단 중 선택 : ");
		int i = Integer.parseInt(sc.nextLine());
		System.out.println();
		int j = 1;
		if(i > 10 || i < 1 ) {
			System.out.println("법위를 초과했습니다.");
		} else {
			while(j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
		}
	}
}
