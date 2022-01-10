public class RandomGenerator {
    //난수 (4~97),난수 (65~90or 97~122),65~122사이중에 난수(65~90or 97~122)
    int intMax, intMin, intRange;
    int intMax2, intMin2, intRange2;

    int condMin, condMax, condRange;
    int condMin2, condMax2, condRange2;

    final int CHECK_NUM = 100000;//실행횟수
    final int TWO = 2;


    public RandomGenerator(final int intMin, final int intMax) {

        this.intMax = intMax;
        this.intMin = intMin;
        intRange = intMax - intMin + 1;

    }

    public RandomGenerator(final int intMin, final int intMax, final int intMin2, final int intMax2) {

        this.intMax = intMax;
        this.intMin = intMin;
        intRange = intMax - intMin + 1;

        this.intMax2 = intMax2;
        this.intMin2 = intMin2;
        intRange2 = intMax - intMin + 1;
    }
    public RandomGenerator (
            final int intMin, final int intMax,
            final int condMin, final int condMax,
            final int condMin2, final int condMax2) {

        this.intMin = intMin;
        this.intMax = intMax;

        intRange = intMax - intMin + 1;

        this.condMin = condMin;
        this.condMax = condMax;

        condRange = condMax - condMin + 1;

        this.condMin2 = condMin2;
        this.condMax2 = condMax2;

        condRange2 = condMax - condMin + 1;
    }


    public int intGenerate() {
        return (int) (Math.random() * intRange + intMin);
    }

    public int intGenerate2() {
        return (int) (Math.random() * intRange2 + intMin2);
    }


        public boolean confirmRandom () {
            int tmp;

            for (int i = 0; i < CHECK_NUM; i++) {
                tmp = intGenerate();

                if (tmp < intMin || tmp > intMax) {
                    return false;
                }
            }

            return true;
        }

    public int percent50 () {
            return (int) (Math.random() * TWO);
    }

    public int complicatedRandom () {
            if (percent50() == 0) {
                return intGenerate();
            } else {
                return intGenerate2();
            }
    }


    public boolean isRandomNotOk (int rand) {

            if (((rand >= condMin) && (rand <= condMax)) ||
                    ((rand >= condMin2) && (rand <= condMax2))) {
                return false; //이 조건에 만족하면 문제가 없다는 것이라 false를 줘서 루프를 빠져나가게 함
            }
            return true;
    }

    public int conditionRandom () {
            int rand, cnt = 0;

            do {//문제가 발생하면 do 여기로 들어와서 재할당을 한다
                System.out.printf("%d 번째\n", ++cnt);
                rand = intGenerate();
            } while (isRandomNotOk(rand));

            return rand;

    }

    public boolean confirmComplicatedRandom () {

            int tmp, tmp2;

            for (int i = 0; i < CHECK_NUM; i++) {
                tmp = intGenerate();

                if (tmp < intMin || tmp > intMax) {
                    return false;
                }

                tmp2 = intGenerate2();

                if (tmp2 < intMin2 || tmp2 > intMax2) {
                    return false;//그게 아니라 잘못생성되면 false를 리턴
                }
            }

            return true;//for문을 도는 동안 범주안에 잘 들어가면 하면 for문이 끝나고 true를 리턴
        }


        }










