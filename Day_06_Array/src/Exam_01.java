import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int index = 2;

		System.out.println(arr[index]);
		//System.out.println(arr[arr[1]]);
		System.out.println(arr[(int)Math.random() * 4]);
		System.out.println(arr[Integer.parseInt(sc.nextLine())]);
	}
}
