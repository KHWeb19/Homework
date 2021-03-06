public class QnA1 {
    public static void main(String[] args) {
        // 65 ~ 90, 97 ~ 122 무작위 난수
        //class 이름은 시작이 무조건 대문자
        //만약 다중 단어로구성된다면 단어 이니셜마다 대문자로 구성한다.
        //변수나 매서드(함수)의 경우엔 시작은 소문자,
        // 이후 class와 마찬가지로 다중 단어로 구성된 경우 시작 소문자 이후 나머지는 이니셜마다 대문자로 구성
        final int max1 = 9;
        final int min1 = 65;

        final int max2 = 97;
        final int min2 = 122;
        //final은 상수값을 지정 (상수: 수식에서 변하지 않는 값)
        //상수값을 지정할 때는 변수명은 전부 대문자로 만든다. (부가적인 관습)

        //범위 : 최대값 - 최소값
        int range = max1 - min1 + 1;
        int rand = (int)(Math.random() * range + min1);
        System.out.println("65 ~ 90 사이의 무작위 난수 : " + rand);
    }

}

/*
Q. final을 사용하니까 오히려 입력할 게 많아지고 귀찮은데 왜 써야 하나요?
A.
예를 들어서 어떤 생산 라인(공장)을 관리하는 시스템이 있다.
현재 공장 라인은 7개가 있기 때문에 코드에는 모두 7이라는 숫자를 직접 입력하여 개발되어 있다.
if (num == 7) {
  blabla ~~
  }

  //6번 라인을 의도한 부분임
  if (line == num - 1) {
   //특수 공정 진행
  }
그런데 이번에 신규 사업을 따내면서 설비를 증설하고자 한다. 새로운 라인 5개를 추가한다.
그런데 코드를 이미 수십만줄 개발해놨다. 이런 경우 어떻게 해야할까?

→ 만약 final int NUM = 7;
  이런 경우 7과 관련한 매커니즘이 아닌 좀 더 일반화된 형식으로 코드를 작성할 수 있었을 것이고
  만약 라인 수가 변경되면 7을 전부 찾아서 없애는 것이 아닌
  final int NUM = 7; <- 을 그냥 12로 바꾸면 해결된다.

  그럼 위의 6번 라인은?
  → final int SPECIAL_PROCESS == num) 으로 처리하면 된다.
    나중에 추가 설비를 달면서 6번 공정을 바꾸고 이것을 8번으로 바꾼다 하더라도
    final int SPECIAL_PROCESS = 8; 로 바꾸면 그만이다.

    수천개의 파일, 수만 ~ 수십만 라인의 경우에도 final을 사용해서 관리하면 단순히 숫자만 바꿔도
    모든 파일과 모든 코드에 이를 적용할 수 있다는 이점이 있다.

 */

/*
Q2. final 이 유지보수에 좋은 것은 알겠지만, final int와 그냥 int에 어떤 차이가 있는건가요?
A2. final int는 상수이므로, 코드 중간에 변수 값을 변경할 수 없음.(변경하려고 할 경우 컴파일 에러가 떠서 작동되지 않는다고 함.)
    유지보수를 하며 코드 중간에 변수 값을 변경할 경우 팀 전체의 코드에 문제가 발생할 수도 있음.
    이러한 사고를 final 이 원천에 차단함.
    일반 int = 무엇이든 담을 수 있는, 재활용 가능한 박스 / final int = 재활용할 수 없는 박스.
 */