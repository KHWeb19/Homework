public class Bank6ProbIntegration {
    public static void main(String[] args) throws InterruptedException {

        //ThreadManager를 tm1로 객체화한다. (매개변수로 Rectangle Thread를 출력할 수 있게 해줌)
        //realTotal = 2000 부터 sum = 0.nnnnnnnn 까지 모두 객체화된 스레드 매니저를 통해 출력한다.
        ThreadManager tm1 = new ThreadManager(6, 2, 2, ThreadCalculation.SQUARE);
                                                                     //ThreadCalculation의 전역변수 SQUARE의 값을
                                                                     //                          입력하겠다는 뜻.
        System.out.println("계산된 값 = " + tm1.calcArea());

       // ThreadManager tm2 = new ThreadManager(4, 0, 3, ThreadCalculation.QUADRATIC);
       // System.out.println("계산된 값 = " + tm2.calcArea());
    }
}
