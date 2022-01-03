public class work4 {
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
