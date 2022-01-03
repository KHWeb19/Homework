public class Catinfo {
    //문제 3
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("야옹이");
        cat.setAge(1);

        System.out.printf("이름: %s, 나이: %d\n", cat.getName(),cat.getAge());
    }

}
