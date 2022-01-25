public class Bank6_2 {

    public static void main(String[] args) throws InterruptedException {


        Area2 area2 = new Area2();
        Thread t3 = new Thread(new AreaThread2(3,0.001));


        t3.start();
        t3.join();



       /*   AddArea  ver

        Thread t4 =new Thread(new AddArea(3,0.001));

        //이렇게 스레드 안에 클래스를 넣어야 들어감!

        t4.start();
        t4.join();
        }     */
    }
}
