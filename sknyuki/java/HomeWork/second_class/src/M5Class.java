public class M5Class {

boolean chr;

boolean range;
int num;
public boolean inputrange() {
    chr = true;
    num= (int)(Math.random()*100)+1;
    range= num%2==0;
    if (range){
    }else{
        chr = false;
        return chr;
    }
    return chr;
}
public void printNum(){
    while(inputrange()){
                System.out.printf("%d는 짝수 입니다\n", num);
            }
        }
    }