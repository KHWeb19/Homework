public class Homework06 {
    public static void main(String[] args) {
        // 1 ~ 100까지 숫자중 3의 배수만 출력해보자!
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
