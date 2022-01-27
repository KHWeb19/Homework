public class Sample {

    static int age;
    static String name;

    public Sample(String num, int age) {
        System.out.printf("이름:%s,나이:%d\n", num, age);
    }

    public void practice() {
    age=4;
    name="미미";

        System.out.printf("나이는 %d 이름은%s\n", age, name);

    }
}