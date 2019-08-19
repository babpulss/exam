import java.util.Scanner;

public class Quiz_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메세지를 입력하세요 : ");
		String msg = sc.nextLine();
		System.out.print("메세지를 몇 번 반복할까요? ");
		int rpt = Integer.parseInt(sc.nextLine());
		int i = 0;
		while(i < rpt) {
			i++;
			System.out.println(i + "번째 : " + msg);
		}
	}
}
