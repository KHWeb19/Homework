public class Homework2 {
    public static void main(String[] args) {

        // 피보나치 수열의 20번째 항을 구하도록 프로그램

        int prepre = 1;
        int pre = 1;

        for(int i = 3; i <= 20; i++) {

            int sum = prepre + pre;

            prepre = pre;
            pre = sum;

            if (i==20){

            System.out.println("피보나치 수열의 20번째 항 : " + sum);

            }

        }
    }
}


