public interface Comparable {

    int compareTo (Object other);

    /*Object란? 자바에서 존재하는 집합체 중에 가장 범위가 넓다.
    그래서 모든 원소를 포함 관계에 놓을 수 있다.
    어떤 타입으로도 타입 캐스팅이 가능하다.


    위와 같은 함수의 리턴 타입, 이름, 입력인저만 있는 경우를
    메서드의 프로토타입만 작성했다고 하는데
    인터페이스는 이러한 프로토타입만 작성하고
    실제 기능은 이 인터페이스를 implements(구현) 하는 쪽에서 만들어준다.

    ex. 오더 인터페이스를 만들면
    음식점 전용으로 커스텀하고, 전자매장 전용으로 커스텀이 가능함
    이름은 동일하게 오더 이지만 기능을 커스텀할 수 있다.*/




}
