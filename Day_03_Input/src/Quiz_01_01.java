
public class Quiz_01_01 {
	public static void main(String[] args) throws Exception{
		System.out.print("���� �Է� : ");
		int input = System.in.read(); //System.in.read()�� int�ڷ������� �Է¹���
		System.out.println();
		System.out.println("�Է��Ͻ� ���� : " + (char)input);
		System.out.println("�ҹ��ڷ� ��ȯ : " + (char)(input + 32));
	}
}
