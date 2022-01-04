public class Date6Ans4 {
    private int studentNum = 30;
    private int max = 100;
    private int min = 60;

    private int[] score = new int[studentNum];

    private int range;
    private int random;
    private int sum = 0;
    private float avg;
    private float disper;
    private float standerd;

    public void initStudent(){
        score = new int[studentNum];
    }

    public int studentrandom(){
        range = max - min + 1;
        random = (int)(Math.random()*range+min);
        return random;
    }

    public int studentSum(){
        for (int i = 0; i < studentNum; i++) {
            score[i] = studentrandom();
            sum += score[i];
            System.out.println((i+1)+"학생 = "+score[i]);
        }
        return sum;
    }
    public float studentAvg(){
        avg = (float) (sum) /studentNum;
        return avg;
    }
    public float dispersion(){
        sum=0;
        for (int i = 0; i < studentNum; i++) {
            sum += Math.pow(score[i] - avg, 2);
        }
        disper = sum/studentNum;
        return disper;
    }
    public float StandardDeviation(){
        standerd = (float) (Math.sqrt(sum / studentNum));
        return standerd;
    }
}