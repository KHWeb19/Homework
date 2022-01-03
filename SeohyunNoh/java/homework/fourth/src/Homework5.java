public class Homework5 {
    public static void main(String[] args) {
        //4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //힌트: Math.sqrt() - 루트 계산

        // 이해가 확실하게 되진않아서
        // 다시 한 번 코드 이해를 하고 풀어보기

        int sum = 0; // 합계
        double avg = 0; // 평균
        double dev = 0; // 편차
        double devSquareSum = 0; // 편차제곱합
        double var = 0; // 분산
        double std = 0; // 표준편차

        int[] score = {70, 85, 90, 100, 62};

        for(int i = 0; i < score.length; i++){
            // 총합 계산하기
            sum += score[i];
        }
        // 평균 계산 완료
        avg = sum / score.length;

        for(int i = 0; i < score.length; i++){
            // 편차 계산
            dev = (score[i] - avg);
            // 편차제곱합 누산하기
            devSquareSum += Math.pow(dev, 2);
        }

        // 분산 계산
        var = devSquareSum / score.length;
        // 표준편차 계산
        std = Math.sqrt(var);

        System.out.println("분산 : " + var);
        System.out.println("표준편차 : " + std);


    }
}
