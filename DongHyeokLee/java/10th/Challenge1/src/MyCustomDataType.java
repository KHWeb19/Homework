import java.util.Arrays;

public class MyCustomDataType {
    // 정수형 변수 1개, float 변수 2개, double 변수 3개에 아무 값이나 할당하고 출력합니다.

    //각 타입형마다 배열을 만들고
    //배열의 길이를 변수의 갯수로 지정
    // 그후 랜덤 값을 뽑기
    // 우선 랜덤 범위 지정 해야됨

    final int INT_MAX = 100;
    final int INT_MIN = 30;

    final float FLOAT_MAX = 4.25f;
    final float FLOAT_MIN = -4.25f;
    final int BIAS = 100;




    int intRange;
    float floatRange;
    double doubleRange;

    float tmp = 0;

    int[] intArr;
    float[] floatArr;
    double[] doubleArr;

    // public void inputNum(int intNum , int floatNum, int doubleNum){
    // 생성자 사용
    public MyCustomDataType(int intNum , int floatNum, int doubleNum) {
        intArr = new int[intNum];
        //앗 다 정수형이구나!
        floatArr = new float[floatNum];
        doubleArr = new double[doubleNum];


    }

    //이제 값을 넣어야함

    //set을 안했더니 toString해서 나온값이 0만나옴
    public void setIntRange(){
        intRange = INT_MAX + INT_MIN + 1;
    }

    public void setFloatRange(){
        floatRange =  FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;
    }

    public void setRange(){
        setIntRange();
        setFloatRange();
    }



    public void intAlloc(){
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = (int) (Math.random() * intRange + INT_MIN);
        }
    }


    //floatRange 만 구하면
    //0<= range < 850
    // /BIAS  = 0 <= range <8.5
    // - 4.25 -4.25 <= range < 4.25
    public void floatAlloc(){
        for(int i = 0; i < floatArr.length; i++){
            float tmp = (int) (Math.random() * floatRange);

            tmp /= BIAS;

            floatArr[i] = tmp + FLOAT_MIN;


        }

    }

    public void doubleAlloc() {
        for (int i = 0; i < doubleArr.length; i++) {
            double tmp = (int) (Math.random() * floatRange);

            tmp /= BIAS;

            doubleArr[i] = tmp + FLOAT_MIN;
        }
    }

        public void allAlloc () {

        //셋에
            setRange();

            intAlloc();
            floatAlloc();
            doubleAlloc();

        }

    @Override
    public String toString() {
        return "MyCustomDataType{" +

                ", intArr=" + Arrays.toString(intArr) +
                ", floatArr=" + Arrays.toString(floatArr) +
                ", doubleArr=" + Arrays.toString(doubleArr) +
                '}';
    }
}


