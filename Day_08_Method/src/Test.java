
public class Test {
	public static void main(String[] args) {
		String str = "Reverse";
		
		char[] ch = str.toCharArray();
		
		char tmp = 0;
		
		for (int k = 0; k < ch.length; k++) {
			tmp = ch[0];
		for (int i = 1; i < ch.length; i++) 
			ch[i - 1] = ch[i];

			ch[ch.length - 1] = tmp;
			
		for( int j = 0; j < ch.length; j++) {
			System.out.print(ch[j]);
		}
		System.out.println();
		}
	}
}
