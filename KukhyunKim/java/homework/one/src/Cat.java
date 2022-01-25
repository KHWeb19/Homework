import java.util.Scanner;

public class Cat {
    String ownername;
    String name;
    String type;
    int age;
    int height;

    public void setOwnername(String ownername){
        this.ownername = ownername;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(int height){
        this.height = height;
    }
    void catClaw() {
        System.out.println("할퀴기!!");
    }
    void catMeow() {
        System.out.println("야옹!!");
    }
}
