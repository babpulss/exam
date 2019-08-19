
public class Operator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int result2;
		result2 = x + y;
		System.out.println(x + " + " + y + " = " + result2);
		x = y = 2;
		System.out.println("x = " + ++x + " y = " + y++); 
		double d = 10.4;
		d= ~y; //비트 연산자 
		System.out.println(d);
		boolean result = !( ((x>y) || (x==y)) || ((x!=y) && (x<y) )); 
		System.out.println(result);
	}
}
