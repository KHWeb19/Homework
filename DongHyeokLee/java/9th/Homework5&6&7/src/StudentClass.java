public class StudentClass {
    public static void main(String[] args) {


        Average average = new Average();

        average.initavg();

        System.out.printf("세 과목의 평균은 = %.2f" , average.avg);
    }
}
