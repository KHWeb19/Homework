public class CatClass {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "Qwerty";
        cat.kind = "Korean";
        cat.gender = 'f';
        cat.age = 2;

        System.out.println("고양이의 이름: "+ cat.name);
        System.out.println("고양이의 종: "+ cat.kind);
        System.out.println("고양이의 성별: "+ cat.gender);
        System.out.println("고양이의 나이: "+ cat.age);
        cat.CatPlay();




    }
}
