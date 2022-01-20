public class Q4 {
    public static void main(String[] args) {
        //학생의 수 30명. final int ARRMAX = 30;
        // int arr [] = new int[ARRMAX];
        //모든 학생이 60점 미만이 없다.
        //final int MAX = 100; final int MIN = 60;int range = MAX-MIN+1
        //학생들의 점수를 임의로 배치
        //for(;int cnt<=30; cnt++)
        //randIdx = (int)(Math.random()*ARRMAX);
        //arr[randIdx] = (int)(Math.random()*range+MIN)
        //soutf("학생 : %d, arr[randIdx]=%d\n",randIdx,arr[randIdx]);
        final int ARRMAX = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN + 1;
        int[] arr = new int[ARRMAX];

        int randIdx, cnt = 1;

        int sum = 0;

            for (cnt = 1; cnt <= 30; cnt++) {
                randIdx = (int) (Math.random() * ARRMAX);
                arr[randIdx] = (int) (Math.random() * range + MIN);
                System.out.printf("학생 : %d, arr[randIdx]=%d\n", randIdx, arr[randIdx]);
                sum += arr[randIdx];
            }

            System.out.println("평균:" + sum / ARRMAX);
        }
    }
            // 학생 번호가 중복되지 않게 하려면 어떻게 해야 하는가??
