public class RandFloat {
    public void initRand(int min, int max) {
        float num1 = (float) (Math.random() * (max - min + 1) + min);
        float num2 = (float) (Math.random() * (max - min + 1) + min);
        System.out.println("float 형 랜덤값: " + num1 + ", " + num2);
    }
}
