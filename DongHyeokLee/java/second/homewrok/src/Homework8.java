public class Homework8 {
    public static void main(String[] args) {
        
        int dice = (int)(Math.random()*5+1);

        System.out.println("dice = " + dice);
        
        if(dice%2 != 0){
            System.out.println("손모가지를 내놔라");
        }
    }
}
