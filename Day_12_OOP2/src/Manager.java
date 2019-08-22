
public class Manager {

	private Silver[] silverMembers = new Silver[10];
	private Gold[] goldMembers = new Gold[10];
	private int silverIndex = 0;
	private int goldIndex = 0;
	
	// ȸ�� ���� �ű��Է� ���(����)
	public void insertNewMember(Silver s) {
		silverMembers[silverIndex++] = s;
	}

	public void insertNewMember(Gold g) {
		goldMembers[goldIndex++] = g;
	}
	// ȸ�� ���� ��ȸ ���
	public void listMembers() {
		for(int i = 0; i < silverIndex; i++) {
			System.out.println(silverMembers[i].getId() + " : " + 
					silverMembers[i].getName() + " : " + 
					silverMembers[i].getPoint() + " : " +
					silverMembers[i].getBonus());
		}
		for(int i = 0; i < goldIndex; i++) {
			System.out.println(goldMembers[i].getId() + " : " + 
					goldMembers[i].getName() + " : " + 
					goldMembers[i].getPoint() + " : " +
					goldMembers[i].getBonus());
		}
	}

	// ȸ�� ���� ���� ���

	public void deleteInfo(int i) {
		Silver tmp = silverMembers[i];
		silverMembers[i] = null;
		while(true) {
			if (silverMembers[i] == null)
				break;

			silverMembers[i] = silverMembers[i + 1];
		}
	}
}



