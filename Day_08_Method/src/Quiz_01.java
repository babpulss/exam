
public class Quiz_01 {

	public static String dict(String str) {
		if(str.contentEquals("사과")) 
			return "apple";
		else if(str.contentEquals("포도"))
			return "grape"; 

		return "Not found";
	}


	public static void main(String[] args) {

		String result1 = dict("사과");
		String result2 = dict("포도");
		System.out.println(result1); // apple
		System.out.println(result2); // apple
	}
}
