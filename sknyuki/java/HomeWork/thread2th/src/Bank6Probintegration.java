public class Bank6Probintegration {
    public static void main(String[] args) throws InterruptedException {

        ThreadManager tm1 = new ThreadManager(6, 2, 2, ThreadCalculation.SQUARE);
        System.out.println("계산된 값 = " + tm1.calcArea());

        ThreadManager tm2 = new ThreadManager(4, 0, 3, ThreadCalculation.QUADRATIC);
        System.out.println("계산된 값 = " + tm2.calcArea());
    }
}