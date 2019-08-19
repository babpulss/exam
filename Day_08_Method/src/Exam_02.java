
public class Exam_02 {
	public static void main(String[] args) {
		String str = "1He llo";
		
		int result = str.length();
		
		System.out.println(result);
		
		
		
		System.out.println(str.startsWith("e", 1));
		System.out.println(str.startsWith("el", 1));
		
		int[] arr = new int[1];
		
		System.out.println(str.endsWith("o"));	
		
		System.out.println(str.valueOf(true));
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		System.out.println(str.contains("h"));
		System.out.println(str.contains("H"));
		System.out.println(str.contains("Hel"));
		
		
		System.out.println("indexOf : " + str.indexOf("H"));
		
		
		char[] charArr = str.toCharArray();
		
		for (int i = 0; i < charArr.length; i++)
			System.out.println(charArr[i]);
		
		str.equals("H");
		System.out.println("toCharArray : " + str.toCharArray());
		System.exit(0);
	}
}
