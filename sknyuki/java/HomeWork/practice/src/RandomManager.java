import java.util.Arrays;

public class RandomManager {
   private int number1;
   randomprint rand=new randomprint();
   int [] array;
    public RandomManager (int number1){
        this.number1=number1;
       array=new int[number1];
        for(int i=0; i<number1; i++){
            array[i]= rand.randomprintNum();
           System.out.printf("%d번쩨 랜덤번호:%d\n",i+1,array[i]);
        }
    }

    @Override
    public String toString() {
        return "RandomManager{" +
                "number1=" + number1 +
                ", rand=" + rand +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
