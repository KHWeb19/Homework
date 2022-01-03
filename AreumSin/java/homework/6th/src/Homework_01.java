import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        // 배열을 사용하지않았음.
        // 배열을 사용해서 다시 해보자.

        //   1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...

        final int NUMBER =2; // N^2이 반복함.
        final int MAX =31;
        int base = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 위치를 입력해주세요 : ");

        int num = scanner.nextInt(); // num에 입력받은 숫자를 저장됨.

        //num 까지 반복해야함.
        // 배열의 크기는 num 까지 해야함. 0부터 시작이니깐 가능.

        int[] seq = new int[num];

        if(num > MAX){ //int가 나타낼수 없는 범위.
            System.out.println("종료합니다.");
        }else{
            for (int i = 0; i < num; i++){
                seq[i] = base;
                base *= NUMBER;

                System.out.printf("%d의 해당하는 수는 %d 입니다.\n",i,seq[i]);

                // seq[i] = (int)Math.pow(NUMBER,i); //NUMBER^i 하고 for문을 통해 반복하니 가능함.
                // System.out.printf("seq[%d] = %d\n",i, seq[i]);
            }
        }
    }
}
