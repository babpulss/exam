import java.util.Scanner;

public class UpDownVer_2 {
	public static void main(String[] args) {
		//ÄÄÇ»ÅÍ°¡ ·£´ı¼ıÀÚ¸¦ Á¦½ÃÇÒ ¼ö ÀÖµµ·Ï ÀÛ¼º
		Scanner sc = new Scanner(System.in);
		int input = 0, com = 0;
		
		int cnt = 100;
		while(true) {
			try {
				while(true) {
					int rand = (int)(Math.random() * 99) + 1;
					System.out.println(rand);
					System.out.println("== Up & Down Game ==");
					System.out.println();
					System.out.println("1. Game Start");
					System.out.println("2. Game Score");
					System.out.println("3. End Game");
					System.out.println();
					System.out.print("> ");
					try {
					input = Integer.parseInt(sc.nextLine());
					} catch(Exception e) {
						System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
						continue;
					}
					
					switch(input) {
					case 1:
						cnt = 0;
						System.out.println("<<  Game Start >>");
						System.out.print("Input Number : ");
						while(true) {
							try {
							input = Integer.parseInt(sc.nextLine());
							}catch(Exception e) {
								System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
								continue;
							}
							cnt++;
							if(input == rand) {
								System.out.println("Á¤´äÀÔ´Ï´Ù");
								break;
							}
							if(input < rand) {
								System.out.println("<<  U   P  >>");
							} else if(input > rand) {
								System.out.println("<< D O W N >>");
							}
							com = (int)(Math.random() * 99 + 1);
							System.out.println("¾ËÆÄ°í : " + com);
							if(com == rand) {
								System.out.println("ÄÄÇ»ÅÍ°¡ ¸Â­Ÿ½À´Ï´Ù");
								break;
							}
							if(com < rand) {
								System.out.println("<<  U   P  >>");
							} else if(com > rand) {
								System.out.println("<< D O W N >>");
							}
						}
						break;
					case 2:
						System.out.println("ÇöÀç±îÁö ÃÖ¼Ò ±â·ÏÈ½¼ö´Â " + cnt + "¹ø ÀÔ´Ï´Ù");
						break;
					case 3:
						System.out.println("°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù");
						System.exit(0);
					}
				}
			}catch(Exception e) {
				System.out.println("¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
			}
		}

	}
}

