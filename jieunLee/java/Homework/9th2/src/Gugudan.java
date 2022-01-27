public class Gugudan {
    public void initGugudan(int dan) {
        final int MIN = 1;
        final int MAX = 10;
        for (int i=MIN; i<MAX; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }
    }
}
