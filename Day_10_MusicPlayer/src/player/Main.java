package player;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		PlayM player = new PlayM();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sample 2. sample2 3. sample3");
		System.out.print("Ʈ���� �����ϼ��� > ");
		int input = Integer.parseInt(sc.nextLine());
		player.jukeBox(input);

	}
}
