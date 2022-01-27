public class InterfaceProblem {
    public static void main(String[] args) {
        // interface를 활용하여 게임 하나 만들기
        /*
        1. main매서드
        2. Player2클래스 생성
        - playerNum에 입력된 수만큼 player수 할당
        - 각각의 player에게 hp 50만큼 할당
        3. PlayGame클래스 생성
           player[0]       player[1]    >> player 2명
          shieldSkill      shieldSkill  >> 각각 skill 2개
          attackSkill      attackSkill

          shieldSkill(); >> 여기서 interface기능 구현
          attackSkill(); >> 여기서 interface기능 구현

          >>>근데 이 shield랑 attack 스킬을 어떤 기준으로 주면 될까?
          >>>각각의 플레이어에게 난수를 할당해서
          >>>더 큰 난수를 할당받은 쪽이 attack 스킬(할당받은 수만큼 상대방 hp 뺏기) 사용
          >>>또 난수를 할당해서 난수가 7이 나오면 shield스킬(나의 hp 7채워줌)
          >>>계속 반복하면서 먼저 hp = 0이 되는 플레이어 패배
             (만약 hp값이 음수가 된다면 이는 0으로 처리) if(hp < 0){hp = 0}

        4. Interface 생성
           여기서 각 스킬들의 기능을 넣어주면 될 거 같음
           shield --> 나의 hp 7채워줌
           attack --> 할당받은 수만큼 상대방 hp 뺏기
         */

        Player2 p2  = new Player2(2);
        p2.allocHp();


    }
}
