public class Homework05 {
    public static void main(String[] args) {

        // 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //   힌트: Math.sqrt() - 루트 계산

        // 표준편차 구하는 방법
        // 1. 평균을 구한다
        // 2. 각 인덱스의 값이 평균으로 부터 떨어진 값의 제곱을 구한다.
        // 3. 2단계의 값을 모두 더한다
        // 4. 얻은 값을 총 학생 수로 나눈다.  ---> 여기까지가 분산
        // 5. 루트를 씌운다


        final int STUDENTS = 30;

        final int MIN = 60;
        final int MAX = 100;
        int range = MAX - MIN + 1;

        int sum = 0;
        int sum2 = 0;

        int [] score = new int [STUDENTS];


        // 먼져 임의로 배치된 배열의 평균값을 구하기 위해 모든 배열의 합을 더한다

        for(int i = 0; i < STUDENTS; i++) {

            int rand = (int) (Math.random() * range + MIN);

            score[i] = rand;

            System.out.printf("학생 %d의 성적 : %d\n", i + 1, score[i]);

            sum += score[i];

        }

        System.out.println("학생들의 평균 = " + sum/STUDENTS);

        // 구해진 평균값으로 편차를 구하고 모두 더한다

        for (int i = 0; i < STUDENTS; i++){


            int average = sum/STUDENTS;
            int squ = (average - score[i]) * (average - score[i]);

            sum2 += squ;

            }

        // 위의 결과값 sum2로 분산과 표준편차를 구한다

        int disp = sum2/STUDENTS;

        System.out.println("학생들의 분산 = " + disp);
        System.out.println("학생들의 표준편차 = "+ Math.sqrt(disp));

        }

    }

