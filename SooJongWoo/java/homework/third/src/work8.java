public class work8 {
    public static void main(String[] args) {
        // 1~100까지의 숫자를 순회한다
        // 2~10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다
        int rand = (int) (Math.random() * 9 + 2);

        int num =1;
        while (num++ <100) {

            if (num % rand == 0) {
                System.out.printf("i는 " + rand + "배수 = %d\n" , num);
            }
        }
    }
}
