public class Ans1MainClass {
    public static void main(String[] args)  {
        Thread t = new Thread(new Ans1DivideAndSum(2,6));

        t.start();
        //2*6, 3*2 등 도출 문제없음

    }
}
