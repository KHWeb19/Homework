public class P08 {
    public static void main(String[] args) {

        int i = 0;
        int randNum;
        int minSelNum = 2;
        int maxSelNum = 10;
        int Range = maxSelNum - minSelNum + 1;
        randNum = (int) (Math.random() * Range + minSelNum);
        System.out.printf("선택된 숫자 : %d\n",randNum);

        while(i++<101){

            if(i%randNum==0){
                System.out.printf("%d의 배수 = %d\n",randNum,i);
            }
        }
    }
}
