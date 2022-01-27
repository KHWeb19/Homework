public class Cat {
    //문제 3
    private String name;
    private int age;

    Catinfo catinfo;
    Catbehavior catbehavior;

    public void initCat(){
        catinfo = new Catinfo();
        this.name = catinfo.setName();
        this.age = catinfo.setAge();
        getInfo();
    }
    public void setAct(){
        catbehavior = new Catbehavior();
        catbehavior.catAct();
    }

    public void getInfo(){
        System.out.printf("이름: %s, 나이: %d\n", name,age);
    }

}
