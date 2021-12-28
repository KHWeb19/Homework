public class Hw4 {
    public static void main(String[] args) {
        //반 학생이 30명이 있다.
        //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //이 상태에서 학생들의 점수를 임의로 배치하고
        //학급의 평균값을 구해보도록 한다.

        //반 학생이 30명이 있으니깐 배열을 0 ~ 29까지 이용하고
        //모든 학생들이 60점 미만이 없다고 했으니 점수를 60점 ~ 100점 사이로 랜덤 함수를 사용해서 만들고
        //나온 점수를 다 더해 30으로 나눠주면 되겠군...
        //잠깐...배열 선언을 30개 다 해줘야하나...
        //for 문 이용해서 0 ~ 29 까지 반복하며 랜덤값을 넣어주면 되겠구나..
        //이 후 각 배열값들의 합을 구해 학생 수만큼 나누어주면 평균값이 나오겠네..

        final int START = 1;
        final int END = 30;

        final int MAX = 100; //100점이 최고점이 되므로
        final int MIN = 60;  //60점이 최저점이 되므로 설정
        int range = MAX - MIN +1;
        int sum = 0; //총합을 0으로 초기화

        int[] sequence; //배열 함수를 선언

        sequence = new int[END];

        for(int i = START-1; i < END; i++){
            //배열은 0부터 시작하므로 START 값에서 1을 빼준다.
            //배열0번지에서 29번지까지 1씩 증가시키며 랜덤값을 형성
            int rand = (int)(Math.random() * range + MIN);
            sequence[i] = rand;  //각 번지에 랜덤값을 할당
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
            sum += sequence[i];  //각 번지들의 합
        }
        System.out.println("학생들의 점수들의 총합: "+ sum);
        int avg = sum / END;  //평균값 구하기
        System.out.println("학급의 평균: "+ avg);
    }
}
