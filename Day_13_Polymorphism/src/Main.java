class A{
	public void funcA() {
		System.out.println("A�Դϴ�");
	}
}
class B extends A {
	public void funcB() {
		System.out.println("B�Դϴ�");
	}
	public void funcA(int i) {
		super.funcA();
		System.out.println("rA�Դϴ�");
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
