public class EmployeeManager {
    Employee [] empArr;

    public EmployeeManager (final float firstpay, final int num){
        empArr = new Employee[num];

        for ( int i=0; i< num; i++){
            empArr[i] = new Employee(firstpay);
        }
    }

    public void aloocEmpIncRatio (int year){
        for (int i=0; i< empArr.length; i++){
            empArr[i].allocIntRatio(year);
        }
    }

    public void calcPayment (int year){
        for (int i =0; i< empArr.length; i++){
            empArr[i].calcPayment(year);
        }
    }

    public void paymentSimulation (int year){
        aloocEmpIncRatio(year);
        calcPayment(year);
    }
}
