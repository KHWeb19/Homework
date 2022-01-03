public class work9 {
    public static void main(String[] args) {

        // 1~100까지의 숫자를 순회한다
        // 2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다
        // 다음 루프에서 다시 랜던 숫자를 선택하고 해당 숫자의 배수를 출력한다
        // 그 다음 루프에서 다시 작업을 반복한다
        // 끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?
        int rand = (int) (Math.random() * 9 + 2);

        int num = 0;
        int sum = 0;

        while (num++ <100) {
            if (num % rand == 0) {
                sum += rand * num;
            }
        }
        System.out.println("전체 합 : " + sum);
    }
}