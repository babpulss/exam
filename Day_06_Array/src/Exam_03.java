
public class Exam_03 {
	public static void main(String[] args) {
		// char �� �迭 5ĭ¥���� ����� A ���� E���� �����ϱ�


		char[] arr = new char[] {'A', 'B', 'C', 'D', 'E' };
		char[] arr1 = new char[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (char)(65 + i);
			System.out.println(arr1[i]);
		}


		// String �� �迭 3ĭ¥���� ����� Apple, Orange, Mango �� �����ϱ�

		String[] fruit = new String[] {"Apple", "Orange", "Mango"};

		int j = 0;
		while(j < fruit.length) {
			System.out.println(fruit[j++]);
		}

		// int �� �迭 100ĭ¥���� ����� 1 ~ 100���� �����ϱ�

		int[] intArr = new int[100];

		int i = 0;
		while(i < intArr.length) {
			intArr[i] = i + 1;
			System.out.println(intArr[i++]);
		}

		// int�� �迭 100ĭ ¥���� ����� 100 ~1���� �����ϱ�

		int[] intArr1 = new int[100];
		for(i = 0; i < intArr1.length; i++) {
			intArr1[i] = 100 - i;
			System.out.println(intArr1[i]);
		}
		
		// char �� �迭 26ĭ ¥���� �����ϰ� A - Z���� �����ϱ�
		
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
