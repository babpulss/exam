import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 1 ~ n 까지의 합 구하기 ===");
		System.out.print("n 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		//int i = 1;
//		while(i <= input) {
//			sum += i;
//			i++;
//		}
		
			sum = input * (input + 1)/2;
		
		System.out.println("1 ~ " + input + " 까지의 합은 " + sum + "입니다.");
	}
}
