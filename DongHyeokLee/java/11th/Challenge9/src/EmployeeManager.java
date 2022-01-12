public class EmployeeManager {

    //연차에 따른 연봉 인상률과 연봉이 구해짐
    // 각 인원에 따라 연봉 인상률과 연봉

    Employee[] employee;

    //생성자엔 초기화
    public EmployeeManager(final float firstpay, final int employeeNum) {
        employee = new Employee[employeeNum];

        for (int i = 0; i < employeeNum; i++) {
            employee[i] = new Employee(firstpay);
        }
    }

    //배열에 Employee 클래스로 객체를 선언 함으로써
    //각 배열에 대한 연봉률 , 연차에 따른 연봉을 구할 수 있는것 같음
    // 그래서 알아보기도 좋은듯??
    // 이렇게 내가 짤 수 있을라나...
    public void empIncRatio(int year) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].allocIncRatio(year);
        }
    }

    public void calcPayment(int year) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].calcPayment(year);
        }
    }

    public void paymentSimulation(int year) {

        empIncRatio(year);
        calcPayment(year);
    }
}