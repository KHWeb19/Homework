public class HW11 {

    public static void main(String[] args) {


        int min = 65;
        int max = 122;
        int range = max - min + 1;
        int ran1 = (int) (Math.random() * (range)) + min;


        if ( ((ran1>=65)&&(ran1<=90)) || ((ran1>=97)&&(ran1<=122)) )

            System.out.println(ran1);

    }
}
