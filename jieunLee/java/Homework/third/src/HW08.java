public class HW08 {
    public static void main(String[] args) {
        System.out.println("1~100까지 숫자를 순회한다.\n2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.\n");
        int rand = (int)(Math.random()*9+2);
        for (int i=1; i<=100; i++) {
            if (i % rand == 0) {
                System.out.println(i);
            }
        }
    }
}
