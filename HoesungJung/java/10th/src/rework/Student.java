import java.util.Scanner;
public class Student {

    int MathScore;
    int EngScore;
    int KorScore;
    float mean;
    float var1;
    float var2;
    float var3;
    float stde;

    int arr[] = new int[3];
    int sum = 0;

    Scanner sc = new Scanner(System.in);

    public void Math() {
        System.out.println("수학 점수를 입력하세요.");
        MathScore = sc.nextInt();
        System.out.print("수학 : " + MathScore);
        System.out.println();
    }

    public void Eng() {
        System.out.println("영어 점수를 입력하세요.");
        EngScore = sc.nextInt();
        System.out.print("영어 : " + EngScore);
        System.out.println();
    }

    public void Kor() {
        System.out.println("국어 점수를 입력하세요.");
        KorScore = sc.nextInt();
        System.out.print("국어 : " + KorScore);
        System.out.println();
    }

    public float Mean() {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = MathScore+EngScore+KorScore;
            sum = arr[i];
        }
        mean = sum / (float)arr.length;

        return mean;
    }

    public float Var1() {

        var1 =(float) (Math.pow((mean - MathScore), 2)) / arr.length;
            return var1;}

    public float Var2() {
            var2 =(float) (Math.pow((mean - EngScore), 2)) / arr.length;
            return var2;  }

    public float Var3() {
        var3 =(float) (Math.pow((mean - KorScore), 2)) / arr.length;
        return var3;}

    public float StDe() {
        stde = (float)(Math.sqrt((var1+var2+var3)/arr.length));
        return stde;
    }

    }




