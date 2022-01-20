public class Homework3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        /*
        1.당첨 번호가 나와있는 로또 배열을 만든다.
        2.로또 번호를 반복문과 중복을 제거하는 반복문을 만들어서 번호를 출력한다.
        3.출력된 번호와 당첨 번호가 같은지 비교한다.
        4.비교한 번호가 맞을 경우 당첨이라고 한다.
        5.이후 잘 모르겠습니다.
         */

        int lucky[];
        lucky = new int[]{1, 4, 13, 29, 38, 39}; //당첨 번호를 만든다.

            int lotto[] = new int[6];
            // 번호 생성
            for (int i = 0; i < 6; i++) {
                lotto[i] = (int) (Math.random() * 45) + 1;

                // 중복 번호 제거
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }
            System.out.print("로또 번호: ");

            // 번호 출력
            for (int i = 0; i < 6; i++) {
                System.out.print(lotto[i] + " ");
            }
        }
    }
