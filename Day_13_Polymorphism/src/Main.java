class A{
	public void funcA() {
		System.out.println("A입니다");
	}
}
class B extends A {
	public void funcB() {
		System.out.println("B입니다");
	}
	public void funcA(int i) {
		super.funcA();
		System.out.println("rA입니다");
	}
}
class C extends A {
	
}
class D extends C {
	
}
public class Main {
	public static void main(String[] args) {
		
		A a = new B(); // up Casting
		a.funcA();
		((B)a).funcB(); // down Casting
		((B)a).funcA(1);
	}
}
