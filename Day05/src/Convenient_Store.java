import java.util.Scanner;

public class Convenient_Store {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, current_price = 10000, current_iceCream = 0, current_lunchBox = 0;
		final int ICECREAM_PRICE = 1000, LUNCHBOX_PRICE = 2000;

		System.out.println("=== ������ ===");
		while(true) {
			try {
				while(true) {
					System.out.println("�޴��� �����ϼ���");
					System.out.println("1. ����ǰ Ȯ���ϱ�");
					System.out.println("2. �����ϱ�");
					System.out.println("3. ȯ���ϱ�");
					System.out.println("4. ������");
					System.out.print("���� > ");
					input = Integer.parseInt(sc.nextLine());

					menu : switch(input) {
					case 1: // �����ݾװ� ����ǰ ���
						System.out.println("====================");
						System.out.println("���� ����ǰ");
						System.out.println("������ : " + current_price + "��");
						System.out.println("���̽�ũ�� : " + current_iceCream + "��");
						System.out.println("���ö� : " + current_lunchBox + "��");
						System.out.println("====================");	
						break;
					case 2: // ���� �޴�
						while(input != 3) {
							System.out.println("====================");	
							System.out.println("���� ���� �ݾ� (" + current_price + "��)");
							System.out.println("���� ǰ��");
							System.out.println("1. ���̽�ũ�� == 1000 ��");
							System.out.println("2. ���ö� == 2000 ��");
							System.out.println("3. �������� ������");
							System.out.print("���Ͻô� ��ǰ�� �����ϼ��� > ");
							input = Integer.parseInt(sc.nextLine());
							//���� �޴� 
							switch(input) {
							case 1:
								if(current_price < ICECREAM_PRICE) {
									System.out.println("�ܾ��� �����մϴ�" + "(���� �ܾ� : " + current_price+ ")");
									break;
								}
								current_iceCream += 1;
								current_price -= 1000;
								System.out.println("���̽�ũ���� 1�� ������ (���� �ܾ� : " + current_price + ")");
								break;
							case 2:
								if(current_price < LUNCHBOX_PRICE) {
									System.out.println("�ܾ��� �����մϴ�" + "(���� �ܾ� : " + current_price + ")");
									break;
								}
								current_lunchBox += 1;
								current_price -= 2000;
								System.out.println("���ö��� 1�� ������ (���� �ܾ� : " + current_price + ")");
								break;
							case 3:
								break menu;
							default :
								System.out.println("�޴��� �ùٷ� �������ּ���");
							}
						}
						break;
					case 3: //ȯ�� �޴�
						while(true) {
							System.out.println("ȯ���� �޴��� ������ �ּ���");
							System.out.println("���� ������ ǰ��");
							System.out.println("1. ���̽�ũ�� : " + current_iceCream+ "��");
							System.out.println("2. ���ö� : " + current_lunchBox+ "��");
							System.out.println("3. �������� ������");
							input = Integer.parseInt(sc.nextLine());

							switch(input) {// ȯ�� �ϱ�
							case 1:
								current_price += (current_iceCream * 1000);
								System.out.println("ȯ�ҵ� �ݾ� : " + (current_iceCream * 1000));
								System.out.println("���� �ܾ�: " + current_price);
								current_iceCream = 0;
								break;
							case 2:
								current_price += (current_lunchBox * 2000);
								System.out.println("ȯ�ҵ� �ݾ� : " + (current_lunchBox * 2000));
								System.out.println("���� �ܾ�: " + current_price);
								current_lunchBox = 0;
								break;
							case 3:
								break menu;
							}
						}
					case 4: //���α׷� ����
						System.out.println("�������� �������ϴ�");
						System.exit(0);
					}	
				}
			} catch(Exception e) {
				System.out.println("�ùٸ� �޴��� �����ϼ���");
			}
		}
	}
}
