import java.util.Scanner;

public class Homework_09 {
    public static void main(String[] args) {
        //9. 문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
        // 3 번을 배열로 풀었습니다.....

        //3. 배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.


        final int MEMBER = 100;
        int[] win = new int[MEMBER]; // 100명 지정.

        boolean isCheck = true;

        int winNum;

        for(int i = 0; i < 5; i++){ // 배열 중 당첨 된 5개가 들어가 있다.
            winNum = (int)(Math.random()*MEMBER);
            win[winNum] = 7777;
            System.out.println(winNum+"="+win[winNum]);
        }

        System.out.print("당첨되라...!! 돌리려면 1 >>");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        while(num1 == 1) {
            int randNum = (int) (Math.random() * MEMBER);
            System.out.println(randNum);
            if (win[randNum] == 7777) {
                System.out.println(randNum+" = "+win[randNum]);
                num1 = 2;
            }
        }

    }
}
