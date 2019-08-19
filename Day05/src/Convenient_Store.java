import java.util.Scanner;

public class Convenient_Store {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, current_price = 10000, current_iceCream = 0, current_lunchBox = 0;
		final int ICECREAM_PRICE = 1000, LUNCHBOX_PRICE = 2000;

		System.out.println("=== 편의점 ===");
		while(true) {
			try {
				while(true) {
					System.out.println("메뉴를 선택하세요");
					System.out.println("1. 소지품 확인하기");
					System.out.println("2. 구매하기");
					System.out.println("3. 환불하기");
					System.out.println("4. 나가기");
					System.out.print("선택 > ");
					input = Integer.parseInt(sc.nextLine());

					menu : switch(input) {
					case 1: // 소지금액과 소지품 출력
						System.out.println("====================");
						System.out.println("현재 소지품");
						System.out.println("소지금 : " + current_price + "원");
						System.out.println("아이스크림 : " + current_iceCream + "개");
						System.out.println("도시락 : " + current_lunchBox + "개");
						System.out.println("====================");	
						break;
					case 2: // 구매 메뉴
						while(input != 3) {
							System.out.println("====================");	
							System.out.println("현재 소유 금액 (" + current_price + "원)");
							System.out.println("보유 품목");
							System.out.println("1. 아이스크림 == 1000 원");
							System.out.println("2. 도시락 == 2000 원");
							System.out.println("3. 이전으로 나가기");
							System.out.print("원하시는 상품을 선택하세요 > ");
							input = Integer.parseInt(sc.nextLine());
							//구매 메뉴 
							switch(input) {
							case 1:
								if(current_price < ICECREAM_PRICE) {
									System.out.println("잔액이 부족합니다" + "(현재 잔액 : " + current_price+ ")");
									break;
								}
								current_iceCream += 1;
								current_price -= 1000;
								System.out.println("아이스크림을 1개 구매함 (현재 잔액 : " + current_price + ")");
								break;
							case 2:
								if(current_price < LUNCHBOX_PRICE) {
									System.out.println("잔액이 부족합니다" + "(현재 잔액 : " + current_price + ")");
									break;
								}
								current_lunchBox += 1;
								current_price -= 2000;
								System.out.println("도시락을 1개 구매함 (현재 잔액 : " + current_price + ")");
								break;
							case 3:
								break menu;
							default :
								System.out.println("메뉴를 올바로 선택해주세요");
							}
						}
						break;
					case 3: //환불 메뉴
						while(true) {
							System.out.println("환불할 메뉴를 선택해 주세요");
							System.out.println("현재 구매한 품목");
							System.out.println("1. 아이스크림 : " + current_iceCream+ "개");
							System.out.println("2. 도시락 : " + current_lunchBox+ "개");
							System.out.println("3. 이전으로 나가기");
							input = Integer.parseInt(sc.nextLine());

							switch(input) {// 환불 하기
							case 1:
								current_price += (current_iceCream * 1000);
								System.out.println("환불된 금액 : " + (current_iceCream * 1000));
								System.out.println("현재 잔액: " + current_price);
								current_iceCream = 0;
								break;
							case 2:
								current_price += (current_lunchBox * 2000);
								System.out.println("환불된 금액 : " + (current_lunchBox * 2000));
								System.out.println("현재 잔액: " + current_price);
								current_lunchBox = 0;
								break;
							case 3:
								break menu;
							}
						}
					case 4: //프로그램 종료
						System.out.println("편의점을 나갔습니다");
						System.exit(0);
					}	
				}
			} catch(Exception e) {
				System.out.println("올바른 메뉴를 선택하세요");
			}
		}
	}
}
