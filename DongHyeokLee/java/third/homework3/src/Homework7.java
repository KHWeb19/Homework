public class Homework7 {
    public static void main(String[] args) {
        //1~ 100까지 숫자중 4의 배수의 합

        int sum = 0;

        for(int i = 1 ; i <= 100; i++){

            if(i % 4 == 0) {
                sum += i;


            }
           // System.out.println("4의 배수의 합 = " + sum); //위치가 여기가 아니었다 주의하자
        }
        System.out.println("4의 배수의 합 = " + sum);

    }
}




