public class Answer9 {
    public static void main(String[] args) {
        //문제9. 1 ~ 100까지 숫자를 순회한다.
        //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //끝까지 순회했을 때 출력된 숫자들의 합은 얼마인가?
        // 복습 포인트: final int 사용, boolean을 이용하여 방어??? 시키기. ---------------------------------

        final int start = 1;
        final int end = 100;
        final int remain = 0;

        boolean defense = true;
        int sum = 0; //우선 sum메모리에 들어가는 숫자를 0으로 설정한다.

        final int min = 2;
        final int max = 10;
        int range = max - min +1;

        for(int i = start; i <= end; i++){ // 1~100까지 숫자가 나올 때 까지만 반복

            int random = (int)(Math.random() *range + min);
            // for문 밖에 있을 땐 코드 전체에서 한 번 밖에 실행되지 않기 때문에 결과가 1개였지만
            // for문 안에 넣으니 반복되는 동안 계속 새로운 숫자로 출력됨!

            if(i % random == remain){ //'int 랜덤숫자'의 배수만 출력할 수 있는 조건문
                System.out.println("랜덤 숫자의 값 = " + random);
                System.out.printf("랜덤 숫자의 배수 i의 값 = %d\n", i);
                defense = false;

                sum += i; // if문이 100회 반복되는 동안 숫자가 계속 더해진다.
            }
        }

        System.out.println("랜덤 숫자의 배수 i의 값을 모두 더한 결과는 = " + sum ); //100회 반복되며 더해진 결과 출력

    }
}