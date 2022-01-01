public class Beginner03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("냥이");
        cat.setAge(3);

        System.out.printf("이름: %s\n나이: %d\n", cat.getName(), cat.getAge());

    }
}
