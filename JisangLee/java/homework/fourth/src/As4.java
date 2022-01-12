public class As4 {
    //구구단 7단 출력
    public static void main(String[] args) {
        final int DAN = 7; //구구단 단수 선택
        final int START = 1; //시작 값 선택
        final int END = 9;  //마지막 값 선택
        System.out.printf(" 구구단 %d단 출력\n",DAN);

        for(int i = START; i <= END; i++){
            System.out.printf("%d x %d = %d\n",DAN,i,DAN * i);
        }
    }
}
