import java.util.Scanner; //testing

public class Rice_Package {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇 Kg? :");
		int req = Integer.parseInt(sc.nextLine());
		int bigPack = 0, smallPack = 0, tmpBigPack = req / 5;

		if (req < 3) {
			System.out.println("최소 3Kg 이상만 가능");
			return;
		}

		if ((req < 10 || req == 12 || req != 8) && (req % 3 == 0)) {
			smallPack = req / 3;
		} else if (req % 5 == 0) {
			bigPack = req / 5;
		} else if(req % 5 != 0){
			for (int i = tmpBigPack; i > 0; i--) {
				if ((req - 5 * i) % 3 == 0) {
					smallPack = (req - 5 * i) / 3;
					bigPack = i;
					break;
				} else if ((req % 5) % 3 != 0) {
					continue;
				}
			}
		} else {
			bigPack = -1;
			smallPack = -1;
		}
		System.out.println("5kg : " + bigPack + " 3kg : " + smallPack);
	}
}
