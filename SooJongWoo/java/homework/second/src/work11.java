public class work11 {
    public static void main(String[] args) {
        // 65~122까지의 난수를 무작위로 생성하고
        // 65~90 혹은 97~122에 해당하는 숫자만 출력해봅시다
        int rand = (int) (Math.random() * 58 + 65);

        if (rand<=90) {
            if (65 <= rand) {
                System.out.println(rand);
            }
        }
        if (rand<=122) {
            if (97<=rand) {
                System.out.println(rand);
            }
        }
    }
}
/* 선생님 코드 작성시 작동은 되나 더 코드를 압축해서 만들 수 있는지 궁금합니다!
 */