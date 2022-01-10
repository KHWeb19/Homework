public class Practice5to10 {
    public static void main(String[] args) {
        //문제5. 학생 클래스를 만들어봅시다.
        // 1_1.Student 라는 클래스를 만든다.
        // 1_2. Practice5to10에서 Student 클래스를 사용할 수 있도록 객체화 한다.
        Student stud = new Student();

        //1-3. 학생의 정보(이름, 나이)를 출력해본다.
        stud.initInfo("김땡땡", 18);
        System.out.println(stud); //클래스 자체를 출력

        // toString()이 없으면 Student@1b6d3586 형태의 메모리 주소값이 나온다.
        // toString이란?
    }
}
