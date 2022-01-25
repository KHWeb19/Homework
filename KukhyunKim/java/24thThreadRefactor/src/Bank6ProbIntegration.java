public class Bank6ProbIntegration {
    public static void main(String[] args) throws InterruptedException {

        ThreadManager tm1 = new ThreadManager(6, 2, 2, ThreadCalculation.SQUARE);
        System.out.println("계산된 값 = " + tm1.calcArea());
        // tm1 = 스레드매니저 class 에 6,2,2,ThreadCalculation.SQUARE(0) 넣어서 계산해라

        ThreadManager tm2 = new ThreadManager(4, 0, 3, ThreadCalculation.QUADRATIC);
        System.out.println("계산된 값 = " + tm2.calcArea());
        // tm2 = 스레드매니저 class 에 4,0,3, ThreadCalculation.QUADRATIC(1) 넣어서 계산해라
    }
}