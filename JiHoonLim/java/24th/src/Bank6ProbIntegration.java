public class Bank6ProbIntegration {
    public static void main(String[] args) throws InterruptedException {

        // 쓰레드의 갯수, x값, y값, 4각형의 작업 번호 를 넘긴다
        ThreadManager tm1 = new ThreadManager(6, 2, 2, ThreadCalculation.SQUARE);
        // 출력에서 쓰레드 매니저의  calcArea 실행
        System.out.println("계산된 값 = " + tm1.calcArea());


        ThreadManager tm2 = new ThreadManager(4, 0, 3, ThreadCalculation.QUADRATIC);
        System.out.println("계산된 값 = " + tm2.calcArea());
    }
}
