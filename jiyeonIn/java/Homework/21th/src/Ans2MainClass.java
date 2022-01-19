public class Ans2MainClass {
    public static void main(String[] args) {
//        Thread t = new Thread(new SquaredAndSum(4));
//        t.start();
        //thread.sleep만으로 만든것


        Thread t1 = new Thread(new SquaredAndSum2((3)));
        t1.start();
        //thread.sleep & lock이용해서 만든 것
    }
}
