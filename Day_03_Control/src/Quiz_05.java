import java.util.Scanner;

public class Quiz_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�޼����� �Է��ϼ��� : ");
		String msg = sc.nextLine();
		System.out.print("�޼����� �� �� �ݺ��ұ��? ");
		int rpt = Integer.parseInt(sc.nextLine());
		int i = 0;
		while(i < rpt) {
			i++;
			System.out.println(i + "��° : " + msg);
		}
	}
}
