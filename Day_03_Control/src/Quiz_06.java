import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===������ ��� ���α׷�===");
		System.out.println();
		System.out.print("1 ~ 9�� �� ���� : ");
		int i = Integer.parseInt(sc.nextLine());
		System.out.println();
		int j = 1;
		if(i > 10 || i < 1 ) {
			System.out.println("������ �ʰ��߽��ϴ�.");
		} else {
			while(j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
		}
	}
}
