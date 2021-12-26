public class Four {
    public static void main(String[] args) {

        //4~97까지의 랜덤 숫자를 생성 하려면 ((Math.random()*(최댓값-최소값+1)+최소값
        int a = (int)(Math.random() * 94 + 4);

        //랜덤 숫자 출력 코드
        System.out.println("4랜덤 숫자는 = " + a);
    }
}
