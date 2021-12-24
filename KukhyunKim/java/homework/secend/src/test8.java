public class test8 {
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6 + 1);
        if (dice %2 == 1) {System.out.println("손모가지 내놔! :" + dice);}
        /*

        if (dice % 2 == 1) {
            System.out.println(dice + " : 손모가지 내놔!");

         */
    }
}
