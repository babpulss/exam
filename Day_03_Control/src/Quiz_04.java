import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("�� �� : ");
		int last = Integer.parseInt(sc.nextLine());
		
		if (start > last) {
		while(start <= last) {
			System.out.print(start + " ");
			start++;
			}
		} else {
			System.out.println("start ���� end �� ���� ���� �� �����ϴ�.");
		}
	}
	
}
