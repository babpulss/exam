import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 크리티컬 이슈
		// 코드 중복도 - 상속을 이용해서 해결
		// 코드 결합도 - 다형성을 이용해서 해결
		// 저장소 문제 - Collection Framework
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		
		manager.insertNewMember(new Silver(1001, "홍길동", 1000));
		manager.insertNewMember(new Silver(1002, "임꺽정", 1500));
		
		manager.insertNewMember(new Gold(1003, "장길산", 2000));
		manager.listMembers();
		
		Member m = new Silver(1, "a", 1); // 업 캐스팅
		Silver s = new Silver(1, "b", 1); // 상속으로 슈퍼메소드에 자식 메소드가 오버라이드됨
		System.out.println(s.getBonus());
		System.out.println(m.getPoint());
	}
}
