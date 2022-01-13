public class Bank3Ans7ClassTest {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager(35000000, 7);

        // EmployeeManager
        // Employee

        // 둘이 나누는 이유는 뭘까..?
        // -> 똑같은 배열을 사용해야하는데 넣어줘야하는게 달라서
        // -> 호출하고 실행하는걸 나눈다고 생각하면 될까..

        // 1. 배열에 초봉 입력.
        // 2. 랜덤으로 확률 정하기.
        // 3. 확률값을 통해서 연봉 상승 후 값 넣어주고 출력하기

        // 똑같은 배열을 이용할것.
        // 메소드는
        // 멤버만큼 반복해 초봉넣어주기 -- 1
        // 멤버만큼 반복해 확률정하기 ---- 2
        // 멤버만큼 반복해 연봉 상승값 넣기 -- 3

        // 위에가 전부 지정 년도만큼 반복을 해야함.

        // 멤버만큼 반복하기 하나, 년도만큼 반복하기 하나 해서 나누기..?


        em.paymentSimulation(5);
    }
}
