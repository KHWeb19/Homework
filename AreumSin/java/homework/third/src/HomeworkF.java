public class HomeworkF {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 3의 배수만 출력해보자!
        int res = 0;

        for(int i =1; i<101;  i++) {
            if (i % 3 == 0) {
                System.out.println("3의 배수: " + i);
                res += i;
            }
        }

    }
}
