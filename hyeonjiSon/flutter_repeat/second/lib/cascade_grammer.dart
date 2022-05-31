//flutter만의 특별한 문법

class CascadeTest {
  String name;

  CascadeTest(this.name);

  void cascadeTest() {
    print("요런식으로 작업이 가능해서 편리함. 자바 왜 씀?");
  }
}

cascade_grammer_test() {
  CascadeTest ct = CascadeTest("아무개")..cascadeTest();

  print("이름: ${ct.name}");
}