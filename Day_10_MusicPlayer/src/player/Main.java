package player;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PlayM player = new PlayM();
		
		System.out.println("1. sample 2. sample2 3. sample3");
		System.out.print("트랙을 선택하세요 > ");
		int input = Integer.parseInt(sc.nextLine());
		
		if (input == 1) {
		player.jukeBox("Sample.mp3");
		} else if (input == 2) {
			player.jukeBox("Sample2.mp3");
		} else if (input == 3) {
			player.jukeBox("Sample3.mp3");
		}
	}
}
