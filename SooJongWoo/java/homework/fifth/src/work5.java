public class work5 {
    public static void main(String[] args) {
        int i, random;
        int sum = 0;

        // 반 학생의 수를 30으로 지정
        for(i = 1; i <= 30; i++) {
            // 난수로 60 부터 100까지의 숫자를 30번 반복
            random = (int)(Math.random() * 41 + 60);
            // 30번 반복하여 나온 난수를 합치기
            sum += random;
        }
        // 난수를 합친 값을 반 학생의 수로 나누기
        int average = sum / 30;
        System.out.println(average);

    }
}

/* 1. 평균을 구합니다
   2. 각 자료마다 평균으로부터 떨어진 거리를 제곱한 값을 구합니다.
   3. 2.에서 나온값을 모두 더합니다.
   4. 위에서 얻은 값을 자료점의 개수로 나눕니다.
   5. 제곱근을 구합니다.
 */

// 위와 같이 제곱근을 구하는 공식을 찾아봤는데 평균값을 구하고 나서부터 막혔습니다.
// 30명의 시험점수를 랜덤으로 돌렸던것이 문제였을까요??

// 5번까지 오는데 시간을 너무 많이 잡아먹어 다음문제 부터 풀지 못했는데 따로 풀이하고
// 복습하여 공부하겠습니다!

// 맥 pdf사용을 어떻게 해야될지 몰라서 방법을 찾는중인데 찾는데로 pdf로 질문 작성하겠습니다
