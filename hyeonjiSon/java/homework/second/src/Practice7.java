public class Practice7 {
    public static void main(String[] args) {
        //문제: 주사위를 굴려서 짝수인 경우 당첨입니다! 출력

        int dice = (int)(Math.random() * 6 +1);

        if (dice % 2 == 0){
            // = 변수 dice 의 숫자를 2로 나누면 나머지가 0이 맞나요?
            System.out.println("주사위의 눈은" + dice + "이므로 당첨입니다!");
        } else { //결과가 아무것도 안나오면 아직 오류인지 아닌지 헷갈려서
                 // else를 추가로 입력했습니다!
            System.out.println("주사위 눈은" + dice + "이므로 꽝! 입니다.");
        }
    }
}
