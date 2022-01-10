public class Car2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color="white";
        c1.name="bus";
        c1.door=4;

      Car c2=new Car("red","metro",4);
       //c2라는 이름은 상관없이 Car라는 클래스의 매서드를 가져온다

        System.out.printf("%s,%s,%d\n", c1.color,c1.name, c1.door);
        System.out.printf("%s,%s,%d", c2.color,c2.name, c2.door);
    }
}
