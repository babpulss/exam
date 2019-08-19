
public class Lotto {
	public static void main(String[] args) {
		int[] winNum = new int[7];
		int[] buyerNum = new int[6];

		for(int i = 0; i < winNum.length; i++) {
			winNum[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < winNum.length; j++) {
				if (i == j)
					continue;
				if (winNum[i] == winNum[j]) {
					i--;
					break;
				}
			}				
		}

		int buyCnt = 0, spendPrice = 0, corNum = 0, secNum = 0, trdNum = 0, fthNum = 0, fifNum = 0;
		final int lottoPrice = 1000;

		out : while(true) {
			spendPrice -= lottoPrice; // ±¸¸Å
			buyCnt++;
			corNum = 0;

			for (int i = 0; i < buyerNum.length; i++) {
				buyerNum[i] = (int)(Math.random() * 45 + 1);
				for (int j = 0; j < buyerNum.length; j++) {
					if (i == j) continue;
					if (buyerNum[i] == buyerNum[j]) {
						i--;
						break;
					}
				}
			}

			for (int i = 0; i < buyerNum.length; i++) {
				for (int j = 0; j < winNum.length - 1; j++) {
					if (buyerNum[i] == winNum[j]) {
						corNum++;
					}
				}
			}

			System.out.print(buyCnt + "¹øÂ° ±¸ÀÔ ·Î¶Ç : ");
			for (int i = 0; i < buyerNum.length; i++)
				System.out.print("(" + buyerNum[i] + ") ");

			loop : switch (corNum) {
			case 3:
				fifNum++;
				System.out.println("5µî");
				break;
			case 4:
				fthNum++;
				System.out.println("4µî");
				break;
			case 5:
				for (int i = 0; i < buyerNum.length; i++) {
					if (buyerNum[i] == winNum[6]) {
						System.out.println("2µî");
						secNum++;
						break loop;
					}
				}
				trdNum++;
				System.out.println("3µî");
				break;
			case 6:
				System.out.println("1µî");
				System.out.println("<·Î¶Ç ´çÃ· ¹øÈ£>");
				for (int i = 0; i < winNum.length; i++) {
					if (i == 6) {
						System.out.println("  º¸³Ê½º : " + winNum[6]);
						System.out.println("========== °á »ê ==========");
						System.out.println("1µî : " + " ´çÃ·È®·ü :" + (double)1/buyCnt);
						System.out.println("2µî : " + "´çÃ·È½¼ö : " + secNum + " ´çÃ·È®·ü : " + (double)secNum/buyCnt); // 3/1 1/3
						System.out.println("3µî : " + "´çÃ·È½¼ö : " + trdNum + " ´çÃ·È®·ü : " + (double)trdNum/buyCnt);
						System.out.println("4µî : " + "´çÃ·È½¼ö : " + fthNum + " ´çÃ·È®·ü : " + (double)fthNum/buyCnt);
						System.out.println("5µî : " + "´çÃ·È½¼ö : " + fifNum + " ´çÃ·È®·ü : " + (double)fifNum/buyCnt);
						System.out.println("±¸ÀÔ È½¼ö: " + buyCnt);
						System.out.println("±¸ÀÔ¾×: " + spendPrice);
						break out;
					}
					System.out.print("(" + winNum[i] + ") ");
				}
				break;
			default :
				System.out.println("³«Ã·");
			}
		}
	}
}

