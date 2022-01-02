public class One {
    final int START = 0;
    final int END = 100;

    final int MAX = 10;
    final int MIN = 2;

    int sum = 0;
    int range, rand;

    public void init_Hun(){
        range = MAX - MIN +1;
        rand = (int)(Math.random()*range + MIN);
    }

    public void multiBy2(){
        for(int i = START; i < END; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void multiBy3(){
        for(int i =START; i < END; i++){
            if( i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public void multiBy4(){
        for(int i =START; i < END; i++){
            if( i%4 == 0){
                //System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void printMulti(){
        System.out.println(rand+"의 배수");
        for(int i = START; i < END; i++){
            if(i % rand == 0){
                System.out.println(i);
            }
        }
    }


}
