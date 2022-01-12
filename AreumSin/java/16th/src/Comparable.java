public interface Comparable {
    // Object는 자바에 존재하는 집합체중 가장 거대함
    // 그러므로 모든 원소를 포함 관계에 놓을 수 있다.
    // 즉 어떤 타입으로든 타입 캐스팅을 할 수 있다는 뜻
    // (int) Math.random() << 여기
    int compareTo(Object other);
    // 메소드의 프로타이을 만들어줘야함
}
