import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("==== �� �� ====");
		if(num1 > num2) {
			System.out.println("ù ��° �Է��� ���� �� ũ��");
		} else if(num1 < num2){
			System.out.println("�� ��° �Է��� ���� �� ũ��");
		} else {
			System.out.println("�� ���� ����");
		}
	}
}
