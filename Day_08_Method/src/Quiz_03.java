
public class Quiz_03 {
	
	public static int countA(String str) {
		char[] ch = str.toCharArray();
		int cnt = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A')
				cnt++;
		}
		return cnt;
	}
	
	public static int countA1(String str, char ch) {
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}

	public static int countChar(String str, char ch) {
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}

	public static int countInput(String str, int ch) {
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}
	
	public static int countInput(String str) {
		int cnt = 0;
		int ch = 0;
		while(true)
		try {
		ch = System.in.read();
		break;
		} catch (Exception e) {
			System.out.println("tyr again");
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == (char)ch)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) throws Exception {
		String str = "OWEIAAAANVIOJISAOD;FOIJV";
		
		System.out.println(countA(str)); // ¾ËÆÄºª AÀÇ °¹¼ö¸¦ Ãâ·Â
		System.out.println(countChar(str, 'A'));
		
		for (int i = 'A'; i < 'Z' ; i++) {
			int j = countChar(str, (char)i);
			if (j != 0)
				System.out.println((char)i + " : " + j);
		}
	}
}
