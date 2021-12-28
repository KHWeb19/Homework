public class Quiz3 {
    public static void main(String[] args) {
        /*
        1. 로또 확률 0.05;
        2. 당첨번호는 1

        질문
        로또 번호를 1로 생성하는 작업에서 중복을 피하고 싶다면 어떻게 해야될까요?
        ex) for안에서 10번에 로또번호저장 , 다음 작업에서도 10번에 저장이되는 경우 이런 경우를 제외하고싶습니다.
         */
        final int MAX =100;
        final int MIN = 1;

        int range = MAX - MIN +1;
        int rand;
        int [] lot = new int[100];

        int mynum = (int)(Math.random()* range +1);

        for (int j = 0; j < 100; j++){
            lot[j] = 0;
        }

        for (int i = 0; i < 5; i++){
            rand =(int)(Math.random()* range +1);
            lot[rand] = 1;
        }

        if (lot[mynum] == 1){
            System.out.println("당첨입니다");
        }else
            System.out.println("꽝입니다.");
    }
}
