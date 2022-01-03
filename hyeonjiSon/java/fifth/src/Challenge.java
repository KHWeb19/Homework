public class Challenge {
    public static void main(String[] args) {
        // 1. 1~100 을 순회한다. (순차 순회할 필요는 없다) - 방어 루틴 안 쓸것임
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // 4. 배수라면 출력하고 sum에 합산
        //    아니라면 i에 가장 가까운 i보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    또한 현재 i값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면 방어루틴이 없어도 안정된 동작을 보일 것이다.

        final int MAX = 122;//출력되는 가장 작은 숫자
        //또한 65는 대문자 A의 10진수 아스키 코드 번호! 대문자 Z는 90
        final int MIN = 65; //출력되는 가장 큰 숫자
        //97~122는 소문자 a~z 의 아스키 코드 번호!

        int range = MAX - MIN +1; // range = 122-65 = 57(min과 max 두 숫자 사이의 범위)
        // 하지만 그냥 57은 0~56으로 출력되니까 +1을 더한다!
        boolean isChar = true; //이것도 미리 설정해두면 나중에 isChar 의 값만 바꿔주면 되니 편하다.

        while(isChar){ //while의 조건문이 true이면 반복문이 무한반복
            int rand = (int)(Math.random() * range + MIN);
            // range(1~57의 숫자)에 모두 +65가 더해져 122까지의 숫자가 출력될 수 있음.
            // 또한 반복문 안에 random() 메서드가 있어야 문장 다시 출력하기가 가능!

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            if(condition1 || condition2){ // ||의 의미는 or 이다. 좌항 우항 중 하나라조 참이면 전체가 참이 되어 값이 출력.
                System.out.printf("rand는 영어 대소문자 %c(%d)\n", rand, rand);
                isChar = false; // while을 거짓으로 만들어서 while 반복문을 완전히 빠져나가게 해주는 역할
                break; //이게 없으면 if문 내용을 달성한 후에도 아래 "문자가 아닌 기호" 문구가 출력됨.
            }

            System.out.printf("rand는 문자가 아닌 기호 %c(%d) 영어 대소문자가 나올 때 까지 재출력\n", rand, rand);
            //break빼고 이걸 else로 감싸도 괜찮음.
        }


    }
}
