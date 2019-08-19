import java.util.Scanner;

public class Calculator {

	public static int inputValidInt(String err) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				int n = Integer.parseInt(sc.nextLine());
				return n;
			} catch(Exception e) {
				System.out.println(err + "만 입력하세요");
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		while(true) {
			System.out.println("===계산기 프로그램===");
			System.out.println();
			System.out.print("연산자 입력(+, -, *, /) : ");
			String input = sc.nextLine();

			if(input.equalsIgnoreCase("q")) { //대소문자를 가리지 않음
				System.out.println("계산기를 종료합니다");
				System.exit(0);
			} else if(!input.equals("+") && !input.equals("-") && !input.equals("*") && !input.equals("/")) {				
				System.out.println("잘못된 연산자");
			} else {
				System.out.print("첫 번째 숫자 입력 :  ");
				num1 = inputValidInt("계란");
				System.out.print("두 번째 숫자 입력 : ");
				num2 = inputValidInt("달걀"); 
			}
			System.out.println("=====결 과=====");

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
