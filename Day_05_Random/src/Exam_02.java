
public class Exam_02 {
	public static void main(String[] args) {
		System.out.print("0 ~ 9 까지의 랜덤 수 : ");
		int max = 0, min = 0;
		max= 9; min = 0;
		double num1 = Math.random();
		System.out.println((int)(num1*(max - min + 1)) + min);
		
//		1~10
		System.out.println((int)(Math.random()*(10 - 1 + 1) + 1));
//		20~35
		System.out.println((int)(Math.random()*(35 - 20 + 1) + 20));
//		0~1

	}	
}