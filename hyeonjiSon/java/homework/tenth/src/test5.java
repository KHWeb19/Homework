import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(
                    System.in
            );
            System.out.print("> 문자열을 입력 : ");
            String str = sc.nextLine(); //내가 입력한 문자열 = str에 저장

            System.out.print("> 검색할 문자 입력 : ");
            char srchChar = //입력된 검색할 문자 srchChar
                    sc.next
                            ().charAt(0); // 컴퓨터상 0, 즉 1개의 문자만 검색 가능하다는 뜻
            /*
            charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 함수.
                       char는 기본적으로 한 글자만 저장할 수 있는 변수이기 때문에
                       Scanner + char를 쓰기 위해선 charAt()을 사용해야 한다.
             */


            // 검색문자 유효성검사
            boolean isUpperCase = (srchChar >= 'A' && srchChar <= 'Z'); // 65 ~ 90
           //isUpperCase는 참이다 = (내가 검색하고자 하는 영문자가 'A'보다 크거나 같거나 또한 'Z'보다 작거나 같을 때)
        //이거의 소문자 확인 버전이 isLowerCase입니다.
            boolean isLowerCase = (srchChar >= 'a' && srchChar <= 'z');	// 97 ~ 122 <-얘는 아스키 코드입니다.

            if(!isUpperCase && !isLowerCase) { //!는 조건을 반대로 만들어줘요 그러니까 isUpperCase와 Lower를 모두 만족하지 못한 경우 라는 뜻이 됨
                System.out.println("검색문자가 영문자가 아닙니다.");
                return;
            }


            int cnt = 0; // 바깥에 선언해야함. 안그러면 매번 리셋되어 초기화.
            // 문자열을 번지수별로 하나씩 검사
            for(int i = 0; i < str.length(); i++) { //초기값이 0인 int i가; str문자 길이보다 작은 동안 반복되는 반복문; i는 반복마다 +1씩 커진다.
                char ch = str.charAt(i); //ch = 내가 입력한 (i)번째 문자 = ch
                System.out.println(ch); //ch가 출력

                // 검색문자와 동일한지 비교
                if(ch == srchChar) //만약 ch가 srchChar와 같다면
                    cnt++; //cnt 값을 +1 시켜라
            }


            System.out.printf("%s안에 %c는 %d개 있습니다.", str, srchChar, cnt);

    }
}
