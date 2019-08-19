import java.util.Scanner;
public class Text{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int menu = 0;
  int my = 0;
  int com =0;
  int i=0;
  int win=0;
  int lose=0;
  while(true) {
   System.out.println("Baskin Robbins31 Game\n");
   System.out.println("1. Game Start");
   System.out.println("2. Game Score");
   System.out.println("3. End Game");
   while(true) {
    try {
     System.out.print(">");
     menu = Integer.parseInt(sc.nextLine());
     break;
    }catch(Exception e) {
     System.out.println("잘못 입력하셨습니다.");
     continue;
    }
   }
   switch(menu) {
   case 1:
    int st=1;//시작범위
    int end=st+2;//끝범위
    
    System.out.println("<<Game Start>>");
    while(!(my==31||com==31)) {
     System.out.println("<My Turn>");
     System.out.print("Input Number("+st+"~"+end+") : ");
     while(true) {
      my = Integer.parseInt(sc.nextLine());
      if(my>end || my<st) {
       System.out.println("잘못된 입력입니다.");
       continue;
      }
      end=my;
      break;
     }
     
     for(i=st; i<=end; i++) {
      System.out.println(i);
     }
     st=end+1; //범위 변경
     end=st+2;
     System.out.println("<Computer Turn> :"+st+"~"+end);
     if(st==31) {
      System.out.println("com의 선택 : 31");
      System.out.println("내가 이겼습니다.\n\n");
      win++;
      break;
     }
     else if(st==27) {
      System.out.print("com의 선택 : ");
      System.out.println(st);
      com=st;
      st=st+1;
      end=st+2;
     }else if(st>=24&&st<27) {
      System.out.println("com의 선택 : 26");
      for(i=0; i<27-st; i++) {
       System.out.println(st+i);
      }
      st=27;
      end=st+2;
     }else if(st>27&&st<31) {
      System.out.println("com의 선택 : 30");
      for(i=0; i<31-st; i++) {
       System.out.println(st+i);
      }
      st=31;
      end=31;
     }else {
      com=(int)(Math.random()*(end-st+1)+st);
      System.out.println("com의 선택 : "+com);
      for(i=st; i<=com; i++) {
       System.out.println(i);
      }
      st=com+1;
      end=st+2;
     }
    
     if(my==31) {
      System.out.println("내가 졌습니다.\n\n");
      lose++;
      break;
     }else if(com==31) {
      System.out.println("내가 이겼습니다.\n\n");
      win++;
      break;
     }
    }
    break;
    
   case 2:
    System.out.println("<<Game Score>>");
    System.out.println(win+"승 & "+lose+"패\n\n");
    break;
    
   case 3:
    System.out.println("프로그램을 종료하겠습니다.");
    System.exit(0);
   }
  }
 }
}
