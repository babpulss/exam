import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ɸ� �׽�Ʈ�� ��������");
		System.out.println("����� ���� �ȴٰ� ���� �Ұ� ���ҽ��ϴ�\n �׷��� �տ� �㸧�� ���θ��� ��Ÿ�����ϴ�");
		System.out.println("���θ����� ���� ���� ���� ���̴� ���� �����Դϱ�?");
		System.out.println("1. �Ķ��� ���� \n2. ������ ���� \n3. �Ϲ����� Ź��");
		System.out.println();
		System.out.print("����� ������? > ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			System.out.println("����� �̼��� �� �� ���� ���� ���� ���� ��Ÿ��");
		} else if(choice == 2) {
			System.out.println("����� �̼��� �� �� ���� ���� ���� ���� ��Ÿ��");
		} else if(choice == 3) {
			System.out.println("����� �̼��� �� �� ������ ���� ���� ���� ��Ÿ��");
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
			
		System.out.println("������ ���� ����� �߻������� �Ǳ�� ����ߴ�.");
		System.out.println("� ������ �ǰ� �ͽ��ϱ�?");
		System.out.println("1. ���� \n2. �⸰ \n3. �ڳ���\n4. ��踻");
		System.out.print("����� ������? > ");
		choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			System.out.println("�������� ����  ������� ���� �������ǰ������Ѱ�� ����� ���⸦ ǰ�⿣ �ʹ����� ���ѻ��");
		} else if(choice == 2) {
			System.out.println("�м��°� ������� ���� ���\n �浿���� ������ �ֱ������� �׷��� ���� ��� �Ͼ�� ���� ��å�� ������ �ʰ� �����̶�� �����ϴ� ���");
		} else if(choice == 3) {
			System.out.println("�ھư� ��û �ܴ��� ���\n������ ����̰� ���������� ������ �����ϴ� ���\n�� ���� ������ �������� �ʴ� �׷� ���");
		} else {
			System.out.println("�������� �ְ� �������� ��Ÿ��\n������ �ʹ� �ո� ���� �޷����� �ֺ��� �Ű澲�� ���ϴ� ���\n �׷��� �̱������ε� ���̴� ���");
		}
	}
}
