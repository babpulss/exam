import java.util.Scanner;

public class Exam03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		while(true) {
			System.out.println("�� �Է�(0 : ����) : ");
			num = Integer.parseInt(sc.nextLine());	
			if(num == 0) { break; }
			sum += num;
		}
		System.out.println("�Է� ������ ���� : " + sum);
	}
}
