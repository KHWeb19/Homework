public class Hundred {
    final int START = 1;
    final int END = 100;

    final int MAX = 10;
    final int MIN = 2;

    boolean isCheck = true;
    int rand, range, i;

    public void init_OH(){
        range = MAX - MIN +1;

        for(i = START; i < END; i++){
            while (isCheck){
                rand = (int)(Math.random() *range +MIN);
                isCheck = false;
            }
            print_OH();
        }
    }

    int sum = 0;
    public int print_OH(){

        if(i % rand == 0){
            System.out.printf("%d 배수 합 %d\n",rand, i);
            isCheck = true;
            sum += i;
            //init_OH();
        }

        //System.out.println("다 더한 수: "+sum);
        return sum;
    }

}
