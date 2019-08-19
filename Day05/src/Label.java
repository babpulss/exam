import java.util.Scanner;

public class Label {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; 
		//int a = 10;
		
		
		abc: while(true) {
			//System.out.println("A : ");
			a = Integer.parseInt(sc.nextLine());
			switch(a) {
			case 1:
				break;
			case 2:
				break;
			case 10:
				break abc;
			}
		}
		System.out.println("Escaped");
	}
}
