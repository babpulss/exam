
public class Exam_01 {
	
	public static int plus(int num1, int num2){
		return num1 + num2;
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	

	public static double divide(double arg1, double arg2) {
		return arg1 / arg2;
	}
	
	public static int getTwo() {
		return 2;
	}
	
	public static void greeting() {
		System.out.println("반가워요");
		return;
	}
	public static void main(String[] args) {
		int result1 = plus(10, 5);
		System.out.println(result1);

		int result2 = minus(10, 5);
		System.out.println(result2);

		System.out.println(divide(3, 2));
		System.out.println(getTwo());
	}
}
