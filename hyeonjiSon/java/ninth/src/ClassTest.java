public class ClassTest {
    public static void main(String[] args) {
       //Class를 어렵게 생각할 필요가 없음.
        //이 녀석은 사용자가 커스텀하는 데이터타입이다.
          //데이터 타입 : int, float, double, BigInteger 등등 각각이 표현할 수 있는 정보에 제한이 있었음
          //   int, float, double, BigInteger 등등을 한번에 쓰려면  int[], float[], double[], BigInteger[] < 매번 이러고 써야함
          // 클래스는 이런 경우의 정보들을 한 번에 묶어서 관리해줄 수 있는 기능이 있다.

        //클래스를 객체화시킬 때는 반드시 new 클래스명()으로 객체화한다. (문법 규칙!)
        Person person = new Person(); //클래스 Person을 객체로 만들어준다.
                        // new<를 해주면 객체가 된다.

        //객체 내부에 접근할 때 '.'을 사용합니다.
       person.setName("안녕하세요");
       person.setAge(41);

       //일단은 우리가 문법을 공부하고 있기 때문에 Setter, Getter를 사용하고 있지만
        // 실제로 Setter의 경우엔 엔티티를 오염시키는 행위를 하기 때문에 좋지는 않음 (이유는...향후 알게 될 것임!)
        System.out.printf("이름: %s, 나이: %d\n", person.getName(), person.getAge());
    }
}

//class를 다루는 교육은 사실 과거에는 아래와 같은 방식으로 진행되었다.
//1. 그냥 문법 설명
//2. 돌아가는 코드
//과거의 구시대적 방식

//현재는 소프트웨어가 개발된지 50년 이상이 흘러 많은 이론들이 정립된 상태이다.
//소프트웨어 공학(아키텍처): 설계 방법론 등등 많은 것들이 정립됨
//그렇기 때문에 이제 더 이상 과거의 비효율적인 & 실전에 써먹을 수 없는 방식을 선택하는 것은 좋지 못하다.

//먼저 정리해야하는 부분
//[1] 객체란 무엇일까?
// *추상적인 무언가? / 독립적으로 존재할 수 있는 것들? / 데이터와 함수의 묶음? // 클래스는 틀이고 객체가 틀에서 나온 형태?
//  - 현대 소프트웨어 공학에서는 객체를 "행동을 정의하는 주체"로 다룬다.
// [1-1] 행동이란 뭘까?
// *움직이고 작동하는 것?
//  - 최근 유행하는 패턴으로 DDD 라는 것이 있습니다.
// 10년 쯤 전에는 TDD(Test Driven Development) 였고
// 지금에 와서는 DDD(Domain Driven Development)가 되었습니다. Domain(도메인)이란 무엇일까요?
//  - 우리가 만들려고 하는 최종 목표는 사람들이 많이 쓰는 서비스 이다.
//    사람들이 많이 쓰는 서비스는 편의성(시간을 돈으로 산다) 접근성(무지성으로 사용이 가능)이 필요하다.
//    또한 보안과 효율성(엔티티 오염도를 낮춰야 함<소통 중요>)도 갖춰야 함.
//    하지만 어떤 서비스를 처음으로 만드는 상황에서 모든 경우를 고려하는 것은 불가능하다.
//    유명하고 잘 나가는 시스템들도 처음부터 모든 상황을 고려한 것이 아니다.
//    그렇기 때문에 가장 중요한 것은 "변화에 빠르게 적응하는 것!", 이걸 위해서는 >>엔티티(클래스)<<를 오염시키면 안된다.
// - 다른 사람이 만든 코드를 함께 재활용하며 사용해야 함.
//   내가 뭔가를 잘못 건드릴 경우 파생되어 모두 함께 뻥뻥 터짐
//   그렇다고 손놓고 가만히 있으면 문제 있는 프로그래머가 됨.

//    결국 우리는 문제를 풀 때 분리된 생각을 적용한 클래스를 만들 필요가 있음.
//    - "SRP 원칙" : 하나의 클래스는 하나의 도메인(영역)만 다룬다하여 실제 특정 행동만 다루도록 해야함
// - SRP 규칙: 하나의 클래스는 하나의 도메인(기능 - 행동)만 담당한다.

//클래스를 만들었을 때의 장점
// - 현재 모든 코드를 메인에 작성하는 방식은 기능의 재활용이 어려움.
// - 클래스를 만들면 반복되는 루틴이 사라져 코드가 깔끔해질 수 있음.
// - 클래스 하나에 다수의 시스템이 들어가는 일이 없기 때문에 엔티티가 오염되지 않음. (엔티티 오염 → 재활용 불가 사태)
// - 특히 영역마다 클래스를 만들어서 분리를 시키고, 집단으로 코드를 작성하는 상황이 되면 문제 터질 확률이 상당히 최소화된다.

//실제 컴퓨터 분야에서 객체(object)라는 용어는 메모리 상에 로드(적재)된 데이터를 의미한다.
// - new를 한 정보들을 모두 객체로 취급한다.
// - 그렇기 때문에 지역 변수도 사실은 스코프가 살아있는 동안은 객체로 취급할 수 있다.

//[2] 객체지향은 뭘까?
// - 지금 이야기한 엔티티의 오염도를 낮추면서 모든 행동들을 각각의 클래스로 분리하는 것이 현대판 객체지향이다.

//[3] C언어 같은 절차지향형 언어는 객체지향이 안되나?
// - C로도 함수 포인터와 구조체를 이용해서 구현이 가능하다. 특정 언어 패러다임에 갇혀서 시야를 스스로 좁히면 안된다!

//[4] 요즘은 함수형 언어란 것도 있는데 다 무슨 뜻일까?
// - 우리가 향후에 배울 파이썬이 함수형 언어에 해단된다.(더 정확하게는 lisp 에 해당된다.)
// - 함수형 언어는 병렬처리에 특화된 경향을 가지고 있다.
// - 물론 자바와 C도 이런 형식의 운용이 가능하다. 자바에선 람다식으로 나타나며 C는 역시 함수포인터로 다 된다.