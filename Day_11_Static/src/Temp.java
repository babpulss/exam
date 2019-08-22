
public class Temp {
	public int a; // instance member field
	public static int b; // class member field main과 동시에 실행되는 코드라고 생각?
	
	public void func1() {
		//a = 10;
		b = 10;
	}
	
	public static int func2() {
		int a = 20;
		b = 20;
		return a;
	}
}
