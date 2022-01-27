import java.util.Scanner;

public class CatTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cat c = new Cat();

        System.out.print("주인이름 : ");
        String ownername = scan.next();
        c.setOwnername(ownername);

        System.out.print("이름 : ");
        String name = scan.next();
        c.setName(name);

        System.out.print("종 : ");
        String type = scan.next();
        c.setType(type);

        System.out.print("나이 : ");
        int age = scan.nextInt();
        c.setAge(age);

        System.out.print("무게 : ");
        int height = scan.nextInt();
        c.setHeight(height);

        System.out.printf("이름: %s\n", c.name);
        System.out.printf("종: %s\n", c.type);
        System.out.printf("나이: %d\n", c.age);
        System.out.printf("무게: %d\n", c.height);

        c.catClaw();
        c.catMeow();
    }
}
