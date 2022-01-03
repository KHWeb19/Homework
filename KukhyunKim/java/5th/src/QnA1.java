public class QnA1 {
    public static void main(String[] args) {
        // 1. 1~100 까지의 숫자를 순회한다 <- for문을 사용하여 1~100까지를 순회시킨다.
        // 2. 2~10 사이의 랜덤한 숫자를 선택 <- min=3, max=10값을 넣어준다.
        // 3. range = max-min+1로 범위를 넣어주고
        // 4. for문에 rand = Math.random()*range+min으로 하여 랜덤 숫자를 굴려준다.
        // 5. 배수를 찾는게 아닌 랜덤한 숫자가 나온만큼만 이동해야 하므로
        // 6. for(i=start; i<=max; i+=rand)로 for문을 만들어준다 마지막 i+=rand로 해야 숫자가
        // 7. sum을 만들어 sum +=i 로하여 이동했을때 나온 숫자들의 합을 계산해준다.

        int rand; // 5번 6번
        int sum = 0; // 7번

        //for (int i = 1; i <= 100; i++) { // for문을 사용하여 1~100까지를 순회시킨다.
        for (int i = 1; i <= 100; i += rand) {  // 6번 라인 i += rand
            rand = (int) (Math.random() * 9 + 2); // rand 값 생성 (2, 3, 4라인)

            sum += i;   // 7번 라인

            // 부가적 출력
            System.out.printf("현재 i값: %d, sum값: %d\n", i, sum);
        }
    }
}
