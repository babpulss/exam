
public class Test2 {
	public static void main(String[] args) {
		
	int[] win = new int[] { 1, 2, 3, 4, 5, 6, 7 };
	int myField = 1, second = 0, third = 0;
	
	
	for(int i = 0; i < win.length;i++) {
	     if(win[6] == myField) { // ���� ��÷��ȣ�� ���� ���� 5�� �̸鼭 ���ʽ���ȣ�� ���� ���� �ִٸ�
	      System.out.print("2�� ��÷!!");
	      System.out.println();
	      second++;
	     } else { // ���� ��÷��ȣ�� ���� ���� 5�� �̸鼭 ���ʽ���ȣ�� ���� ���� ���ٸ�
	      System.out.print("3�� ��÷!!");
	      System.out.println();
	      third++;
	      break;
	     }
	    }
	}
}
