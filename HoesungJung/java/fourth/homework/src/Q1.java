public class Q1 {
    public static void main(String[] args) {

        // 소문자나 대문자가 아니라면 다시 생성.


        //65~122 사이의 랜덤한 문자 생성.
        //- 범위 값 설정 최소 65 , 최대 122
        final int MIN = 65;
        final int MAX = 122;
        int range = MAX - MIN +1;

        //루프 생성을 위해 boolean 사용
        boolean isTrue = true;
        //루프 생성
        while(isTrue){
            //랜덤한 문자 생성.(65~122 사이 랜덤 문자)
            int rand = (int)(Math.random()*range+MIN);

            //범위에 대한 조건 설정(아스키코드 사용 A-Z, a-z)
            boolean con1 = rand>=65 && rand <=90;
            boolean con2 = rand<=97 && rand <=122;
            //출력 설정.
            if(con1||con2){
                System.out.println("출력:" + rand);
                //예외 설정
                isTrue = false;
                //예외라면 break 걸기.
                break;
            }
            //예외인 이유를 알기 위해 예외 값 출력.
            System.out.println("이건 아녀."+rand);
        }

    }
}