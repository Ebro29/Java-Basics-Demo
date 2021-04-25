
public class EmployeeTest {
    /**

     * @author Ebrahim Shahid

     */
    public static void main(String[] args) {


        //Create two instances of Employee class
        Employee emp1 = new Employee("George", "Washington", 12000);
        Employee emp2 = new Employee("Donald", "Trump", 10000);
        final int NUMBER_OF_MONTHS = 12;

        //print yearly salary
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName() + "  yearly salary is $ %5.2f \n",
                emp1.getMonthlySalary() * NUMBER_OF_MONTHS);
        System.out.printf(emp2.getFirstName() + " " + emp2.getLastName() + "  yearly salary is $ %5.2f \n",
                emp2.getMonthlySalary() * NUMBER_OF_MONTHS);

        //print salary 10 % on monthly salary
        emp1.raiseSalary();
        emp2.raiseSalary();

        //print new yearly salary
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName() + " raised yearly salary is $ %5.2f \n",
                emp1.getMonthlySalary() * NUMBER_OF_MONTHS);
        System.out.printf(emp2.getFirstName() + " " + emp2.getLastName() + " raised yearly salary is $ %5.2f \n",
                emp2.getMonthlySalary() * NUMBER_OF_MONTHS);

    }
}