public class Average {

    Score score = new Score();

    //int[] avg = new int[score.SUBJECT_NUM];
    //평균은 float
    float[] avg = new float[score.SUBJECT_NUM];

    public void avgAll(){
            score.scoreAll();

            for(int i = 0; i < score.SUBJECT_NUM; i++){
               avg[i] = (float)score.sum[i] / score.STUDENT;
                System.out.println(avg[i]);
            }







}

}
