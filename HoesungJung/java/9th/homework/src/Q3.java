class Q3 {
    public static void main(String[] args) {
        Cat c;
        c = new Cat();
        c.name = "나비";
        c.color = "검은색, 흰색";
        c.kind = "코리안 숏컷";
        c.age = 12;
        System.out.printf("고양이의 이름은 %s 이고,\n 색깔은 %s 이고,\n 종은 %s 이고,\n 나이는 %d 입니다."
        ,c.name,c.color,c.kind,c.age);
    }
}
class Cat{
    String name;
    String kind;
    String color;
    int age;

}