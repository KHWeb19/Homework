public class RandomPrint {
    int MIN1 , MAX1 ;
    int MIN2 , MAX2 ;

    int range1, range2 ;

    int rand1, rand2 ;

    public RandomPrint(int MIN1, int MAX1, int MIN2, int MAX2) {
        this.MIN1 = MIN1;
        this.MAX1 = MAX1;
        this.MIN2 = MIN2;
        this.MAX2 = MAX2;

        FilterAndSet();
    }

    public void FilterAndSet() {
        if (MIN1 == 0 && MAX1 == 0){
            range2 = MAX2 - MIN2 + 1;
            CreateRandom2();

        } else if (MIN2 == 0 && MAX2 == 0){
            range1 = MAX1 - MIN1 + 1;
            CreateRandom1();

        } else {
            range1 = MAX1 - MIN1 + 1;
            range2 = MAX2 - MIN2 + 1;
            CreateRandomAll();

        }
    }
    public void CreateRandomAll() {
        rand1 = (int)(Math.random() * range1 + MIN1);
        rand2 = (int)(Math.random() * range2 + MIN2);

        System.out.printf("%d ~ %d 사이의 랜덤숫자 %d \n", MIN1,MAX1, rand1);
        System.out.printf("%d ~ %d 사이의 랜덤숫자 %d \n", MIN2,MAX2, rand2);
    }

    public void CreateRandom1() {
        rand1 = (int)(Math.random() * range1 + MIN1);
        System.out.printf("%d ~ %d 사이의 랜덤숫자 %d \n", MIN1,MAX1, rand1);
    }

    public void CreateRandom2() {
        rand2 = (int)(Math.random() * range2 + MIN2);
        System.out.printf("%d ~ %d 사이의 랜덤숫자 %d \n", MIN2,MAX2, rand2);
    }
}
