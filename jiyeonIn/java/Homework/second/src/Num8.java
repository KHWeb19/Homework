public class Num8 {
    public static void main(String[] args) {
        //8.주사위 굴려서 홀수일 경우 손모가지를 내놔라

        int num = (int) (Math.random()*6+1);
        if(num%2==1){
            System.out.println("손모가지를 내놔라");
        }
    }
}
