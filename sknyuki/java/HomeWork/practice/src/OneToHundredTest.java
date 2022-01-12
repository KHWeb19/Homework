public class OneToHundredTest {
    public static void main(String[] args) {
        OTHManager othManager=new OTHManager(0,100);
        othManager.multiple(2);
        System.out.println();
        othManager.multiple(3);
        System.out.println();

        System.out.printf("1~100까지 %d의 배수들의 합:%d\n", 4,othManager.multipleSum(4));
        System.out.println(othManager);
    }
}
