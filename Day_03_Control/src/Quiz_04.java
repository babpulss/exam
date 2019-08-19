import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 값 : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("끝 값 : ");
		int last = Integer.parseInt(sc.nextLine());
		
		if (start > last) {
		while(start <= last) {
			System.out.print(start + " ");
			start++;
			}
		} else {
			System.out.println("start 값은 end 값 보다 작을 수 없습니다.");
		}
	}
	
}
