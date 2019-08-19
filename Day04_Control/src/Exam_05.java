import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		int a = 65;
		int b = 10;
		char c = 'A';
		char d = 'A';
		String e = "Hello";
		String f = "Hello";
		String g = new String("Hello"); //
		
		System.out.println(c == a); //true
		System.out.println(e ==f); // 두 참조변수 String은 heap 메모리의 주소값이 같기 때문에 결과가 true이다
		System.out.println(e ==f); 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지");
		String msg = sc.nextLine();
		
		
		if(msg.equals("Hello")) { // msg.equals는 변수의 값을 비교
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(msg == "Hello") { // 주소값을 비교
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}
}
