public class HealthProfile {
    /**

     * @author Ebrahim Shahid

     */

    private String firstname;
    private String secondname;
    private String DOB;
    private int day;
    private int month;
    private int year;
    private int weight;
    private int height;
    private String gender;

    public HealthProfile(String firstname, String secondname, int day, int month, int year,int weight,int height,String gender) {
        this.setFirstname(firstname);
        this.setSecondname(secondname);
        this.setDOB(day, month, year);
        this.setWeight(weight);
        this.setHeight(height);
        this.setGender(gender);
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(int day,int month,int year) {
        this.day=day;
        this.month=month;
        this.year=year;
        DOB = this.day+" "+this.month+" "+this.year;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double BMI(){
        this.getWeight();
        this.getHeight();
        double bmi=(getWeight()*703)+(getHeight()*getHeight());
        return bmi;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int age(){
        int age=2013-this.year;
        return age;
    }

    public double MaxHeartRate(){
        int range=age()-220;
        return range;
    }

    public double TargetHeartRate(){
        int range=(50/100)-(80/100);
        double target=range*MaxHeartRate();
        return target;
    }
}