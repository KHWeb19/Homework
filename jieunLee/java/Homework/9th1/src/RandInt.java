public class RandInt {
    public void initRand(int min, int max) {
        int num1 = (int) (Math.random() * (max - min + 1) + min);
        int num2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("int 형 랜덤값: " + num1 + ", " + num2);
    }

}
