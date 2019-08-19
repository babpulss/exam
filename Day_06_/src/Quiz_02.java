
public class Quiz_02 {
	public static void main(String[] args) {
		String[] arr = new String[] { "A", "B", "C", "D", "E" };
		String[] arr2 = new String[5];
		
		for (int i = arr.length	- 1; i >= 0; i--) {
			arr2[i] = arr[4 - i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - i - 1];
		}
		
		for (int i =0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
