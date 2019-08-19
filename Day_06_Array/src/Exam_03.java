
public class Exam_03 {
	public static void main(String[] args) {
		// char 형 배열 5칸짜리를 만들고 A 부터 E까지 저장하기


		char[] arr = new char[] {'A', 'B', 'C', 'D', 'E' };
		char[] arr1 = new char[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (char)(65 + i);
			System.out.println(arr1[i]);
		}


		// String 형 배열 3칸짜리를 만들고 Apple, Orange, Mango 를 저장하기

		String[] fruit = new String[] {"Apple", "Orange", "Mango"};

		int j = 0;
		while(j < fruit.length) {
			System.out.println(fruit[j++]);
		}

		// int 형 배열 100칸짜리르 만들고 1 ~ 100까지 저장하기

		int[] intArr = new int[100];

		int i = 0;
		while(i < intArr.length) {
			intArr[i] = i + 1;
			System.out.println(intArr[i++]);
		}

		// int형 배열 100칸 짜리를 만들고 100 ~1까지 저장하기

		int[] intArr1 = new int[100];
		for(i = 0; i < intArr1.length; i++) {
			intArr1[i] = 100 - i;
			System.out.println(intArr1[i]);
		}
		
		// char 형 배열 26칸 짜리를 생성하고 A - Z까지 저장하기
		
		char[] charArr = new char[26];
		
		for (i = 0; i < charArr.length; i++) {
			charArr[i] = (char)(65 + i);
			System.out.println(charArr[i]);
		}
		
		char[] charArr1 = new char[26];
		
		for (i = 0; i < charArr1.length; i++) {
			charArr1[i] = (char)(90 - i);
			System.out.println(charArr1[i]);
		}
	}
}
