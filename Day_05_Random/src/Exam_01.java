
public class Exam_01 {
	public static void main(String[] args) {
		
		double rand = Math.random(); //0 ~ 1사이의 Double값이 생성
		System.out.println((int)(rand * 10) + 1);
		
		System.out.println((int)(Math.random()*(20 - 10 + 1) + 10));
	}
}
