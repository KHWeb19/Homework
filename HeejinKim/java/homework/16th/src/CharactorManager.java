public class CharactorManager {//여기서는 캐릭터들의 배열을 만들어서 사용자가 많아지는 것(확장성)을 고려함

    Adventurer ch =new Adventurer("해리포터",20,1,10,5);
    Wizard wi=new Wizard("해리포터",20,10,20,20,20,20);
    //이렇게 하나하나 다 넣어주어야하나..
    //Wizard가  Adventurer를 상속했는데 새로운 값만 입력해줄수는 없나?
}
