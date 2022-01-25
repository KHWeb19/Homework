package hw2;

//public class Hw2 {
//    public static int test;
//    private int number;
//    public Hw2 (int number) {
//        this.number = number;
//        while (true){
//            number++;
//            number = test;
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static int getTest() {
//        return test;
//    }
//}

public class Hw2 {
    static int test;
    public Hw2(int test) {
        this.test = test;
        for (; test< 30; test++) {
            System.out.println(test);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static int getTest() {
        return test;
    }
    //    @Override
//    public void run() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
