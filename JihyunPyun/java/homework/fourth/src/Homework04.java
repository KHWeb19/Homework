public class Homework04 {
    public static void main(String[] args) {
//        반 학생이 30명이 있다.
//        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
//        이 상태에서 학생들의 점수를 임의로 배치하고
//        학급의 평균값을 구해보도록 한다.
//
//        1. 30명 배열 생성
//        2. 임의값 배열에 넣기
//        3. 배열 평균값 구하기

        int[] student = new int[20]; // 학생 수 만큼 배열 생성

        final int MAX = 100, MIN = 60;
        int range = MAX - MIN + 1;
        int sum =  0; // 총점

        for(int i = 0; i < student.length; i++){
            int random = (int)(Math.random() * range + MIN);
            student [i] = random;  // 랜덤값 배열에 넣기
            sum += random; //총점 계산
        }

        int avg = sum / student.length;//평균값 계산
        System.out.printf("평균 점수 : %d", avg);
    }
}
