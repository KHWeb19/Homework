public class Hw5 {
    public static void main(String[] args) {
        //4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //힌트: Math.sqrt() - 루트 계산

        //분산은 각 점수에서 평균값을 빼고 나온 값을 제곱한다.
        //이렇게 나온 제곱을 각각 더해주고 학생수를 n 이라고 한다면 n-1로 나누어 주면 된다.

        //그렇다면 표준 편차는 분산 값에 루트를 씌워주면 된다.
        final int START = 1;
        final int END = 30;

        final int MAX = 100; //100점이 최고점이 되므로
        final int MIN = 60;  //60점이 최저점이 되므로 설정
        int range = MAX - MIN +1;
        int sum = 0; //총합을 0으로 초기화
        int avg = 0;
        double variance = 0; //소수점을 나타내기 위해...int형 대신 double형으로..

        int[] sequence; //배열 함수를 선언

        sequence = new int[END];

        for(int i = START-1; i < END; i++){
            //배열은 0부터 시작하므로 START 값에서 1을 빼준다.
            //배열0번지에서 29번지까지 1씩 증가시키며 랜덤값을 형성
            int rand = (int)(Math.random() * range + MIN);
            sequence[i] = rand;  //각 번지에 랜덤값을 할당
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
            sum += sequence[i];  //각 번지들의 합
            avg = sum / END;  //평균값 구하기
        }

        //분산 구하기...
        for(int i = START-1; i < END; i++){
            int square = (sequence[i] - avg) * (sequence[i] - avg) ;  //제곱
            int ss = square + square; //제곱의 합
            variance = ss / (END-1);  //제곱의 합을 학생수-1로 나누어줌
        }
        System.out.println("학생들의 점수들의 총합: "+ sum);
        System.out.printf("학급의 평균: %d\n ",avg);
        System.out.printf("학급의 분산: %.1f\n", variance);  // 분산과 평균은 소수점 한 자리수까지 하였다.
        System.out.printf("학급의 표준편차:  %.1f\n ", Math.sqrt(variance));
        //int dispersion = sequence[i] - avg;  //학생들의 각각의 점수를 어떻게 가져오지...
        //분산이 for 문 안으로 들어가면 평균값 구하기 전이라 평균을 빼줄 수 없을텐데...
        //for문을 각각 쓰면 되는구나...
    }
}


