public class RandomNumber {
    //4 ~ 97까지의 랜덤 숫자를 생성해보세요.
    //65 ~ 90까지의 난수와 97 ~ 122까지의 난수를 무작위로 생성해봅시다.
    int NUM_MIN , NUM_MAX;
    int NUM_MIN1 , NUM_MAX1;
    int NUM_MIN2, NUM_MAX2;
    final int TWO = 2;



    int tmp;
    int ran;
    int range ,range1, range2, range3;
    boolean numberCheck = true;

    public RandomNumber(int NUM_MIN , int NUM_MAX){
        this.NUM_MIN = NUM_MIN;
        this.NUM_MAX = NUM_MAX;

        range = NUM_MAX - NUM_MIN + 1;
    }


    public RandomNumber(
            int NUM_MIN1, int NUM_MAX1, int NUM_MIN2, int NUM_MAX2){
        this.NUM_MIN1 = NUM_MIN1;
        this.NUM_MAX1 = NUM_MAX1;
        this.NUM_MIN2 = NUM_MIN2;
        this.NUM_MAX2 = NUM_MAX2;

        range1 = NUM_MAX1 - NUM_MIN1 + 1;
        range2 = NUM_MAX2 - NUM_MIN2 + 1;
        range3 = NUM_MAX2 - NUM_MIN1 + 1;

    }



    public int numberGenerate(){
        return (int)(Math.random() * range + NUM_MIN);
    }


    public int numberGenerate2(){
        return (int)(Math.random() * range1 + NUM_MIN1);
    }
    public int numberGenerate3(){
        return (int)(Math.random() * range2 + NUM_MIN2);
    }
    public int numberGenerate4(){
        return (int)(Math.random() * range3 + NUM_MIN1);
    }


    public void randomNum(){
        ran = (int)(Math.random() * TWO);

        if(ran == 0){
            System.out.println(numberGenerate2());
        }else{
            System.out.println(numberGenerate3());
        }

    }




    public void numberGenerate5() {
        while (numberCheck) {
            tmp = numberGenerate4();
            if (tmp > NUM_MAX && tmp < NUM_MIN2) {
                System.out.println("문자가 아닙니다");
            } else {
                System.out.printf("%c(%d)" , tmp, tmp);

                numberCheck = false;

            }

        }


    }

}
