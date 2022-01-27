public class CatTest {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.setCatName("아리");
        cat.setCatAge(2);

        System.out.printf("이름: %s, 나이: %d\n",cat.getCatName(), cat.getCatAge());

    }
}
