public class Homework10 {
    //65 ~ 122까지의 난수 무작위 생성, 65 ~ 90 혹은 97 ~ 122에 해당하는 숫자 출력
    public static void main(String[] args) {
        double rand = Math.random();

        int randnum = (int) (Math.random() * 58 + 65);
        if (randnum >= 65 && randnum <= 90) {
            System.out.println("난수 = " + randnum);
        } else if (randnum >= 97 && randnum <= 122) {
            System.out.println("난수 = " + randnum);
        } else {
            System.out.println(" ");
        }
    }
}
