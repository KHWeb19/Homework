public class ScoreClass {
    public static void main(String[] args) {
        // 문제은행[3] 3,4
        Score scores = new Score();

        scores.init_score();
        scores.scoreRandom();

        System.out.println("평균: "+scores.avgScore());
        System.out.println("븐산: "+scores.disScore());
        System.out.println("표준편차: "+scores.devScore());
    }
}
