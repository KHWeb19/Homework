public class EmployeeManager {
    Employee[] empArr;

    public EmployeeManager (final float firstPay, final int num) {
        empArr = new Employee[num];

        for (int i = 0; i < num; i++) {
            empArr[i] = new Employee(firstPay);
        }
    }

    public void allocEmpIncRatio (int year) {
        for (int i = 0; i < empArr.length; i++) {
            empArr[i].allocIncRatio(year);
        }
    }

    public void calcPayment (int year) {
        for (int i = 0; i < empArr.length; i++) {
            empArr[i].calcPayment(year);
        }
    }

    public void paymentSimulation (int year) {

        allocEmpIncRatio(year);
        calcPayment(year);
    }
}
