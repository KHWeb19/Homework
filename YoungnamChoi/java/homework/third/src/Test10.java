public class Test10 {
    public static void main(String[] args) {
        // 1 ~ 100까지의 숫자를 순회한다.
        //     9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        //     다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        //     이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        int sum= 0;
        for(int i =1; i<101; i++){
            int num = (int)(Math.random() *9+2);
            System.out.println("선택된 값은" +num +"입니다.");
            sum += i;
        }
        System.out.println("최종 결과값: " + sum);
    }
}
