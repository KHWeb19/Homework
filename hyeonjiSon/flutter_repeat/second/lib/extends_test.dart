class Person {
  String name;
  int age;

  Person({ this.name = "", this.age = 0 });
}

class Student extends Person {
  late String major;
  //flutter은 개발이 편리할 수 있지만 late에 대한 이슈가 있다.
    //보안에 대한 부분. (휴대폰 앱에서 결제를 하는 등...) 소프트 웨어가 보안에 신경을 쓰게 됨
    //아무것도 없는 참조변수가 공격 루틴으로 활용되는 경우가 많음.
    //데이터가 초기화되지 않았는데 변수가 존재한다던지 하면 문제가 생김.
    //late는 나중에 값이 세팅이 될거다. Null로 존재하지 않을거다 라고 미리 알려주는 작업이다.

  Student(name, age, major) : super(name: name, age: age) {
                          //↑자바에서 사용할 때와 달라진 부분은 이것(:) 뿐이다.
    this.major = major;
  }

  print_info(){
    print("이름: ${this.name}, 나이: ${this.age}, 전공: ${this.major}");
  }
}

extends_test() {
  Student student = Student("아무개", 77, "전기/전자")..print_info();
}