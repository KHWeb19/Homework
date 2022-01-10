import java.util.Random;

public class RandomGenerator {
    int intMax, intMin, intRange;      // 4~97까지의 변수 선언, 65~90까지의 난수와 97~122까지의 난수생성용
    int intMax2, intMin2, intRange2;   // 65~90까지의 난수와 97~122까지의 난수생성용

    final int CHECK_NUM = 100000;
    final int TWO = 2;

    int condMin, condMax, condRange;
    int condMin2, condMax2, condRange2;    // 4~97까지의 변수 선언

    public RandomGenerator(final int intMin, final int intMax){ // 4~97까지의 생성자,매개변수가 있는 생성자, final 인데 대문자를 안쓴다?
        this.intMin = intMin;
        this.intMax = intMax;

        intRange = intMax - intMin + 1;                         // 범위 설정
    }

    public RandomGenerator(final int intMin, final int intMax,  //65~90까지, 97~122의 생성자, 매개변수가 있음
                           final int intMin2, final int intMax2){
        this.intMin = intMin;
        this.intMax = intMax;
        this.intMin2 = intMin2;
        this.intMax2 = intMax2;

        intRange = intMax - intMin + 1;
        intRange2 = intMax2 - intMin2 + 1;
    }

    public RandomGenerator(final int intMin, final int intMax,
                           final int condMin, final int condMax,
                           final int condMin2, final int condMax2){
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

    public int intGenerate(){           //돌려 돌려 메서드
        return(int)(Math.random() * intRange + intMin);
    }

    public int intGenerate2(){           //돌려 돌려 메서드2
        return(int)(Math.random() * intRange2 + intMin2);
    }

    public int percent50(){
        return(int)(Math.random() * TWO);
    }

    public boolean confirmRanDom(){
        int tmp;                        // 창고

        for(int i = 0; i < CHECK_NUM; i++){
            tmp = intGenerate();        // 돌려 돌려 메서드를 호출해서 tmp에 넣기

            if(tmp < intMin || tmp > intMax){
                return false;
            }
        }
        return true;
    }

    public int complicatedRandom(){     //
        if(percent50() == 0) {
            return intGenerate();
        }else{
            return intGenerate2();
        }
    }

    public boolean confirmComplicatedRandom(){
        int tmp, tmp2;                  // 창고 2개

        for(int i = 0; i < CHECK_NUM; i++){
            tmp = intGenerate();

            if(tmp < intMin || tmp > intMax){
                return false;
            }

            tmp2 = intGenerate2();

            if(tmp2 < intMin2 || tmp > intMax2){
                return false;
            }
        }
        return true;
    }

    public boolean isRandomNotOk(int rand){
        if((rand >= condMin && rand <= condMax) ||
                (rand >= condMin2 && rand <= condMax2)){
            return false;
        }
        return true;
    }

    public int conditionRandom(){
        int rand, cnt = 0;

        do {
            System.out.printf("%d 번째\n", ++cnt);
            rand = intGenerate();
        } while (isRandomNotOk(rand));

        return rand;
    }


}
