//public class P00_Question {
    /*
    1. 오늘 수업중 풀이 했던 ExtendsProblem 부분의 코드 분석해보기
    * 엔티티 오염도를 낮추기 위한 분리의 필요성 측면의 분석
    * 결합이 많이 되면 리팩토링(코드 개선)시 왜 힘든지에 대한 분석
    * 새로운 기능이 추가될 때 잘못된 설계가 주는 악영향이 무엇인지 차원에서 살펴보면 도움이 될 것 같습니다.

    2. InterfaceProblem 문제 풀어보기

     */
            /*
             qSkill, wSkill 두 개 정도를 만들고
             캐릭터가 많으면 힘드니까 전사, 마법사 정도로 처리하면 되겠습니다.
             여기서도 모험가 -> 전사 -> 2차 전직(전사)
                     모험가 -> 법사 -> 2차 전직(법사)
             이와 같은 형식으로 설정도 가능할 것입니다.

    1. Class 생성 { TestGame, Player, Level, Job, Adventurer, Warrior, Wizard, Skill }
    2. TestGame 게임시작.
    3. Player게임

     */
