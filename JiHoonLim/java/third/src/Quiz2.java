public class Quiz2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sum ;
        int k;

        sum = 0;

        System.out.println("1항은 " +j);

        for (k=2; k<=20; k++) {
            sum = i+j;
            System.out.println(k+ "항은 " + sum);
            i = j;
            j = sum;
            sum = i + j;
        }
    }
}
