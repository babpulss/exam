import java.util.Scanner;

public class Calculator {

	public static int inputValidInt(String err) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				int n = Integer.parseInt(sc.nextLine());
				return n;
			} catch(Exception e) {
				System.out.println(err + "�� �Է��ϼ���");
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		while(true) {
			System.out.println("===���� ���α׷�===");
			System.out.println();
			System.out.print("������ �Է�(+, -, *, /) : ");
			String input = sc.nextLine();

			if(input.equalsIgnoreCase("q")) { //��ҹ��ڸ� ������ ����
				System.out.println("���⸦ �����մϴ�");
				System.exit(0);
			} else if(!input.equals("+") && !input.equals("-") && !input.equals("*") && !input.equals("/")) {				
				System.out.println("�߸��� ������");
			} else {
				System.out.print("ù ��° ���� �Է� :  ");
				num1 = inputValidInt("���");
				System.out.print("�� ��° ���� �Է� : ");
				num2 = inputValidInt("�ް�"); 
			}
			System.out.println("=====�� ��=====");

			switch(input) {
			case "+" :
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case "-" :
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case "*" :
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/" :
				System.out.println(num1 + " / " + num2 + " = " + (num1/(double)num2));
				break;
			}
		}
	}
}
