import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// ũ��Ƽ�� �̽�
		// �ڵ� �ߺ��� - ����� �̿��ؼ� �ذ�
		// �ڵ� ���յ� - �������� �̿��ؼ� �ذ�
		// ����� ���� - Collection Framework
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		
		manager.insertNewMember(new Silver(1001, "ȫ�浿", 1000));
		manager.insertNewMember(new Silver(1002, "�Ӳ���", 1500));
		
		manager.insertNewMember(new Gold(1003, "����", 2000));
		manager.listMembers();
		
		Member m = new Silver(1, "a", 1); // �� ĳ����
		Silver s = new Silver(1, "b", 1); // ������� ���۸޼ҵ忡 �ڽ� �޼ҵ尡 �������̵��
		System.out.println(s.getBonus());
		System.out.println(m.getPoint());
	}
}
