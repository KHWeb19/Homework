public class P7 {
    public static void main(String[] args) {

        int dice = (int)(Math.random()*6+1);
        System.out.printf("주사위값 = %d\n", dice);

        if(dice % 2 == 0){
            System.out.println( "당첨입니다!");
        }
    }
}
