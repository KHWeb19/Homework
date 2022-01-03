public class Practice4 {
    public static void main(String[] args) {
        //문제4. 구구단 7단을 출력해보자!

        int sevenMT = 0;
        while (sevenMT < 63){ // sevenMT가 63보다 작은 동안 반복해서 내용을 출력한다.
            sevenMT++; // sevenMT(0) + 1

            if (sevenMT % 7 == 0){ // (sevenMT를 나눈 숫자가 0인가요?)<-라는 조건문을 만족한 경우
                System.out.printf("sevenMT는 구구단 7단의 숫자 = %d\n", sevenMT); //이 내용을 출력한다.
            }

        }
    }
}
