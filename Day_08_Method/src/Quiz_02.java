import java.util.Scanner;

public class Quiz_02 {
	
	public static int bigger(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else if (n1 < n2)
			return n2;
		else if (n1 == n2)
			return 0;
		else 
			return -1;
	}
	
	public static int[] test(int n1, int n2) {
		int[] arr = new int[] { n1, n2 };
		return arr; 
	}
	
	public static int myRandom(int n1, int n2) {
		return (int)(Math.random() * (n2 - n1 +1)) + n1;
	}
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt("1");
		
		System.out.println(bigger(20, 30));
		// 인자값 두 정수 중 더 큰 수를 반환하는 메소드 bigger
		// 두 수가 가을 시 0 반환
		
		for (int i =0; i < 5; i++) 
		System.out.println(myRandom(5, 10));
		// 5 ~ 10 사이의 난수를 반환하는 메소드 myRandom
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine(); 
		
		public static String nextLine() {
			return 
		}
	}
}
