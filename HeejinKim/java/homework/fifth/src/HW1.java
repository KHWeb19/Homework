import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

       /* 아래와 같은 등비 수열이 있다.
         1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
         사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!

         (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)*///8번이 메서드 없이 만드는거 어려움
        //1.등비수열의 식 생각....
        // 1    2      4     8      16
        //a1  a1x2   a2x2   a3x2
        //      a2    a3    a4
        //배열을 만들자
        //배열을 만들고 거기다 x2를하여 수식을 만들자
        //초기값은 넣어줌
        // 원하는 값 나오도록 입력하려면 scanner도 필요함

        final int START = 2;
        final int MUL = 2;

        Scanner scan = new Scanner(System.in);
        //입력값 넣기 위해 만들어줌
        System.out.print("등비수열 몇번째항 구할까요 ? ");

        int put = scan.nextInt();
         //받은 입력값을 int에 넣어줌
        int[] sequence = new int[put];
         // int에 넣어준 입력값은 배열인덱스에 넣어줌

        sequence[0] = 1;
        sequence[1] = 2;//초기값을 설정해줌

        for (int i = START; i < put; i++) {

            sequence[i] = (sequence[i - 1]) *MUL;//수식

            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
            //출력할때는 arr[%d]를 써야 제대로 출력가능

        }
    }
}
