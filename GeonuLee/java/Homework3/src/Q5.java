public class Q5 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 61;
        final int NUM = 30;
        int ADD = 0;

        int Class[] = new int[NUM];
        int Range = MAX-MIN+1;

        for(int i=0; i<NUM; i++){
            Class[i] = (int)(Math.random()*Range+MIN);;
            System.out.println(Class[i]);
            ADD += Class[i];
        }
        System.out.printf("평균 점수는:%d",ADD/NUM);
    }
}
