public class Homework3 {
    public static void main(String[] args) {

        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        // 이와 같은 숫자의 규칙을 찾아 25번째 항

        int preprepre = 1;
        int prepre = 1;
        int pre = 1;


        for(int i = 4; i < 100; i++){

            int sum = preprepre + pre;

            preprepre = prepre;
            prepre = pre;
            pre = sum;

            if(i == 25){

                System.out.println("해당 규칙배열의 25항 : " + sum);

            }

        }

    }
}
