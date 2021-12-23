public class Practice11 {
    public static void main(String[] args) {
        //문제: 65~122까지의 난수를 무작위로 생성하고
        // 65~90 혹은 97~122에 해당하는 숫자만 출력해봅시다.

        int random = (int) (Math.random() * 65 + 57);

        if (random <= 90) {
            System.out.println("65~90 사이에 해당하는 숫자 = " + random);
        } else if (random >= 97) {
            // else if는 오늘 배운 내용은 아닌데 알고 있던거라 슬쩍 사용해봤습니다...
            System.out.println("97~122 사이에 해당하는 숫자 = " + random);
        } else {
            System.out.println("조건1, 2 모두에 해당하지 않는 숫자 = " + random);
        }
    }
}
