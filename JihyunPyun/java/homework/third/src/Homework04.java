public class Homework04 {
    public static void main(String[] args) {
        // 구구단 7단을 출력해보자!
        for (int i = 1; i <= 7; i++){
            System.out.println("======");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }
    }
}
