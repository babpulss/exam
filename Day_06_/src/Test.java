public class Test {
 public static void main(String[] args) {

  int[] ball = new int[45];
  int[] win = new int[7]; // 당첨 번호 6개 + 보너스
  int[] lottoNum = new int[6]; // 시도할 로또번호 6개

  int tmp = 0, x = 0, y = 0;

  int winField = 0; // 당첨 번호를 하나씩 비교하기 위한 변수
  int myField = 0; // 시도할 로또번호를 하나씩 비교하기 위한 변수

  int same = 0; // 같은 공의 개수
  int count = 0; // 전체 시도 횟수

  int second = 0; // 2등 당첨횟수
  int third = 0; // 3등 당첨횟수
  int fourth = 0; // 4등 당첨횟수
  int fifth = 0; // 5등 당첨횟수


  for(int i = 0; i < ball.length; i++) {
   ball[i] = i + 1;
  }

  for(int i = 0; i < ball.length * 10; i++) {
   x = (int)(Math.random() * 45);
   y = (int)(Math.random() * 45);

   tmp = ball[x];
   ball[x] = ball[y];
   ball[y] = tmp;
  }

  for(int i = 0; i < 7; i++) {
   win[i] = ball[i];
  }
  // ball[45]에 1~45의 값을 넣고 섞은 뒤, win[7]에 7개의 값을 넣어 줌.

  while(true) { // 당첨 번호를 맞추기 위한 반복문 시작
   same = 0;
   count++; // 전체 시도 횟수를 세기 위한 변수 count를 while문이 한번 반복할때마다 1씩 증가시켜 줌.

   for(int i = 0; i < ball.length; i++) {
    ball[i] = i + 1;
   }

   for(int i = 0; i < ball.length * 10; i++) {
    x = (int)(Math.random() * 45);
    y = (int)(Math.random() * 45);

    tmp = ball[x];
    ball[x] = ball[y];
    ball[y] = tmp;
   }

   for(int i = 0; i < 6; i++) {
    lottoNum[i] = ball[i];
   } //ball[45]에 1~45의 값을 넣고 섞은 뒤, lottoNum[7]에 7개의 값을 넣어 줌.

   for(int i = 0; i < win.length-1; i++) {
    for(int j = 0; j < lottoNum.length; j++) {
     winField = win[i];
     myField = lottoNum[j];
     if(winField == myField) {
      same++;
     }
    }
   }

   System.out.print(count + "번째 구입 로또 : ");
   for(int i = 0; i < lottoNum.length; i++) {
    System.out.print("(" + lottoNum[i] + ") ");
   } // 내가 시도한 로또 번호 6자리 출력을 위한 반복문.

   if(same == 3) { // 만약 당첨번호와 같은 공이 3개라면
    System.out.print("5등 당첨!!");
    System.out.println();
    fifth++;
   }else if(same == 4) { // 만약 당첨번호와 같은 공이 4개라면
    System.out.print("4등 당첨!!");
    System.out.println();
    fourth++;
   }else if(same == 5) { // 만약 당첨번호와 같은 공이 5개이면서
    for(int i = 0; i < lottoNum.length;i++) {
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
   }else if(same == 6) { // 만약 당첨번호와 같은 공이 6개라면
    System.out.print("1등 당첨!!!!!");
    System.out.println();
    System.out.println("<로또 당첨 번호>");
    for(int i = 0; i < win.length; i++) {
     System.out.print("(" + win[i] + ") ");
    }
    System.out.print("  보너스 : " + win[6]);
    System.out.println();
    System.out.println("========== 결 산 ==========");
    System.out.println("1등 총 상금 : 1000000000 원   당첨횟수 : 1" + "     당첨확률 : " + ((double)1/count) + "%");
    System.out.println("2등 총 상금 : " + (10000000L*second) + "원   당첨횟수 : " + second + "     당첨확률 : " + ((double)second/count) + "%");
    System.out.println("3등 총 상금 : " + (1000000L*third) + "원   당첨횟수 : " + third + "     당첨확률 : " + ((double)third/count) + "%");
    System.out.println("4등 총 상금 : " + (50000L*fourth) +  "원   당첨횟수 : " + fourth + "     당첨확률 : " + ((double)fourth/count) + "%");
    System.out.println("5등 총 상금 : " + (5000L*fifth) + "원   당첨횟수 : " + fifth + "     당첨확률 : " + ((double)fifth/count) + "%");
    System.out.println("총 로또 구매 금액 : " + (count*1000L) + "원");
    System.out.println("합산 : " + (1000000000L + (10000000L*second) + (1000000L*third) + (50000L*fourth) + (5000L*fifth) - (count*1000L)));
    break;
   } else {
    System.out.println("당첨 실패!!!");
    continue;
   }
  }
 }
}