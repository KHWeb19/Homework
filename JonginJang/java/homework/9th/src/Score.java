public class Score {//문제5,6,7,9,10
    CalScore calScore;

    public void initScore(){
        calScore = new CalScore();
        calScore.initCalScore();
        calScore.addScore();
        calScore.getAvg();
        calScore.getDev();
        System.out.println(calScore);
    }

}
