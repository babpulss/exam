
public class Quiz_01_01 {
	public static void main(String[] args) throws Exception{
		System.out.print("문자 입력 : ");
		int input = System.in.read(); //System.in.read()는 int자료형으로 입력받음
		System.out.println();
		System.out.println("입력하신 문자 : " + (char)input);
		System.out.println("소문자로 변환 : " + (char)(input + 32));
	}
}
