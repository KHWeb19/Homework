public class Num7 {
    public static void main(String[] args) {
        //7.주사위 굴려서 짝수일 경우 당첨 출력

        int num = (int) (Math.random()*6+1);
        for(int i=1;i<num;i++){
            if(num%2==0){
                System.out.println("당첨입니다!");
                break;
            }else{
                continue;
            }
        }

    }
}
