
public class Exam_06 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 23, 54, 33, 48, 17 };
		int tmp;
		// Bubble sort, select sort, Quick sort
		
		System.out.println("정렬 전 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}// 정렬 전
		System.out.println();
		//// 버블 정렬
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length -1; j++) {
				if(arr[j] < arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}	
			}
		}
		//// 선택 정렬
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
		System.out.println("정렬 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}// 정렬  후
		System.out.println();
	}
}
