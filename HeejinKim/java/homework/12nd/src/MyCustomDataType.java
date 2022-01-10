import java.util.Arrays;

public class MyCustomDataType {

    int[] intArr;
    float [] floatArr;
    double [] doubleArr;

    int intRange;
    float floatRange;

    final int INT_MAX=50;
    final int INT_MIN=30;

    final float FLOAT_MAX=4.75f;
    final float FLOAT_MIN=-4.75f;

    final int BIAS=100;

    static final int INT_PROC = 1;
    static final int FLOAT_PROC = 2;
    static final int DOUBLE_PROC = 3;

     //1,2,3이라고 하면 숫자인지 더블인지 알수 없다
     //int프로세싱이다 int로 처리해야됨
    //정수값이지만 암호같은 것처럼 1을 집어넣으면 어떤 동작을 해라라는 느낌

    int intNum, floatNum, doubleNum;
    //번호를 저장하는 장소
    // init ~~~ 하면서 만들었던 작업들을 사실 요녀석이 해줘야함

    public MyCustomDataType(int intNum,int floatNum,int doubleNum){
        //생성자가 int int int 가 나온다

        intArr = new int[intNum]; //생성자를 만드는 부분 intNum에서 받아온 수를 객체의 intArr에 넣는다.
        floatArr = new float[floatNum];
        doubleArr = new double[doubleNum];

        System.out.println("나는 (int, int, int) 생성자!");
        setRange();
    }

    public MyCustomDataType() { //이건 디폴트
        System.out.println("나는 기본 생성자!");
    }

    public  MyCustomDataType(int intNum,float floatNum,double doubleNum){
        System.out.println("나는 int, float,double 생성자");
    }


    //put이 들어온다고 하더라도 갯수는 int라 데이터타입이 같다고 생각하여 오류를 발생시킴//
    //꼼수를 사용함
    //입력이 하나기 때문에 정수처리,double처리 할껀지 알수가 없어서 decision이라는 것을 통해서 알수있도록함
    public MyCustomDataType(int intNum,final int DECISION) {
        System.out.println("나는 (int,int)생성자");
        // this.intNum = intNum; 원래 여기서 해줘야하는데 같이 처리하려면 switch문에 같이 넣어준다
        System.out.println("DECISION:" + DECISION);
        decisionAlloc(intNum, DECISION);//여기서 DECISION을 넣어줌

    }
    //이 함수 안에서는 int arrNum으로 쓸것이다
    public void decisionAlloc(int arrNum,final int DECISION) { //이 메소드는 (배열갯수,decision값)
           switch (DECISION) { //PROC에 쓴 값이 1,2,3이라 그 값을 도출
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
                   System.out.println("올바른 값을 입력하세요" );
                   break;
           }
       }
    public void setRange() {
        setIntRange();
        setRealRange();
          }
    public void setIntRange(){       //int범위를 지정해줌
        intRange=INT_MAX-INT_MIN+1;
        }

    public void setRealRange(){     //float범위를 지정해줌
            // 0.0 ~ 1.0 미만 - Math.random()
            // 4.75 + 4.75 -> 9.5
            // 0.0 ~ 9.5 미만 + 0.1
            // 0.1 ~ 9.6 미만 (9.5xx)
            // 그래서 최종적으로 ===> (-475 ~ 475) / 100
            // floatRange = 951
            floatRange = FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;
        }

    public void allocRandom(){

        allocIntRandom();
        allocFloatRandom();
        allocDoubleRandom();

    }
    public void allocIntRandom() {//int값을 랜덤으로 할당해줌
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = (int) (Math.random() * intRange + INT_MIN);
            }
        }
    public void allocFloatRandom () {
         for (int i = 0; i < floatArr.length; i++) {
                // (0.0 ~ 950) + (-4.75f)//먼저 0.0~950을 백분위로 만들어주고 -4.7f를한다
                //float tmp = ((int) (Math.random() * floatRange)) / BIAS + FLOAT_MIN;
                //float로 만들어주고 받을때는 int로 만들어줌 ---이 전체를 bias로 나눔
                //이 식은 지금 계산이 이상함 그래서 bias처리는 따로 해줌

                float tmp = (int) (Math.random() * floatRange);

                tmp /= BIAS; //
                floatArr[i] = tmp + FLOAT_MIN;
            }
        }
    public void allocDoubleRandom(){

                for (int i = 0; i < doubleArr.length; i++) {
              double tmp=(int)(Math.random() * floatRange);
              tmp/= BIAS;

              doubleArr[i] = tmp + FLOAT_MIN;
            }
        }

    @Override
    public String toString() {
        return "MyCustomDataType{" +
                "intArr=" + Arrays.toString(intArr) +
                ", floatArr=" + Arrays.toString(floatArr) +
                ", doubleArr=" + Arrays.toString(doubleArr) +
                '}';
    }
}
