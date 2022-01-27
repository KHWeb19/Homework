public class Third {
    public static void main(String[] args) {
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);

        System.out.println(dice1+dice2);

        if((dice1+dice2)%2==0){
            System.out.println("당첨입니다!!");
        }else{
            System.out.println("손모가지를 내놔라!");
        }
    }
}
