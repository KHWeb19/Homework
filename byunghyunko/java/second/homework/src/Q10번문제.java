public class Q10번문제 {
    public static void main(String[] args) {
        // 65 ~ 90까지의 난수와 97 ~ 122까지의 난수를 무작위로 생성해봅시다.

        int rand1 = (int)(Math.random()*65+25);
        int rand2 = (int)(Math.random()*97+25);

        System.out.println("무작위수 = " +rand1);
        System.out.println("무작위수 = " +rand2);


        // #질문노트
        // 65 ~ 90 범위의 무작위 수가 아닌 전체범위의 무작위 수가 결과값
        // 97 ~ 122 범위의 무작위 수가 아닌 전체범위의 무작위 수가 결과값
    }
}
