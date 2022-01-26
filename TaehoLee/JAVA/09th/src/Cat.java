public class Cat {
    public String catName;
    public int catTall;
    public String catKind;

    public void catSpecific(String name, int tall, String kind){
        catName = name;
        catTall = tall;
        catKind = kind;
    }
    public void catPrint(){
        System.out.printf("%s는 %d높이의 %s에요!", catName, catTall, catKind);
    }
}
