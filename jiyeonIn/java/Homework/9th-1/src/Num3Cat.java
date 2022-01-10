import java.util.Scanner;

public class Num3Cat {
    private Scanner scan;
    private int catNum = 1;
    private boolean isCatDoing;

    public void scanner() {
        scan = new Scanner(System.in);
        int num;
    }
    public void cat() {
        scanner();
        int num = scan.nextInt();
        System.out.println("지연이 집엔" + num + "마리 고양이가 있어");
    }

    //고양이는 운다. 언제? 주인이 집에 돌아오면 //
    public void cry() {
        scanner();
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("야옹");
        } else
            System.out.println("냐아아옹");
    }

    public void ddong() {
        isCatDoing = true;
        while (isCatDoing) {
            scanner();
            int num = scan.nextInt();

            if (num >= 1 && num <= 9) {
                System.out.println(num+"시에는 그루밍하기");
            } else if (num >= 10 && num <= 16) {
                System.out.println(num+" 시에는 장판긁기");
            }else if (num >= 17 && num <= 24) {
                System.out.println(num+"시에는 창 밖보기");
            } else {
                System.out.println("1시부터 24시까지의 시간을 입력하시오");
                continue;
            }
        }
    }
}
