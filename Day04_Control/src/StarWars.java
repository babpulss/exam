import java.util.Scanner;

public class StarWars {
	public static void main(String[] args) {
		// Ctrl + i == indent

		Scanner sc = new Scanner(System.in);

		for(int j = 5; j > 0; j--) {
			for (int i = 0; i < j; i++) { // 별 출력코드를 다섯번 반복하는 코드
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for(int j = 1; j < 6; j++) {
			for (int i = 0; i < j; i++) { // 별 출력코드를 다섯번 반복하는 코드
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println("Q.7 ");

		for(int i = 5; i > 0; i--) {
			for(int j = 0 ; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}

		System.out.println("Q.8 ");

		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println("Q.9 ");

		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Q.10 ");

		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Q.11 ");
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j < 6; j++) {
				if(j >= i)
					System.out.print("*");
				else if(j < i)
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Q.12 ");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				if(i == 5) {
					
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("Q.13 ");
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i < 6; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Q.14 ");
		
		for(int i = 5; i > 0; i--) {
			for(int j = 5; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				} else if(j <= i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j < 6; j++) {
				if(j < i) {
					System.out.print(" ");
				} else if(j >= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("Q.15 ");
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j < 6; j++) {
				if(i > j)
					System.out.print(" ");
				else if(i <= j)
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 5; i > 0; i--) {
			for(int j = 5; j > 0; j--) {
				if(i <= j)
					System.out.print(" ");
				else if(i > j)
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
