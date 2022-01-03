public class Quiz2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sum;


        System.out.println("1항은 " +j);

        for (int k=2; k<=20; k++) {
            sum = i+j;
            System.out.println(k+ "항은 " + sum);
            i = j;
            j = sum;
        }
    }
}
