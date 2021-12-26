public class Hw7 {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6 +1);

        if(dice % 2 ==0){
            System.out.println("당첩입니다!" + dice);
        }
    }
}
