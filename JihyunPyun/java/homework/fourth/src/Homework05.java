public class Homework05 {
    public static void main(String[] args) {
//      학생 30명 점수의 표준편차와 분산 구하기!

//       HOW TO..
//       1. 배열값 소환시켜서 표준편차 구하기
//         + 제곱 구할때 Math.pow()활용.....
//       2. 표준편차 구한걸로 분산 구하기

        final int ARRMAX = 30;

        int[] student = new int[ARRMAX];

        final int MAX = 100, MIN = 60;
        int range = MAX - MIN + 1;
        int sum =  0;
        double devSum = 0; // 편차 제곱의 합

        for(int i = 0; i < student.length; i++){
            int random = (int)(Math.random() * range + MIN);
            student [i] = random;
            sum += random;
        }
        int avg = sum / student.length;


        for (int j : student) {
            double dev = (j - avg); // 편차 계산
            devSum += Math.pow(dev, 2); // 편차 제곱의 합 구하기
        }
        double var = devSum / student.length; // 분산 계산
        double stdDev = Math.sqrt(var); // 표준편차 계산

        System.out.printf("분산 : %f, 표준편차 : %f", var, stdDev);

    }
}
