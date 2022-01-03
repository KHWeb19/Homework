public class Q09 {
    public static void main(String[] args) {

        // Q9.
        // 문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        // 이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        final int MAX = 25; // 25번째 항 지정

        int[] BigNum = new int[MAX]; // 배열 생성해서 길이 MAX로 지정

        // 참고
        // [1] [1] [1] [2] [3] [4] [6] [9] [13] [19] [28] [ ] [ ]
        //  0   1   2   3   4   5   6   7   8    9    10  11  12

        BigNum[0] = 1;
        BigNum[1] = 1;
        BigNum[2] = 1;
        BigNum[3] = 2;

        int i;
        for (i = 3; i <MAX; i++) {
            BigNum[i] = BigNum[i - 3] + BigNum[i - 1];
            // A B C D 순서에서 D값이 A+C 이므로 D에서
            // 3만큼 앞으로간 값 A와 D에서 1만큼 앞으로간 C를 더해준다.
        }

        for (i=0; i<MAX; i++){
            System.out.println(+BigNum[i]); // i의 값을 출력한다.
        }



    }
}
