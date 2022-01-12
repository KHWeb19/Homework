public class Score {

    final int MEMBER = 30;
    final int MAX = 100;
    final int MIN = 60;

    int rand;
    int range;

    int[] arr = new int[MEMBER];
    float num = 0, result = 0;

    public void init_score(){
        range = MAX - MIN +1;
    }

    public void scoreRandom(){
        for(int i =0; i <MEMBER; i++) {
            rand = (int) (Math.random() * range + MIN);
            arr[i] = rand;
        }
    }


    public float avgScore(){
        for(int i =0; i< MEMBER; i++){
            num += arr[i];
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }

        result = num/MEMBER;
        return result;
    }

    public float disScore(){
        for(int i=0; i< MEMBER; i++){
            num += Math.pow(arr[i] - result,2);
        }
        result = num/MEMBER;
        return result;
    }

    double result1;
    public double devScore(){
        result1 = Math.sqrt(num/MEMBER);
        return result1;
    }
}
