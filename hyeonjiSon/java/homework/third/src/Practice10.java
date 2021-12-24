public class Practice10 {
    public static void main(String[] args) {
        //문제10. 1 ~ 100까지 숫자를 순회한다.
        //2 ~ 10 사이의 랜덤한 숫자를 선택하고, 이 숫자만큼 이동한다.
        //이동했을 때 나온 숫자들의 합을 계산해보자.
           // = 정수 변수 i 가 100이 될 때 까지 돌아가는 반복문 내에서
           // 매회 반복마다 i에 +(랜덤숫자)가 되도록 하고 100회 반복하며 출력된 숫자를 모두 더하시오?

        int sum = 0; //우선 sum메모리에 할당하는 숫자를 0으로 설정한다.
        int i = 1;

        while( i <=100 ){ //총 100바퀴를 도는 반복문
            int random = (int)(Math.random() *9 +2); // 2~10까지의 랜덤한 숫자를 골라주는 클래스
            int total1 = i + random; // i + 랜덤 숫자는 = total1 이다.

            System.out.printf("%d + %d(random) = %d(total1)\n", i, random, total1);
            i = total1; //total1의 값을 구한 후, i의 수를 total1로 바꿔준다.

            sum = sum + i; //매회 루프마다 sum의 값에 +i를 해준다.
        }

        System.out.println("total1을 모두 더한 값 = " + sum);

    }
}
