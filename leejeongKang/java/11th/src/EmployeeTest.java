public class EmployeeTest {
    public static void main(String[] args) {
        //Employee ep = new Employee(35000000);
       // ep.allocIntRatio(5);
        //ep.calcPayment(5);

        EmployeeManager em = new EmployeeManager(3500,7);
        em.paymentSimulation(5);
    }
}
