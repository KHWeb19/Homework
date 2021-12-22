public class eight {
    public static void main(String[] args) {
        int dice = (int)(Math.random()*6+1);
        if (dice%2!=0) {
            System.out.println("손모가지를 내놔라");
        }
    }

}
