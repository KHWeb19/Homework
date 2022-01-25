public class WhyThreadMakesProblem {
}

// Thread가 문제를 일으키는 이유는 무엇인가 ?
/*
앞선 상황에서 문제가 된 이유가 도대체 무엇일까 ?

아래와 같이 두 개의 스레드가 있고
이 녀석들이 함께 공유하는 자원인 전역 변수인 money가 있습니다.
money가 전역변수인 이유는 main이 있는 DiscorruptBankSituationExample에서
money가 있는 DiscorruptBank 객체를 static으로 고정시켜버렸기 때문입니다.
그러므로 DiscorruptBank에 있는 money 또한 전역으로 활용할 수 있습니다.

상황을 좀 더 간소화해서 정리를 해보자면 아래와 같은 상황입니다.

---------------------------------------------------|
                      10000                        |
                      money                        | Critical Section(임계 영역)
---------------------------------------------------|
      1                                   1        |
Thread A(입금)                       Thread B(출금) |
                                                   |
---------------------------------------------------|

Critical Section은 특정 자원을
동시에 접근하는 상황이 발생할 수 있는 모든 영역에 붙이는 이름이다.
Critical Section을 두 글자로 표현하면 '변수' 다.

만약 이 money에 스레드가 하나만 접근하거나
혹은 접근을 할 수 없다면 money는 Critical Section이 아니다.

현재 이 문제를 해결하기 위해서는 몇 가지 개념이 정립되어야 한다.

1. 프로세스와 스레드 v
2. Multi-Tasking(멀티 태스킹)

이 개념은 과거 CPU가 1개 있던 시절부터도 쭉 존재해왔던 개념이다.
이 멀티 태스킹이란 용어는 스타크래프트에서도 자주 사용하는 용어에 해당한다.
최고로 평가받는 선수들중 김택용(코새끼), 이영호(빵호)가 있다.

실제로 게임 플레이하는 개인 화면을 보면
정말로 동시에 여러가지를 하는가 ?
아니면 하나의 일을 굉장히 빨리 처리하고 다음 다음을 하는가 ? v

컴퓨터에서 얘기하는 멀티 태스킹의 개념도 완벽하게 이와 동일하다.
현재 학원의 컴퓨터의 스펙을 보면 3.00GHz가 나오고 있다.
3 GHz라는 것은 3 x 10^9 으로 1초에 30억번 진동을 한다는 의미이고
이 뜻은 결국 컴퓨터가 1초에 30억개의 명령을 처리할 수 있다는 뜻이되기도 한다.

야구 선수들 타자들의 동체 시력이 매우 뛰어나다고 함
이 선수들은 동체 시력이 대략 0.3초정도를 감지할 수 있다고 합니다.
1초에 30억개니까 0.3초면 ? 9억개 ---> 0.1초에 3억개
0.01초에 3천만개
0.001초에 3백만개
0.0001초 3십만개
0.00001초 3만개

보통 우리가 작성하는 프로그램 코드를 기계어로 변환하면
대략적으로 매서드 하나당 명령어 100개 ~ 300개 정도가 만들어집니다.
가끔 조금 복잡한 녀석들은 1000개 정도까지도 나올 수 있습니다.

그러면 0.0001초동안 하나의 프로그램을 다 돌리고도 시간이 남을까 안남을까 ?
시간이 한참 남아 돌게 됩니다.
너무 빨리 일을 처리할 수 있으니 컴퓨터는 우리에게 착시현상을 일으켜준다.
작업 관리자에서 봤던 모든 프로세스에게 0.0001초씩 돌아요 ~ 하면
지금 200개가 있어도 0.02초면 모든 작업이 완료됩니다.
운동 선수여도 이 간극을 발견하지 못하겠죠.

실제로는 운영체제가 각각의 프로세스들에게 0.0001초 보다 더 작은 시간을 주고
프로세스(프로그램)들을 구동시키게 됩니다.
즉 자신한테 주어진 시간이 있어서 그 시간을 모두 사용하면
제어권이 다음 프로세스에게 넘어가는 구조로 만들어져 있습니다.

이렇게 빠르게 다음 다음 다음 하면서 진행되니
사람이 느끼기엔 ??? 어 모든 것이 동시에 실행되는구나라는 착각에 빠지게 만든다.

3. Context Switching(컨텍스트 스위칭)

컨텍스트 스위칭은 무엇이냐 ?
제어권이 넘어갈때 발생하는 이슈들을 방어하기 위한 메커니즘

이게 뭔지는 알 필요는 없음
그러나 Context Switching을 이해하기 위해서는
흐름 정도는 파악하는 것이 좋음

아래 보이는 기계어들을 CPU가 한 줄 한 줄 실행한다.
앞서 제어권이 넘어간다고 얘기했던 사항들은 아래 기계어를 전부 실행하지 못한 상태로
다른 thread(스레드)나 process(프로세스)로 제어권이 넘어가는 상황을 의미한다.

ThreadA (곱하기 2)

   0x0000000100401080 <+0>:	push   %rbp
   0x0000000100401081 <+1>:	mov    %rsp,%rbp
   0x0000000100401084 <+4>:	mov    %ecx,0x10(%rbp)
=> 0x0000000100401087 <+7>:	mov    0x10(%rbp),%eax
   0x000000010040108a <+10>:	add    %eax,%eax  <<<--- 이 시점 (제어권 넘어갔다고 가정)
   0x000000010040108c <+12>:	pop    %rbp
   0x000000010040108d <+13>:	retq

ThreadB (곱하기 3)

   0x000000010040108e <+0>:	push   %rbp   <--- 제어권이 넘어와서 여길 실행하고 있음
   0x000000010040108f <+1>:	mov    %rsp,%rbp
   0x0000000100401092 <+4>:	mov    %ecx,0x10(%rbp)
   0x0000000100401095 <+7>:	mov    0x10(%rbp),%edx
   0x0000000100401098 <+10>:	mov    %edx,%eax
   0x000000010040109a <+12>:	add    %eax,%eax  <<<--- ThreadA에서도 ThreadB에서도 요 %eax라는 것을 사용하고 있음
   0x000000010040109c <+14>:	add    %edx,%eax  <--- ThreadB가 여기까지 전부 실행을 완료함 (곱하기 3한 상태가 eax에 들어감)
   0x000000010040109e <+16>:	pop    %rbp
   0x000000010040109f <+17>:	retq

실제 현실의 하드웨어임 ---> %eax가 저장 공간임
threadA가 eax를 사용해야 하는데
threadB도 eax에 값을 저장하였음 <<<---

예로 든 시나리오 (데이터 무결성 보장 x - Context Switching에 문제 발생)

1) ThreadA가 add %eax, %eax를 하기 이전에 제어권이 ThreadB에게 넘어감
2) ThreadB가 add %eax, %eax를 하고 add %edx, %eax로 곱하기 3을 완료함
3) 제어권이 ThreadB 에서 ThreadA로 넘어갔음
4) ThreadA가 이제 add %eax, %eax를 진행함
5) 결국 요상하게 결과는 곱하기 6을 한 결과가 나타날 것임

[ %eax가 실존하는 하드웨어라 이 자원을 레알로 같이 공유하는 상황임 ]

이것이 올바른 상황인가 ? No!

이렇게 어떤 경우엔 곱하기 2가 잘 되고 (제어권이 안넘어가면 잘 될 것임)
어떤 상황에선 곱하기 6이 되고 어떤 상황은 10, 12 등등 ... (제어권 넘어가면)
이런 상황에서는 우리가 어떤 작업을 의도하고 코드화할 수 없다.
즉 이런 상황은 발생하면 안되는데
이것을 전문 용어로 데이터의 무결성을 보장해야 한다!

y = 곱셈2() * x

라는 함수를 만들었을때
x 값에 따라 y 값은 항상 일관된 결과를 만들어야 한다.
(이것을 보장해줘야 한다는 것을 데이터 무결성 보장이라고 함)

데이터 무결성을 보장하기 위해
실제 CPU가 사용하는 하드웨어 자원을 제어권이 넘어가기 직전에 메모리에 백업시킨다.
그리고 제어권이 다시 자신에게 돌아오면 메모리에 백업한 정보를
하드웨어 자원(레지스터)에 복원시켜서 작업한다.

정상적인 시나리오)

1) ThreadA가 add %eax, %eax를 하기 이전에 제어권이 ThreadB에게 넘어감
2) 넘어가기 직전에 CPU가 사용하는 모든 하드웨어 자원들을 메모리로 백업함
3) ThreadB가 add %eax, %eax를 하고 add %edx, %eax로 곱하기 3을 완료함
4) 제어권이 ThreadB 에서 ThreadA로 넘어갔음
5) 마찬가지로 ThreadB도 사용하고 있던 CPU 자원을 메모리로 백업함
6) ThreadA로 제어권이 넘어오니 메모리에 백업한 정보를 CPU 하드웨어로 복원함
7) ThreadA가 이제 add %eax, %eax를 진행함
8) 아무리 제어권을 바꿔대도 언제나 곱하기 2라는 결과를 내놓을 것임을 알 수 있음

컴퓨터 용량)

 1 KB = 2^10 byte  = 1024 byte
 1 MB = 2^10 KB    = 2^20 byte
 1 GB = 2^10 MB    = 2^30 byte
16 GB = 2^4 * 1 GB = 2^34 byte <<<--- 대부분의 컴퓨터에 달려 있는 메모리의 크기
        8    byte  = 2^3  byte <<<--- 비싸고 빠른 레지스터의 크기

        몇 배 차이가 날까요 ? 2^31승 차이가 나고 있음
        21억배 차이가 난다는 것을 확인할 수 있음

결론: Context Switching을 너무 자주하게 프로그램을 만들면
     스레드를 사용하는 의미 자체가 없어져 버릴 수 있다.
     잘 써야 한다 <<<------------

참고로 Context Switching은 운영체제가 알아서 처리한다.
우리가 알아야 하는 이유는 Context Switching을 처리하는데 비용이 많이 들기 때문에
코드를 작성할 때 Context Switching이 빈번하게 발생하지 않도록 만들어야 하기 때문!
 */