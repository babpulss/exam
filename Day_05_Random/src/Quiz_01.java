import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = (int)(Math.random()*(2 - 1 + 1) + 1);


		System.out.println("===동전 앞 뒤 맞추기===");
		System.out.println(coin);
		System.out.print("숫자를 입력해주세요 (1. 앞면 / 2. 뒷면) :");

		while(true) {
			int choice = Integer.parseInt(sc.nextLine());
			coin = (int)(Math.random()*(2 - 1 + 1) + 1);
			System.out.println(coin);

			if(coin == choice) {

				System.out.println("맞췄습니다^^");
			} else {
				System.out.println("땡! 틀렸습니다!");
				System.out.println("--------------> restart");

			}
		}
	}
}
