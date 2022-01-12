public class RandDouble {
    public void initRand(int min, int max) {
        double num1 = Math.random() * (max - min + 1) + min;
        double num2 = Math.random() * (max - min + 1) + min;
        System.out.println("double 형 랜덤값: " + num1 + ", " + num2);
    }
}
