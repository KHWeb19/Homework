public class Homework11 {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random()*58+65);

        if(rand1>=65 &&rand1<=90 ){
            System.out.println(rand1);
        }else if(rand1>=97 &&rand1<=122){
            System.out.println(rand1);
        }

    }
}
// 두 가지 경우를 어떻게 출력해야 하나 생각을 하게 되었습니다. 그리고 if문을 생각하게 되었고
//else 사용하면 첫음 조건과 반대에 경우 모두 나오기에 검새을 후 else if 로 조건을 두개로 지정해서 문제를 풀었습니다.
