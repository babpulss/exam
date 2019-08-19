import java.util.Scanner;

public class Flag {
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		

		boolean flag = false;

		while(true) {
			a = Integer.parseInt(sc.nextLine());
			System.out.println("A : ");
			switch(a) {
			case 1:
				break;
			case 10:
				flag = true;
				break;
			}

			if(flag) {
				break;
			}
		}
	}
}
