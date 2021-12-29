import java.util.Scanner;

public class M1 {
    //아래와 같은 등비 수열이 있다.
    //    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ..
    //    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자.
    // 2의 몇승인지 구하기
        public static void main(String[] args) {
            final int START=0;
            Scanner Scan= new Scanner(System.in);


            System.out.println("2의 몇 승의 값을 구하고 싶은가?");
            int end= Scan.nextInt();
            int[] array=new int[end];


            for (int i=START;i<= end;i++){
                array[i]=(int)Math.pow(2,i);
                //제곱 구하는식 Math.pow(밑항,제곱근)
                System.out.printf("%d의 제곱의 값은 %d이다\n",i,array[i]);
            }

        }
    }


