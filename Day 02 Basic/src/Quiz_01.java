
public class Quiz_01 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b;
		c= (char)b; 
		s = (short)c;
		c= (char)s;
		i = (int)100L;
		l = (long)500;
		f= l; 
		f = 5.11f;
		
		System.out.println(c);
		
		// char || byte < short < int < long < float < double
	}
}
