public class P08 {
    public static void main(String[] args) {

        int dice = (int)(Math.random()*6+1);
        System.out.printf("주사위값 = %d\n", dice);

        if(dice % 2 == 1){
            System.out.println( "손모가지를 내놔라");
        }
    }
}
