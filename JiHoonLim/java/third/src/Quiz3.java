public class Quiz3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int l = 1;
        int sum ;
        int k;

        System.out.println("1항은 " +i);
        System.out.println("2항은 " +j);
        System.out.println("3항은 " +l);

        for (k=4; k<=25; k++) {
            sum = i+l;
            System.out.println(k+ "항은 " + sum);
            i = j;
            j = l;
            l = sum;

        }
    }
}
