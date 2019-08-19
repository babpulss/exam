
public class Quiz_03 {
	public static void main(String[] args) {
		// 1 ~ 5 사이의 중복되지 않는 3개의 숫자를 출력
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5 + 1);

			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (arr[i] == arr[j]) {
					i--;
					break;
				};
			}
		}		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		
		// 1 ~ 45 사이에서 중복되지 않는 7개의 숫자
		
		int[] arr1 = new int[45];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < arr1.length; j++) {
				if (i == j) continue;
				if (arr1[i] == arr1[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < 7; i++)
			System.out.print(arr1[i] + " ");
	System.out.println();
for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		for (int i = 0; i < arr1.length * arr1.length; i++) {
			int tmp = (int)((Math.random() * 45));
			int tmp1 = (int)((Math.random() * 45));
			
			int tmp2 = arr1[tmp];
			arr1[tmp] = arr1[tmp1];
			arr1[tmp1] = tmp2;
		}
		
		for (int i = 0; i < 6; i++){
			System.out.print(arr1[i] + " ");
		}
	}
}
