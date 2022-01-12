public class CatClass {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setCatName("대담");
        cat.setCatGender("수컷");

        System.out.printf("이름: %s, 성별: %s\n",cat.getCatName(), cat.getCatGender());
    }
}
