public class Test8 {
    public static void main(String[] args) {
        // 1 ~ 100까지 숫자를 순회한다.
        //   2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        int num = (int)(Math.random()*9+2);
        System.out.println("선택된 값은" +num +"입니다.");
        for(int i =1; i<101; i++){
            if(i %num == 0){
                System.out.printf("%d " , i);
            }
        }

    }
}
