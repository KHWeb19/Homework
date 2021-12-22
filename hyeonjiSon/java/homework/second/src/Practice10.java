public class Practice10 {
    public static void main(String[] args) {
        //문제: 65~90 까지의 난수와 97~122까지의 난수를 무작위로 생성해봅시다.

        int random1 = (int)(Math.random() * 25 +65);
        int random2 = (int)(Math.random() * 25 +97);

        //검색해보니 범위 지정에 nextInt 라는 걸 사용하는 분들이 있던데
        //지금 단계에서 설명 듣기엔 이해하기 어려울까요?
        //궁금해서 간단하게라도 듣고싶습니다.

        System.out.println("65~90 사이의 난수 무작위로 생성 = " + random1);
        System.out.println("97~122 사이의 난수 무작위로 생성 = " + random2);
    }
}
