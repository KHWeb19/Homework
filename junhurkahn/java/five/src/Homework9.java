public class Homework9 {
    public static void main(String[] args) {
        // 증감연산 4에서 25까지 지정
        final int MAX = 25;
        final int START = 3;
        // MAX 배열 지정
        int[] seq = new int[MAX];
        //seq 배열 0 1 2 정수 지정
        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 1;

        // for증감식 으로 3~24까지 증감
        for (int i = START; i < MAX; i++) {
            // 배열 계산 해서 첫번쨰 배열과 세번쨰 배열 더해주록 계산
            seq[i] = seq[i - 3] + seq[i - 1];
            // i 식과 첫번쨰 배열과 세번쨰 배열 더해주는것 출력
            System.out.printf("seq[%d] = %d\n", i + 1, seq[i]);
        }
    }
}

// 컴퓨터에서 배열의 시작이 0이기 때문에
// 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
// 그래서 START 2는 결국 3번째
     /*   for (i = START; i < END; i++) {
        result = first + third;
        first = second;
        second = third;
        third = result;

        // 전체 뿌리기
        System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.ot.printf("%d번째 항 %d\n", i, result);
        }
        }*/