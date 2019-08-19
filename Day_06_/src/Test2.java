
public class Test2 {
	public static void main(String[] args) {
		
	int[] win = new int[] { 1, 2, 3, 4, 5, 6, 7 };
	int myField = 1, second = 0, third = 0;
	
	
	for(int i = 0; i < win.length;i++) {
	     if(win[6] == myField) { // 만약 당첨번호와 같은 공이 5개 이면서 보너스번호와 같은 공이 있다면
	      System.out.print("2등 당첨!!");
	      System.out.println();
	      second++;
	     } else { // 만약 당첨번호와 같은 공이 5개 이면서 보너스번호와 같은 공이 없다면
	      System.out.print("3등 당첨!!");
	      System.out.println();
	      third++;
	      break;
	     }
	    }
	}
}
