import java.util.Scanner;

public class Student {

    protected final int LENGTH = 3;
    private final int[] scoreList = new int[LENGTH];

    private float average, variance, stdDeviation;

    public Student(){

        System.out.println("수학,영어,국어 점수를 순서대로 입력하세요: ");

        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\D+");

        for (int i=0; i<this.LENGTH; i++){
            scoreList[i] = sc.nextInt();
        }

        this.setAverage();
        this.setVariance();
        this.setStdDeviation();
    }

    public void setAverage(){
        for (int i =0; i<this.LENGTH; i++){
            this.average += scoreList[i];
        }
        this.average /= this.LENGTH;
    }

    public float getAverage(){
        return this.average;

    }

    public void setVariance() {
        for (int i = 0; i < this.LENGTH; i++) {
            this.variance += (float)Math.pow((this.scoreList[i]-this.average),2);
        }
        this.variance /= this.LENGTH;

    }

    public float getVariance(){
        return this.variance;
    }

    public void setStdDeviation(){
        this.stdDeviation = (float) Math.sqrt(this.variance);
    }

    public float getStdDeviation(){
        return this.stdDeviation;
    }

}
