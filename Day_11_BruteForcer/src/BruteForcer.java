
public class BruteForcer {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++)
			System.out.println(chs[i]);
		
		int i = 10;
		String str1 = String.valueOf(i);
		i = Integer.valueOf(str1);
		System.out.println(i);
		FTP client = new FTP();
		client.FTPRun();

	}
}
