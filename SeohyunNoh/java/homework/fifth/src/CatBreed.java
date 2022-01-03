import java.util.Scanner;

public class CatBreed {
    // 고양이 품종 입력하기

    Scanner scan = new Scanner(System.in);
    boolean enterNotFinish = true;

    public void initCat() {
        enterCatInfo();

        while (enterNotFinish) {
            System.out.println("계속 입력하시겠습니까? (y / n)");
            String yOrN = scan.nextLine();

            if (yOrN.equals("n")) {
                enterNotFinish = false;
            }
        }
    }

        public void enterCatInfo () {
            System.out.print("고양이 품종을 입력해주세요 : ");
            String breed = scan.nextLine();

            System.out.println("품종 : " + breed);
        }
}
