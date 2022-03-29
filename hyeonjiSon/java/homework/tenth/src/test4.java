import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        String menu = "선택하세요 1.사과 2.바나나 : ";
        Scanner sc = new Scanner(
                System.in
        );
        char yn = 'y';
        do {
            System.out.print(menu);
            int choice = sc.nextInt();
            // 메뉴선택처리

            System.out.print("더 주문하시겠습니까? (y/n) : ");
            yn =
                    sc.next
                            ().charAt(0);

        } while (yn == 'y');

        System.out.println("끝");
    }
}
