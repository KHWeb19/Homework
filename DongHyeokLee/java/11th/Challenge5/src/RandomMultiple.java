public class RandomMultiple {
    //  9. 1 ~ 100까지의 숫자를 순회한다.
    //  2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
    //  다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
    //  그 다음 루프에서 다시 작업을 반복한다.
    //  끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

    final int RANGE_MAX = 10;
    final int RANGE_MIN = 2;

    final int START = 1;
    final int END = 100;

    int range = RANGE_MAX - RANGE_MIN + 1;
    int ranNum = 0;
    int i = 0;

    boolean checkMultiple = true;

    public void multipleGenerate() {

                        for (i = START; i < END; i++) {
                            while(checkMultiple) {
                                ranNum = (int) (Math.random() * range + RANGE_MIN);
                                checkMultiple = false;
                            }
                            if (i % ranNum == 0) {
                                System.out.println("랜덤숫자 = " + ranNum + "배수 =  " + i);
                                    checkMultiple = true;

                }
            }
        }
    }

