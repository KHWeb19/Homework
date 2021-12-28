public class Num9 {
    public static void main(String[] args) {
        //, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //   이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        /*
        1. 배열선언 0~24까지
        2. 0~2까지는 직접 배열에 값 지정
        3. 0+2 = 3 / 1+3 =4 (배열기준)으로 값을 만들어서 더하기
         */

        final int END = 25;
        int [] arr = new int[25];
        arr[0] =1;
        arr[1] =1;
        arr[2] =2;

        int sum =0;

        for (int i=3;i<END;i++){
            arr[i] = arr[i-1]+arr[i-3];
            System.out.printf("arr[%d] : %d\n",i,arr[i]);
        }


    }
}
