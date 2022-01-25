public class RandomChar {
    int MIN1 , MAX1 ;

    int range1 ;

    int rand1;
    boolean isRight =true;

    public RandomChar(int MIN1, int MAX1) {
        this.MIN1 = MIN1;
        this.MAX1 = MAX1;

        FilterAndSet();
    }

    public void FilterAndSet() {
        range1 = MAX1 - MIN1 + 1;

        while (isRight) {
            rand1 = (int)(Math.random() * range1 + MIN1);

            if (rand1 > 90 && rand1 < 97) {
                System.out.println("재생성");
            } else {
                isRight = false;
            }
        }
        PrintChar();
    }
    public void PrintChar() {
        System.out.printf("%d ~ %d 사이의 랜덤숫자[문자] %d[%c] \n", MIN1,MAX1, rand1,rand1);
    }
}
