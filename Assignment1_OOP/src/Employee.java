
public class Employee {
    /**

     * @author Ebrahim Shahid

     */

    private String firstName;
    private String lastName;
    private double monthlySalary;

    //constructor to set class variables
    public Employee(String firstName,String lastName,
                    double monthlySalary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
    }
    //Setter methods of class instace variables
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary=monthlySalary;
    }

    public void raiseSalary()
    {
        monthlySalary=monthlySalary+monthlySalary+0.10;
    }

    //Getter methods of class instace variables
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }
}//end of Employee class