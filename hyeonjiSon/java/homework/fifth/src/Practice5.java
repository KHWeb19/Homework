public class Practice5 {
    public static void main(String[] args) {
        //문제4.  4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //   힌트: Math.sqrt() - 루트 계산

        final int START = 1;
        final int END = 30;

        int[] student = new int[END];

        final int MIN = 60;
        final int MAX = 100;
        int range = MAX - MIN + 1;

        boolean check = false;
        int sum = 0; //우선 sum 메모리에 들어가는 숫자를 0으로 설정한다.

        for(int i = 0; i < END; i++){

            int random = (int)(Math.random() *range + MIN);

            while(!check){

                check = true;
            }

            student[i] = random;
            System.out.printf("학생번호[%d] = 시험점수 %d\n", i, random);

            // 평균1_3. 반복마다 매회 random() 결과로 나온 숫자를 int score에 남긴다.
            // 평균1_4. sum += score로 반복마다 점수의 합을 기록한다.
            int score = random;
            sum += score;
        }

        // 평균2. sum을 학생수(30)로 나누어주어 평균값을 출력한다.
        System.out.printf("우리반 학생 %d 명의 점수의 평균 = %d", END, sum/END);

        //분산: 주어진 자료의 숫자가 평균을 기준으로 어떻게 흩어져 있는지 나타내는 지표이다.
          //분산1.30개의 score마다 평균값(sum/END) 빼기 <-아래는 할 수 있을 것 같은데 분산1.을 할 방법을 궁리하는 게 너무 어렵다.
                 // sum/END로 구한 평균값 자체가 지금 반복문 밖에 있으니... for~평균 까지를 while안에 넣고 무한반복으로 돌려줘야하나.
                 // 무한반복으로 돌아가면서 아직 사라지지 않은 score값 - 평균값 = 변수 을 해주고...
          //분산2.평균값을 빼고 나온 값을 제곱하기 //제곱하기는 practice1을 활용하면 될텐데...
                 //score값 - 평균값 = 변수 <이 변수를 바로 제곱해주고 그 값을 기록해서 더해줄 수 있게 해야겠네.
          //분산3.모든 값을 더하기
          //분산4.제곱의 합을 (학생수-1)로 나누기 = 분산


        //표준편차: 주어진 자료의 숫자가 평균을 기준으로 어떻게 흩어져 있는지 나타내는 지표이다.
          //표준편차1. 분산 값에 루트를 씌워 제곱근을 구하면 표준편차가 나온다.
          //          제곱근이란? 어떤 수 x를 제곱한 수가 a 인 , x가 a의 제곱근이다.

    }
}
