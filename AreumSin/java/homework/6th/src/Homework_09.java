public class Homework_09 {
    public static void main(String[] args) {
        // 문제은행[3]을 다르게 풀었음..
        // 문제 은행[2] 배열로 풀어보기

        //25번째 알기
        final int END = 25;
        final int START = 3;

        int[] num = new int[END];

        num[0] = 1;
        num[1] = 1;
        num[2] = 1;

        for(int i = START; i < END; i++){
            num[i] = num[i-3] +num[i-1];
            System.out.println(num[i]);
        }
    }
}
