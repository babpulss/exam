
public class Quiz_02_01 {
	public static void main(String[] args) {
		
		String[] str = new String[] {"A", "B", "C", "D", "E"};
		String[] arr = new String[3];
		int tmp1, tmp2;
		String tmp;
		for (int i = 0; i < str.length * 10; i++) {
			tmp1 = (int)(Math.random() * 5);
			tmp2 = (int)(Math.random() * 5);
			
			tmp = str[tmp1];
			str[tmp1] = str[tmp2];
			str[tmp2] = tmp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
