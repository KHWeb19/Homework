public class QnA {
    public static void main(String[] args) {

        float sum =0;
        float sum2 = 0;
        for(int i = 0 ; i < 2000; i++){

            sum += 0.001;
            System.out.println(sum);
        }

        //애는 제대로 나옴
        for(int i = 0 ; i < 2000; i++){

            sum2 += 1;

            System.out.println(sum2);
        }

    }
}
