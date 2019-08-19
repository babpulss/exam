
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
			spendPrice -= lottoPrice; // ����
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

			System.out.print(buyCnt + "��° ���� �ζ� : ");
			for (int i = 0; i < buyerNum.length; i++)
				System.out.print("(" + buyerNum[i] + ") ");

			loop : switch (corNum) {
			case 3:
				fifNum++;
				System.out.println("5��");
				break;
			case 4:
				fthNum++;
				System.out.println("4��");
				break;
			case 5:
				for (int i = 0; i < buyerNum.length; i++) {
					if (buyerNum[i] == winNum[6]) {
						System.out.println("2��");
						secNum++;
						break loop;
					}
				}
				trdNum++;
				System.out.println("3��");
				break;
			case 6:
				System.out.println("1��");
				System.out.println("<�ζ� ��÷ ��ȣ>");
				for (int i = 0; i < winNum.length; i++) {
					if (i == 6) {
						System.out.println("  ���ʽ� : " + winNum[6]);
						System.out.println("========== �� �� ==========");
						System.out.println("1�� : " + " ��÷Ȯ�� :" + (double)1/buyCnt);
						System.out.println("2�� : " + "��÷Ƚ�� : " + secNum + " ��÷Ȯ�� : " + (double)secNum/buyCnt); // 3/1 1/3
						System.out.println("3�� : " + "��÷Ƚ�� : " + trdNum + " ��÷Ȯ�� : " + (double)trdNum/buyCnt);
						System.out.println("4�� : " + "��÷Ƚ�� : " + fthNum + " ��÷Ȯ�� : " + (double)fthNum/buyCnt);
						System.out.println("5�� : " + "��÷Ƚ�� : " + fifNum + " ��÷Ȯ�� : " + (double)fifNum/buyCnt);
						System.out.println("���� Ƚ��: " + buyCnt);
						System.out.println("���Ծ�: " + spendPrice);
						break out;
					}
					System.out.print("(" + winNum[i] + ") ");
				}
				break;
			default :
				System.out.println("��÷");
			}
		}
	}
}

