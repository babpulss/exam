
public class Exam_01 {
	
	public static void func(char a) {
		System.out.println("func(char) ����");
	}
	public static void func(int a) {
		System.out.println("func() �� ����");
	}

	public static void func() {
		System.out.println("func() ����");
	}
	
	public static void func(int a, int b) {
		System.out.println("func(int, int) ����");
	}

	public static void main(String[] args) {
		func();
		func(1);
		func('a');
		func(1, 2);
	}
}
