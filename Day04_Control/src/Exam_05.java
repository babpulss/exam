import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		int a = 65;
		int b = 10;
		char c = 'A';
		char d = 'A';
		String e = "Hello";
		String f = "Hello";
		String g = new String("Hello"); //
		
		System.out.println(c == a); //true
		System.out.println(e ==f); // �� �������� String�� heap �޸��� �ּҰ��� ���� ������ ����� true�̴�
		System.out.println(e ==f); 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�޼���");
		String msg = sc.nextLine();
		
		
		if(msg.equals("Hello")) { // msg.equals�� ������ ���� ��
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(msg == "Hello") { // �ּҰ��� ��
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}
}
