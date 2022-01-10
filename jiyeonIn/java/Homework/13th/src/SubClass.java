import java.util.Arrays;

public class SubClass {
    int intNum;
    int floatNum;
    int doubleNum;

    int arryNum;
    private int intArry[];
    private float floatArry[];
    private double doubleArry[];
    private int range;
    private int BASC = 100;
    float doubleRange;
    double doubleRange2;
    static final double REALMAX1 = 4.75;
    static final double REALMIN1 = -4.75;
    static final float REALMAX = 4.75f;
    static final float REALMIN = -4.75f;
    static final int INTMAX = 10;
    static final int INTMIN = 1;
    final static int INT_PROC = 1;
    final static int FLOAT_PROC = 2;
    final static int DOUBLE_PROC = 3;


    public SubClass(int intNum, int floatNum, int doubleNum) {
        intArry = new int[intNum];
        floatArry = new float[floatNum];
        doubleArry = new double [doubleNum];

        System.out.println("생성자 생성");

        setRange();
    }

    public void setRange() {
        intRange();
        realRange();
    }

    public void realRange() {
        doubleRange = REALMAX*BASC  - REALMIN*BASC +1;
        //4.75 *100 -(-4.75*100) = 950+1
        //951-> 0~950.999
    }

    public void intRange() {
        range = INTMAX - INTMIN +1;
    }

    public SubClass(int arryNum, int DECISION) {
        System.out.println("DECISION :" +DECISION);
        allocSwitch(arryNum, DECISION);

    }

    public void allocSwitch(int arryNum, int DECISION) {
        switch(DECISION) {
            case INT_PROC :
                intArry = new int[arryNum];
                intRange();
                break;
            case FLOAT_PROC:
                floatArry = new float[arryNum];
                realRange();
                break;
            case DOUBLE_PROC:
                doubleArry = new double[arryNum];
                break;
        }
    }
    public void alloIntRand() {
        for(int i=0;i<intArry.length;i++) {
            intArry[i] = (int)(Math.random()*range+INTMIN);
        }
    }

    public void alloFloatRand() {
        for(int i=0;i<floatArry.length;i++) {
            float tmp = (int)(Math.random()*doubleRange);
            tmp/=BASC;

            floatArry[i] = tmp +REALMIN;
        }
    }
    public void alloDoubleRand() {
        double tmp;
        realRange();
        for(int i=0;i<doubleArry.length;i++) {
            tmp = (Math.random()*doubleRange);
            tmp/=BASC;

            doubleArry[i] = tmp +REALMIN1;

            //alloFloatRand는 realRange매소드 안넣어도 잘 실행되는데,
            //alloDoubleRand 여기서는 realRange()의 매소드를 입력을 해줘야지 실행이 됩니다.
            //무슨 차이가 있는걸까요? ㅠㅠㅠ
        }
    }

    @Override
    public String toString() {
        return "SubClass [intArry=" + Arrays.toString(intArry) + ", floatArry=" + Arrays.toString(floatArry)
                + ", doubleArry=" + Arrays.toString(doubleArry) + "]";
    }

}
//각 데이터타입별 배열을 만들어 준 후, 그 크기에 따라서 랜덤으로 값을 생성 해 줄수있는 값을 만든다.