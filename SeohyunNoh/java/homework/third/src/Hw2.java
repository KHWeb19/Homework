public class Hw2 {
    public static void main(String[] args) {
        // 피보나치 수열의 20번째 항 구하기

        int prePrevious = 1;
        int previous = 1;
        //int current = previous + prePrevious;
        int current;

        System.out.println("1번째 항 : " + prePrevious);
        System.out.println("2번째 항 : " + previous);

        for(int i=3 ; i < 21 ; i++){
            current = previous + prePrevious;
            System.out.println( i + "번째 항 : " + current);
            prePrevious = previous;
            previous = current;

        }

    }
}
