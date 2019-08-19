public class Test {
 public static void main(String[] args) {

  int[] ball = new int[45];
  int[] win = new int[7]; // ��÷ ��ȣ 6�� + ���ʽ�
  int[] lottoNum = new int[6]; // �õ��� �ζǹ�ȣ 6��

  int tmp = 0, x = 0, y = 0;

  int winField = 0; // ��÷ ��ȣ�� �ϳ��� ���ϱ� ���� ����
  int myField = 0; // �õ��� �ζǹ�ȣ�� �ϳ��� ���ϱ� ���� ����

  int same = 0; // ���� ���� ����
  int count = 0; // ��ü �õ� Ƚ��

  int second = 0; // 2�� ��÷Ƚ��
  int third = 0; // 3�� ��÷Ƚ��
  int fourth = 0; // 4�� ��÷Ƚ��
  int fifth = 0; // 5�� ��÷Ƚ��


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
  // ball[45]�� 1~45�� ���� �ְ� ���� ��, win[7]�� 7���� ���� �־� ��.

  while(true) { // ��÷ ��ȣ�� ���߱� ���� �ݺ��� ����
   same = 0;
   count++; // ��ü �õ� Ƚ���� ���� ���� ���� count�� while���� �ѹ� �ݺ��Ҷ����� 1�� �������� ��.

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
   } //ball[45]�� 1~45�� ���� �ְ� ���� ��, lottoNum[7]�� 7���� ���� �־� ��.

   for(int i = 0; i < win.length-1; i++) {
    for(int j = 0; j < lottoNum.length; j++) {
     winField = win[i];
     myField = lottoNum[j];
     if(winField == myField) {
      same++;
     }
    }
   }

   System.out.print(count + "��° ���� �ζ� : ");
   for(int i = 0; i < lottoNum.length; i++) {
    System.out.print("(" + lottoNum[i] + ") ");
   } // ���� �õ��� �ζ� ��ȣ 6�ڸ� ����� ���� �ݺ���.

   if(same == 3) { // ���� ��÷��ȣ�� ���� ���� 3�����
    System.out.print("5�� ��÷!!");
    System.out.println();
    fifth++;
   }else if(same == 4) { // ���� ��÷��ȣ�� ���� ���� 4�����
    System.out.print("4�� ��÷!!");
    System.out.println();
    fourth++;
   }else if(same == 5) { // ���� ��÷��ȣ�� ���� ���� 5���̸鼭
    for(int i = 0; i < lottoNum.length;i++) {
     if(win[6] == myField) { // ���� ��÷��ȣ�� ���� ���� 5�� �̸鼭 ���ʽ���ȣ�� ���� ���� �ִٸ�
      System.out.print("2�� ��÷!!");
      System.out.println();
      second++;
     } else { // ���� ��÷��ȣ�� ���� ���� 5�� �̸鼭 ���ʽ���ȣ�� ���� ���� ���ٸ�
      System.out.print("3�� ��÷!!");
      System.out.println();
      third++;
      break;
     }
    }
   }else if(same == 6) { // ���� ��÷��ȣ�� ���� ���� 6�����
    System.out.print("1�� ��÷!!!!!");
    System.out.println();
    System.out.println("<�ζ� ��÷ ��ȣ>");
    for(int i = 0; i < win.length; i++) {
     System.out.print("(" + win[i] + ") ");
    }
    System.out.print("  ���ʽ� : " + win[6]);
    System.out.println();
    System.out.println("========== �� �� ==========");
    System.out.println("1�� �� ��� : 1000000000 ��   ��÷Ƚ�� : 1" + "     ��÷Ȯ�� : " + ((double)1/count) + "%");
    System.out.println("2�� �� ��� : " + (10000000L*second) + "��   ��÷Ƚ�� : " + second + "     ��÷Ȯ�� : " + ((double)second/count) + "%");
    System.out.println("3�� �� ��� : " + (1000000L*third) + "��   ��÷Ƚ�� : " + third + "     ��÷Ȯ�� : " + ((double)third/count) + "%");
    System.out.println("4�� �� ��� : " + (50000L*fourth) +  "��   ��÷Ƚ�� : " + fourth + "     ��÷Ȯ�� : " + ((double)fourth/count) + "%");
    System.out.println("5�� �� ��� : " + (5000L*fifth) + "��   ��÷Ƚ�� : " + fifth + "     ��÷Ȯ�� : " + ((double)fifth/count) + "%");
    System.out.println("�� �ζ� ���� �ݾ� : " + (count*1000L) + "��");
    System.out.println("�ջ� : " + (1000000000L + (10000000L*second) + (1000000L*third) + (50000L*fourth) + (5000L*fifth) - (count*1000L)));
    break;
   } else {
    System.out.println("��÷ ����!!!");
    continue;
   }
  }
 }
}