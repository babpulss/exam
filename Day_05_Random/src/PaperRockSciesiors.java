import java.util.Scanner;

public class PaperRockSciesiors {
	public static void main(String[] args) {
		//		===���� ���� �� ����===
		//		���ڸ� �����ϼ���(1.����/2.����/3.��): 
		//			===�� �� ===
		//			����� ������ �½��ϴ�.
		//		��ǻ�ʹ� ���� �½��ϴ�.
		//		=================
		//		��ǻ�Ͱ� �̰���ϴ�. ��.��

		System.out.println("===���� ���� �� ����===");
		while(true) {
			System.out.print("1. ����/2. ����/ 3. �� : ");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			int com = (int)(Math.random()*3) + 1;
			String com1 = null;
			if(com == 1) {
				com1 = "����";
			}else if(com == 2) {
				com1 = "����";
			}else {
				com1 = "��";
			}

			System.out.println("===�� ��===");
			if(input == 1) {
				System.out.println("����� ������ �½��ϴ�");
				System.out.println("��ǻ�ʹ� " + com1 + "�� �½��ϴ�"); 
			} else if(input == 2) {
				System.out.println("����� ������ �½��ϴ�");
				System.out.println("��ǻ�ʹ� " + com1 + "�� �½��ϴ�"); 
			} else {
				System.out.println("����� ���� �½��ϴ�");
				System.out.println("��ǻ�ʹ� " + com1 + "�� �½��ϴ�"); 
			}
			System.out.println("==============");
			if(input == com) {
				System.out.println("�����ϴ�");
			}
			if(com == 1) {
				if(input == 3) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ٤�.��");
				} else if(input == 2) {
					System.out.println("�̰���ϴ�");
				}
			}
			if(com == 2) {
				if(input == 1) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ٤�.��");
				} else if(input == 3) {
					System.out.println("�̰���ϴ�");
				}
			}
			if(com == 3) {
				if(input == 2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ٤�.��");
				} else if(input == 1) {
					System.out.println("�̰���ϴ�");
				}
			}
		}
	}
} 
