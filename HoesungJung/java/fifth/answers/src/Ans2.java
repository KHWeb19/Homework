import java.math.BigInteger;
import java.util.Scanner;
public class Ans2 {
    public static void main(String[] args) {
        ////전체에 영향을 미칠 상수 START_IDX를 초기화
        final int START_IDX = 0;
        ////아주 큰 수를 다룰 예정이기 때문에 BigInteger를 소환하고,

        ////전체에 영향을 미칠 상수 BASE를 "2"라는 객체로 만듦.
        ////(사실 이 부분을 제대로 이해하고 있는지 모름.)

        final BigInteger BASE = new BigInteger("2");

        ////스캐너로 입력받을 것에 대한 정보(?)
        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");
        ////Scanner 클래스의 객체를 생성
        Scanner scan = new Scanner(System.in);
        ////입력받을 내용을 idx로 저장
        int idx = scan.nextInt();
        ////Biginteger 변수 seq를 생성
        ////변수 seq를 입력받는 값으로 초기화
        BigInteger[] seq = new BigInteger[idx];
        ////seq의 배열을 START_IDX 만큼 생성하는데

        ////그 배열을 "1"이라는 객체롤 만듦.
        ////(이 부분 또한 제대로 이해하고 있는 건지 모름.)

        seq[START_IDX] = new BigInteger("1");
        ////START_IDX를 i로 초기화시키고(+1은 왜 하는지 모름)
        ////i는 idx보다 입력받은 값 idx보다 작으며
        ////한 번 출력후 1씩 증가되어 출력
        for (int i = START_IDX + 1; i < idx; i++) {
            ////입력한 수 i만큼의 배열을 생성하는데

            ////(multiply의 정확한 용도를 모름.)
            seq[i] = seq[i - 1].multiply(BASE);
            ////그 결과 i번째 항은 seq의 i번째 배열열
            System.out.println("seq[" + i +"] = " + seq[i]);
        }
    }
}
