public class Average {

    final int SUBJECT_NUM = 3;

    Score score = new Score();
    float avg;


    public void initavg() {


        score.initScore();



        //score객체내의 sum변수를 가지고 오고싶다
        //int sum 에 static을 붙이니 되었다
        //return 값으로 만들어도 나온다
        avg = (float) score.sum / SUBJECT_NUM;




    }
}
