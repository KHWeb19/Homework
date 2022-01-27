public class Meowing {

    Eat eat = new Eat();


    public void cryCat(){

        eat.catEat();

        //select에 static을 붙여주니 작동함
     if(eat.select.equals("Y")){
            System.out.println("냐아앙~");
        }else{
            System.out.println("캬하항!!");
        }
    }
}
