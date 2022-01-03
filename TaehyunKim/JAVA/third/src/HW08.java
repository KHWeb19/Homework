public class HW08 {
    public static void main(String[] args) {
        //8. 1~100까지 숫자를 순회한다. 2~10사이의 랜덤한 숫자를 선택후 이 숫자의 배수를 출력

        int choice = (int) (Math.random() * 9 + 2);
        System.out.println("추첨된 랜덤한 숫자: " + choice);
        for(int i =1; i<=100; i++) {
            if (i % choice == 0){
                System.out.printf("%d ", i);
            }

        }

    }
}
