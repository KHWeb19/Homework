//한문제라도 클래스하고 메소드를 잘 쪼개보자 하는 마음으로 시작했으나,, 역시 엔티티 오염도는 어쩔 수 없는 것 같습니다ㅠㅠ
public class mean {
    public static void main(String[] args) {
       Student stu = new Student();

       stu.Math();
       stu.Eng();
       stu.Kor();

        System.out.println("평균 : "+stu.Mean());
        System.out.println("수학 분산 : "+stu.Var1());
        System.out.println("영어 분산 : "+stu.Var2());
        System.out.println("국어 분산 : "+stu.Var3());
        System.out.println("표준 편차 : "+stu.StDe());
    }
}
