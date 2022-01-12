public class EmployeeManager {
    Employee[] empArr;

    public EmployeeManager( final float firstPay, final int num){
        empArr = new Employee[num];

        for(int i = 0; i< num; i++){
            empArr[i] = new Employee(firstPay);
        }
    }

    public void paymentSimulation(int year){
        for( int i =0; i < year; i++){

        }
    }
}
