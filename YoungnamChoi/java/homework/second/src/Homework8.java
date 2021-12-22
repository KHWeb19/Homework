public class Homework8 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1);
        System.out.println(dice1);

        if(dice1 % 2== 1){
            System.out.println("손모가지를 내놔라.") ;
        }
    }
}
