import javax.swing.*;
import java.util.Arrays;

public class DataType {
    int[] intArr;
    float[] floatArr;
    double[] doubleArr;

    final int INT_MAX = 100;
    final int INT_MIN = 50;

    final float FLOAT_MAX = 4.75f;
    final float FLOAT_MIN = -4.75f;
    final int BIAS = 100;

    static final int INT_PROC = 1;
    static final int FLOAT_PROC = 2;
    static final int DOUBLE_PROC = 3;

    int intRange;
    float floatRange;

    public DataType(int intNum, int floatNum, int doubleNum){

        intArr = new int[intNum];
        floatArr = new float[floatNum];
        doubleArr = new double[doubleNum];

        setRange();
    }
    public void decisionAlloc(int arrNum, final int DECISION){
        switch (DECISION){
            case INT_PROC:
                intArr = new int[arrNum];
                setIntRange();
                break;

            case FLOAT_PROC:
                floatArr = new float[arrNum];
                setRealRange();
                break;

            case DOUBLE_PROC:
                doubleArr = new double[arrNum];
                setRealRange();
                break;

            default:
                System.out.println("올바른 값을 입력하세요!");
                break;
        }
    }
    public DataType(int intNum, final int DECISION){
        System.out.println("DECISION : " + DECISION);
        decisionAlloc(intNum, DECISION);
    }
    public void setIntRange(){
      intRange = INT_MAX - INT_MIN + 1;
    }
    public void setRealRange(){
        floatRange = FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;
    }
    public void setRange(){
        setIntRange();
        setRealRange();
    }
    public void allocIntRandom(){
        for(int i = 0 ; i < intArr.length ; i++){
            intArr[i] = (int)(Math.random() * intRange + INT_MIN);
        }
    }
    public void allocFloatRandom(){
        for(int i = 0 ; i < floatArr.length ; i++){
            float tmp = (int)(Math.random() * floatRange);

            tmp /= BIAS;

            floatArr[i] = tmp + FLOAT_MIN;
        }
    }
    public void allocDoubleRandom(){
        for(int i = 0 ; i < doubleArr.length ; i++){
            double tmp = (int)(Math.random() * floatRange);

            tmp /= BIAS;

            doubleArr[i] = tmp + FLOAT_MIN;
        }
    }
    public void allocRandom(){
        allocIntRandom();
        allocFloatRandom();
        allocDoubleRandom();
    }

    @Override
    public String toString() {
        return "DataType{" +
                "intArr=" + Arrays.toString(intArr) +
                ", floatArr=" + Arrays.toString(floatArr) +
                ", doubleArr=" + Arrays.toString(doubleArr) +
                '}';
    }
}
