
public class Quiz_01 {

	public static String dict(String str) {
		if(str.contentEquals("���")) 
			return "apple";
		else if(str.contentEquals("����"))
			return "grape"; 

		return "Not found";
	}


	public static void main(String[] args) {

		String result1 = dict("���");
		String result2 = dict("����");
		System.out.println(result1); // apple
		System.out.println(result2); // apple
	}
}
