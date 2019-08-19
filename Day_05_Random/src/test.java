import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curNum = 0, userWin = 0, userLose = 0, rand = 0;
        int[] preferNum = new int[8];
        preferNum[7] = 30;
        for (int i = 1; i < preferNum.length; i++){
            preferNum[i - 1] = 2 * (i + (i - 1));
        }
        for (int i = 0; i < preferNum.length; i++)
            System.out.println(preferNum[i]);
        System.out.println("Baskin Robbins31 Game");
        while(true) {
            System.out.println();
            System.out.println("1. Game Start");
            System.out.println("2. Game Score");
            System.out.println("3. End Game");
            System.out.print("> ");
            int choice = Integer.parseInt(sc.nextLine());

            curNum = 0;
            switch(choice) {
                case 1:
                    System.out.println("<< Game Start >>");
                        //Computer turn
                    gameOut : while(true) {
                        System.out.println("<Computer turn >>");
                        loop : while (true) {
                            rand = (int) (Math.random() * 3 + 1);

                            for (int i = 0; i < preferNum.length; i++) {
                                if (preferNum[i] == rand + curNum)
                                    break loop;
                            }
                        }

                        for(int i = 0; i < rand; i++) {
                            curNum++;
                            if(curNum == 31) {
                                System.out.println(curNum);
                                System.out.println("이겼습니다");
                                userWin++;
                                break gameOut;
                            }
                            System.out.println(curNum);
                        }
                        System.out.print("Input Number(1 ~ 3) : ");
                        int input = Integer.parseInt(sc.nextLine());
                        if (input < 1 || input > 3) {
                            System.out.println("올바른 범위의 숫자를 입력하세요");
                            continue;
                        }
                        for(int i = 0; i < input; i++) {
                            curNum++;
                            if(curNum == 31) {
                                System.out.println(curNum);
                                System.out.println("졌습니다");
                                userLose++;
                                break gameOut;
                            }
                            System.out.println(curNum);
                        }
                    }
                    break;
                case 2:
                    System.out.println("<< 당신의 전적 >>");
                    System.out.println("W  I  N : " + userWin);
                    System.out.println("L O S E : " + userLose);
                    break;
                case 3:
                    System.out.println("게임을 종료합니다");
                    System.exit(0);
                    break;
                default :
                    System.out.println("메뉴를 다시 선택하세요");
            }
        }
    }
}