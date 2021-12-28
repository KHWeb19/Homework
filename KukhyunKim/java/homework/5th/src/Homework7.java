public class Homework7 {
    public static void main(String[] args) {
        /*
        7. 회사에 직원이 7명이 있습니다.
           모두 입사동기로 3500만원으로 시작하였다고 합니다.
           각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
           이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.
         */

        /*
        1. 7개의 인덱스설정 회사원 1~7
        2. 엘맅먼트를 모두 3500에시작
        3. 1회 반복문 시전시 인덱스마다 1.1배~1.01배의 배율 할당
        4. 5번의 반복문 시행후 각 인덱스들의 연봉값 출력
         */

        /*
        1. 인덱스 7개 설정
        final int MAX = 7;

            for (int i = 0; i < MAX; i++) {
                arr[i] = 3500;
                System.out.printf("arr[%d]=%d\n", i, arr[i]);
            }
         2. 나온결과값 for문으로 1.1~1.01배 반복문 5회 설정
          int Start = 1;
          int End = 5;
          int Remain = 0;

          int Max = 1.10;
          int Min = 1.01;
          int Range = Max - Min + 1.00;

* [0]~[6]까지 인덱스들을 for문안에 어떻게 넣어야하지..?
         for (int i= Start ; i<=End; i++ ){

         }
         */
        }
    }

