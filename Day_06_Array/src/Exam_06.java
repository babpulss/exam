
public class Exam_06 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 23, 54, 33, 48, 17 };
		int tmp;
		// Bubble sort, select sort, Quick sort
		
		System.out.println("���� �� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}// ���� ��
		System.out.println();
		//// ���� ����
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length -1; j++) {
				if(arr[j] < arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}	
			}
		}
		//// ���� ����
		int select;
		
		for (int i = 0; i < arr.length - 1; i++) {
			select = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (select > arr[j]) {
					tmp = select;
					arr[i] = select = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
	/////////////////////////////////////////////////////	
		System.out.println("���� �� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}// ����  ��
		System.out.println();
	}
}
