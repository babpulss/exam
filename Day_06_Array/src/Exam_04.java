
public class Exam_04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int tmp = 0;
		
		tmp = a;
		a = b;
		b = tmp;
		
		int[] arr = new int[] { 10, 20 };
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(a + " : " + b);
	}
}
