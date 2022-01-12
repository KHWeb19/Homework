public class SampleTest {
    public static void main(String[] args) {

        Sample sample = new Sample("강아지", 8);

        Sample sample2 = new Sample("고양이", 4);

        System.out.println(sample);
        System.out.println(sample2);

        sample.practice();
        sample2.practice();


    }
}